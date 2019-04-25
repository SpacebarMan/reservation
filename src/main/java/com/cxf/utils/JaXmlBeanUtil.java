package com.cxf.utils;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class JaXmlBeanUtil {

    private final static String BENGININDEXSTR = "</MessageHeader>";
    private final static String ENDINDEXSTR = "</Request>";

    /**
     * 将javaBean转换为xml对象
     * @param clazz
     * @param bean
     * @return
     */
    public static String parseBeanToXml(Class clazz,Object bean) throws JAXBException{
        JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        StringWriter sw = new StringWriter();
        //该值默认为false,true则不会创建即头信息,即<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
        jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        jaxbMarshaller.marshal(bean, sw);
        return sw.toString();
    }

    /**
     * XML转换成实体类
     * @param clatt
     * @param xml
     * @param <T>
     * @return
     * @throws JAXBException
     */
    public static <T> T xmlToBean(Class<T> clatt, String xml) throws JAXBException,IOException,SAXException ,ParserConfigurationException {
        String result = checkRequestXml(xml);
        if( result != null){
            JAXBContext context = JAXBContext.newInstance(clatt);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            T t = (T)unmarshaller.unmarshal(new StringReader(result));
            return t;
        }
        return null;
    }



    public static String checkRequestXml(String xml)throws IOException,SAXException ,ParserConfigurationException {
        xml = xml.substring(xml.indexOf(BENGININDEXSTR) + BENGININDEXSTR.length(),xml.indexOf(ENDINDEXSTR));
        if(validateXML(xml)){
            return xml;
        }else {
            return null;
        }
    }



    public static boolean validateXML(String xmlStr) throws IOException,SAXException ,ParserConfigurationException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        builder.parse( new InputSource( new StringReader( xmlStr )));
        return true;
    }


}
