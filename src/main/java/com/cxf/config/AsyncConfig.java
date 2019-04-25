package com.cxf.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * 启动spring中的ThreadPoolTaskExecutor线程池
 */
//声明此类是springboot的配置信息类
@Configuration
//整个项目开启异步定时任务模式
@EnableAsync
//配置的文件中节点的开头
@ConfigurationProperties(prefix = "AsyncConfig")
//配置文件的地址,以及编码解析
@PropertySource(value = "classpath:application-task.yml",encoding = "UTF-8")
public class AsyncConfig {
    //读取节点下面的子节点
    @Value("${corePoolSize}")
    private int corePoolSize;
    @Value("${maxPoolSize}")
    private int maxPoolSize;
    @Value("${queueCapacity}")
    private int queueCapacity;

    @Value("${keepAliveSeconds}")
    private int keepAliveSeconds;

    //声明此方法是创建springboot的一个组件bean
    @Bean
    public Executor taskExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(corePoolSize);
        executor.setMaxPoolSize(maxPoolSize);
        executor.setQueueCapacity(queueCapacity);
        executor.setKeepAliveSeconds(keepAliveSeconds);
        executor.initialize();
        return executor;
    }

}
