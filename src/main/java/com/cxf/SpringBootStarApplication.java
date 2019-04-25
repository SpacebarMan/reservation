package com.cxf;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 打包时需要的类
 */
public class SpringBootStarApplication extends SpringBootServletInitializer {
    //打包时,将注释去除,其余时间,添加至上面

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(App.class);
//    }

}
