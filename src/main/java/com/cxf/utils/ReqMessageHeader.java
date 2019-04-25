package com.cxf.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Component
@XmlRootElement(name = "MessageHeader")
@XmlType(propOrder = { "accessAccount", "sign"})
@ConfigurationProperties(prefix = "MessageHeader")
@PropertySource(value = "classpath:application-HosInfoConfig.yml",encoding = "UTF-8")
public class ReqMessageHeader {
    @Value("${accessAccount}")
    private String accessAccount;

    @Value("${sign}")
    private String sign;

    public String success(Object bean) throws JAXBException {
        StringBuffer request = new StringBuffer();
        request.append("<Request>");
        request.append(JaXmlBeanUtil.parseBeanToXml(ReqMessageHeader.class,this));
        request.append(bean.toString());
        request.append("</Request>");
        return request.toString();
    }

    public String cancellSuccess(){
        StringBuffer sb = new StringBuffer();
        sb.append("<Response>");
        sb.append("<MessageHeader>");
        sb.append("<code>0</code>");
        sb.append("<desc>撤销成功</desc>");
        sb.append("</MessageHeader>");
        sb.append("</Response>");
        return sb.toString();
    }

    public String getAccessAccount() {
        return accessAccount;
    }

    public void setAccessAccount(String accessAccount) {
        this.accessAccount = accessAccount;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }


}
