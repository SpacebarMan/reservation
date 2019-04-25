package com.cxf.utils;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;

public class RequestUtil {
    private static final String msg= "</MessageHeader>";
    private static final String req= "</Request>";

    public static String checkRequestXml(String xml){
        xml = xml.substring(xml.indexOf(msg) + msg.length(),xml.indexOf(req));
        if(validateXML(xml)){
            return xml;
        }else {
            return Response.exception("xml格式不对");
        }
    }



    public static boolean validateXML(String xmlStr) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            builder.parse( new InputSource( new StringReader( xmlStr )));
        } catch (IOException | SAXException | ParserConfigurationException e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        }
        return true;
    }
}
