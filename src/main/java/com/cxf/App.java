package com.cxf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Hello world!
 * 将APP启动类当成一个自动化可配置的bean，并且能够开启整个工程内基于SpringBoot的自动化配置
 */
//作为springboot启动类
@SpringBootApplication
//在目录下面的接口都将生成对应的实现类
@MapperScan("com.cxf")
//开启定时任务模式
@EnableScheduling
public class App {

    public static void main(String [] args){
        SpringApplication.run(App.class, args);
    }
}
