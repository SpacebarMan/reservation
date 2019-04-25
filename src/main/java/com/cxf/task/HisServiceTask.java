package com.cxf.task;

import com.cxf.config.HosInfo;
import com.cxf.entity.Rule;
import com.cxf.dao.BasicInfoDaoMapper;
import com.cxf.entity.*;
import com.cxf.utils.JaXmlBeanUtil;
import com.cxf.utils.ReqMessageHeader;
import com.wondersgroup.qyws.AppointmentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBException;
import java.util.List;

/**
 * His的定时调用任务
 */
@Component
@ConfigurationProperties(prefix = "HisTask")
@PropertySource(value = "classpath:application-task.yml",encoding = "UTF-8",ignoreResourceNotFound = true)
public class HisServiceTask {
    @Autowired
    private AppointmentServer soap;
    @Autowired
    private ReqMessageHeader reqMessageHeader;
    @Autowired
    private HosInfo hosInfo;
    @Autowired
    private BasicInfoDaoMapper basicInfoDaoMapper;

    @Value("${isStartJob}")
    private boolean isStartJob;

    /**
     *  定时上传医院信息
     */
    //开启异步调用模式
    @Async
    //定时任务使用文件地址中的节点
    @Scheduled(cron = "${upHospitalInfoServiceTaskJob}")
    public String upHospitalInfoService(){
        try {
            if (isStartJob) {
                String xml = reqMessageHeader.success(hosInfo);
                String result = soap.upHospitalInfoService(xml);
                System.out.println(result);
                return result;
            }
        } catch (JAXBException e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return null;
    }

    /**
     *  定时一级科室注册信息
     */
    //开启异步调用模式
    @Async
    //定时任务使用文件地址中的节点
    @Scheduled(cron = "${upDeptInfoTopServiceTaskJob}")
    public String upDeptInfoTopService(){
        try {
            if (isStartJob) {
                List<DeptInfoTop> deptInfoTopList = basicInfoDaoMapper.upDeptInfoTopService();
                StringBuffer sb = new StringBuffer("<List>");
                for (DeptInfoTop deptInfoTop : deptInfoTopList) {
                    sb.append(JaXmlBeanUtil.parseBeanToXml(DeptInfoTop.class,deptInfoTop));
                }
                sb.append("</List>");
                String xml = reqMessageHeader.success(sb);
                String result = soap.upDeptInfoTopService(xml);
                System.out.println(result);
                return result ;
            }
        } catch (JAXBException e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return null;
    }


    /**
     *  定时二级科室注册信息
     */
    //开启异步调用模式
    @Async
    //定时任务使用文件地址中的节点
    @Scheduled(cron = "${upDeptInfoTwoServiceTaskJob}")
    public String upDeptInfoTwoService(){
        try {
            if (isStartJob) {
                List<DeptInfoTwo> deptInfoTwoList = basicInfoDaoMapper.upDeptInfoTwoService();
                StringBuffer sb = new StringBuffer("<List>");
                for (DeptInfoTwo deptInfoTwo : deptInfoTwoList) {
                    sb.append(JaXmlBeanUtil.parseBeanToXml(DeptInfoTwo.class,deptInfoTwo));
                }
                sb.append("</List>");
                String xml = reqMessageHeader.success(sb);
                String result = soap.upDeptInfoTwoService(xml);
                System.out.println(result);
                return result;
            }
        } catch (JAXBException e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return null;
    }

    /**
     *  定时医生注册信息
     */
    //开启异步调用模式
    @Async
    //定时任务使用文件地址中的节点
    @Scheduled(cron = "${upDoctInfoServiceTaskJob}")
    public String upDoctInfoService(){
        try {
            if (isStartJob) {
                List<DoctInfo> doctInfoTopList = basicInfoDaoMapper.upDoctInfoService();
                StringBuffer sb = new StringBuffer("<List>");
                for (DoctInfo doctInfo : doctInfoTopList) {
                    sb.append(JaXmlBeanUtil.parseBeanToXml(DoctInfo.class,doctInfo));
                }
                sb.append("</List>");
                String xml = reqMessageHeader.success(sb);
                String result = soap.upDoctInfoService(xml);
                System.out.println(result);
                return result;
            }
        } catch (JAXBException e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return "";
    }


    /**
     *  定时规则注册信息
     */
    //开启异步调用模式
    @Async
    //定时任务使用文件地址中的节点
    @Scheduled(cron = "${upRuleInfoServiceTaskJob}")
    public String upRuleInfoService(){
        try {
            if (isStartJob) {
                List<Rule> ruleList = basicInfoDaoMapper.upRuleInfoService();
                StringBuffer sb = new StringBuffer("<List>");
                for (Rule rule : ruleList) {
                    sb.append(JaXmlBeanUtil.parseBeanToXml(Rule.class,rule));
                }
                sb.append("</List>");
                String xml = reqMessageHeader.success(sb);
                String result = soap.upRuleInfoService(xml);
                System.out.println(result);
                return result;
            }
        } catch (JAXBException e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return "";
    }

    /**
     *  门诊信息
     */
    //开启异步调用模式
    @Async
    //定时任务使用文件地址中的节点
    @Scheduled(cron = "${upOutPatInfoServiceTaskJob}")
    public String upOutPatInfoService(){
        try {
            if (isStartJob) {
                List<OutPatInfo> outPatInfos = basicInfoDaoMapper.upOutPatInfoService();
                StringBuffer sb = new StringBuffer("<List>");
                for (OutPatInfo outPatInfo : outPatInfos) {
                    sb.append(JaXmlBeanUtil.parseBeanToXml(OutPatInfo.class,outPatInfo));
                }
                sb.append("</List>");
                String xml = reqMessageHeader.success(sb);
                String result = soap.upOutPatInfoService(xml);
                System.out.println(result);
                return result;
            }
        } catch (JAXBException e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return "";
    }

    /**
     *  停诊上传
     */
    //开启异步调用模式
    @Async
    //定时任务使用文件地址中的节点
    @Scheduled(cron = "${upStopScheduleInfoServiceTaskJob}")
    public String upStopScheduleInfoService(){
        try {
            if (isStartJob) {
                List<StopScheduleInfo> stopScheduleInfos = basicInfoDaoMapper.upStopScheduleInfoService();
                StringBuffer sb = new StringBuffer("<List>");
                for (StopScheduleInfo stopScheduleInfo : stopScheduleInfos) {
                    sb.append(JaXmlBeanUtil.parseBeanToXml(StopScheduleInfo.class,stopScheduleInfo));
                }
                sb.append("</List>");
                String xml = reqMessageHeader.success(sb);
                String result = soap.upStopScheduleInfoService(xml);
                System.out.println(result);
                return result;
            }
        } catch (JAXBException e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return "";
    }

    /**
     *  替诊上传
     */
    //开启异步调用模式
    @Async
    //定时任务使用文件地址中的节点
    @Scheduled(cron = "${upReplaceScheduleInfoServiceTaskJob}")
    public String upReplaceScheduleInfoService(){
        try {
            if (isStartJob) {
                List<ReplaceScheduleInfo> replaceScheduleInfos = basicInfoDaoMapper.upReplaceScheduleInfoService();
                StringBuffer sb = new StringBuffer("<List>");
                for (ReplaceScheduleInfo replaceScheduleInfo : replaceScheduleInfos) {
                    sb.append(JaXmlBeanUtil.parseBeanToXml(ReplaceScheduleInfo.class,replaceScheduleInfo));
                }
                sb.append("</List>");
                String xml = reqMessageHeader.success(sb);
                String result = soap.upReplaceScheduleInfoService(xml);
                System.out.println(result);
                return result;
            }
        } catch (JAXBException e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return "";
    }


    /**
     *  预约状态更更新
     */
    //开启异步调用模式
    @Async
    //定时任务使用文件地址中的节点
    @Scheduled(cron = "${upOrderStatusServiceTaskJob}")
    public String upOrderStatusService(){
        try {
            if (isStartJob) {
                List<OrderStatus> orderStatuses = basicInfoDaoMapper.upOrderStatusService();
                StringBuffer sb = new StringBuffer("<List>");
                for (OrderStatus orderStatus : orderStatuses) {
                    sb.append(JaXmlBeanUtil.parseBeanToXml(OrderStatus.class,orderStatus));
                }
                sb.append("</List>");
                String xml = reqMessageHeader.success(sb);
                String result = soap.upOrderStatusService(xml);
                System.out.println(result);
                return result;
            }
        } catch (JAXBException e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return "";
    }




}
