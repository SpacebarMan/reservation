package com.cxf.aspect;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    private final static Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut(value = "execution(public * com.cxf.service.impl.BsoftServicesImpl..*(..))")
    public void log(){ }

    @Around(value = "log()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        Object obj = null;
        StringBuilder sbLog = new StringBuilder("\n");
        try {
            sbLog.append(String.format("类名：%s\r\n", proceedingJoinPoint.getTarget().getClass().getName()));
            MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
            sbLog.append(String.format("方法：%s\r\n", methodSignature.getMethod().getName()));
            Object[] args = proceedingJoinPoint.getArgs();
            for (Object o : args) {
                sbLog.append(String.format("参数：%s\r\n", JSON.toJSON(o)));
            }
            long startTime = System.currentTimeMillis();
            obj = proceedingJoinPoint.proceed();
            long endTime = System.currentTimeMillis();
            sbLog.append(String.format("返回：%s\r\n", JSON.toJSON(obj)));
            sbLog.append(String.format("耗时：%ss", endTime - startTime));
        } catch (Exception ex) {
            sbLog.append(String.format("异常：%s", ex.getMessage()));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            sbLog.append(String.format("异常：%s", throwable.getMessage()));
        } finally {
            LOGGER.info(sbLog.toString());
        }
        return obj;
    }
}
