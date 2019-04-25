package com.cxf.config;

import com.cxf.service.BsoftServices;
import com.cxf.service.impl.BsoftServicesImpl;
import com.wondersgroup.qyws.AppointmentServer;
import com.wondersgroup.qyws.AppointmentServer_Service;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

//声明为一个配置文件
@Configuration
public class BootConfig {
    //创建一个调用万达的webservice的Bean
    @Bean
    public AppointmentServer webService(){
        return new AppointmentServer_Service().getYyzlWebServiceImplPort();
    }

    //
    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    //创建万达调用的webservicebean
    @Bean
    public BsoftServices bsoftServices(){
        return new BsoftServicesImpl();
    }

    //发布his调用的webservice,路径为[/bsoftService]
    @Bean
    public Endpoint serviceEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), bsoftServices());
        endpoint.publish("/bsoftService");
        return endpoint;
    }


}
