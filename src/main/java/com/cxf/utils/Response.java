package com.cxf.utils;


public class Response {

    public static String success(Object bean){
        StringBuffer request = new StringBuffer();
        request.append("<Request>");
        request.append("<MessageHeader>");
        request.append("<code>0</code>");
        request.append("<desc>成功</desc>");
        request.append("</MessageHeader>");
        request.append(bean.toString());
        request.append("</Request>");
        return request.toString();
    }


    public static String exception(String msg) {
        StringBuffer request = new StringBuffer();
        request.append("<Request>");
        request.append("<MessageHeader>");
        request.append("<code>1</code>");
        request.append("<desc>"+msg+"</desc>");
        request.append("</MessageHeader>");
        request.append("</Request>");
        return request.toString();
    }



}
