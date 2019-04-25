package com.cxf.service.impl;

import com.cxf.config.HosInfo;
import com.cxf.dao.BsoftDaoMapper;
import com.cxf.entity.webService.*;
import com.cxf.utils.ReqMessageHeader;
import com.cxf.utils.Response;
import com.cxf.service.BsoftServices;
import com.cxf.utils.JaXmlBeanUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.xml.sax.SAXException;

import javax.jws.WebService;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;


@WebService(serviceName="BsoftServices",
        targetNamespace="http://schemas.xmlsoap.org/soap/encoding",
        endpointInterface= "com.cxf.service.BsoftServices")
public class BsoftServicesImpl implements BsoftServices {

    @Autowired
    private BsoftDaoMapper bsoftDaoMapper;

    @Autowired
    private ReqMessageHeader reqMessageHeader;

    @Autowired
    private HosInfo hosInfo;


    @Override
    public String getOrderNumInfoService(String requestMsg){
        try {
            RequestNumSourceInfo numSourceInfo = JaXmlBeanUtil.xmlToBean(RequestNumSourceInfo.class ,requestMsg);
            List<ResponseNumSourceInfo> responseNumSourceInfos = bsoftDaoMapper.getOrderNumInfoService(numSourceInfo);
            StringBuffer sb = new StringBuffer("<List>");
            for (ResponseNumSourceInfo responseNumSourceInfo : responseNumSourceInfos) {
                sb.append(JaXmlBeanUtil.parseBeanToXml(ResponseNumSourceInfo.class,responseNumSourceInfo));
            }
            sb.append("</List>");
            String xml = reqMessageHeader.success(sb);
            return xml;
        } catch (JAXBException e) {
            e.printStackTrace();
            return Response.exception(e.getMessage());
        } catch (SAXException e) {
            e.printStackTrace();
            return Response.exception(e.getMessage());
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            return Response.exception(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            return Response.exception(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return Response.exception(e.getCause().getMessage());
        }
    }

    @Override
    public String submitOrderByUserInfoService(String requestMsg) {
        try {
            RequestOrderInfo requestOrderInfo = JaXmlBeanUtil.xmlToBean(RequestOrderInfo.class ,requestMsg);
            String brid = bsoftDaoMapper.queryBridByID(requestOrderInfo);
            requestOrderInfo.setBrid(brid);
            bsoftDaoMapper.submitOrderByUserInfoService(requestOrderInfo);
            ResponseOrderInfo responseNumSourceInfo = new ResponseOrderInfo(
                    hosInfo.getHosOrgCode(),requestOrderInfo.getYyxh(),
                    requestOrderInfo.getScheduleId());
            String xml = reqMessageHeader.success(JaXmlBeanUtil.parseBeanToXml(ResponseOrderInfo.class,responseNumSourceInfo));
            return xml;
        } catch (JAXBException e) {
            return Response.exception(e.getMessage());
        } catch (IOException e) {
            return Response.exception(e.getMessage());
        } catch (SAXException e) {
            return Response.exception(e.getMessage());
        } catch (ParserConfigurationException e) {
            return Response.exception(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return Response.exception(e.getCause().getMessage());
        }
    }


    @Override
    public String orderCancelInfoService(String requestMsg) {
        try {
            RequestOrderCancelInfo requestOrderCancelInfo = JaXmlBeanUtil.xmlToBean(RequestOrderCancelInfo.class ,requestMsg);
            String orderId = StringUtils.trimToNull(requestOrderCancelInfo.getOrderId());
            if(orderId != null){
                bsoftDaoMapper.orderCancelInfoService(requestOrderCancelInfo);
                return reqMessageHeader.cancellSuccess();
            }else {
                return Response.exception("orderId不能为空");
            }
        } catch (JAXBException e) {
            return Response.exception(e.getMessage());
        } catch (IOException e) {
            return Response.exception(e.getMessage());
        } catch (SAXException e) {
            return Response.exception(e.getMessage());
        } catch (Exception e) {
            return Response.exception(e.getCause().getMessage());
        }
    }

    @Override
    public String getOrderListService(String requestMsg) {
        try {
            RequestOrderList requestOrderList = JaXmlBeanUtil.xmlToBean(RequestOrderList.class ,requestMsg);
            List<ResponseOrderList> responseOrderLists = bsoftDaoMapper.getOrderListService(requestOrderList);
            StringBuffer sb = new StringBuffer("<List>");
            for (ResponseOrderList responseOrderList : responseOrderLists) {
                sb.append(JaXmlBeanUtil.parseBeanToXml(ResponseOrderList.class,responseOrderList));
            }
            sb.append("</List>");
            String xml = reqMessageHeader.success(sb);
            return xml;
        } catch (JAXBException e) {
            return Response.exception(e.getMessage());
        } catch (IOException e) {
            return Response.exception(e.getMessage());
        } catch (SAXException e) {
            return Response.exception(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return Response.exception(e.getCause().getMessage());
        }
    }

    @Override
    public String getOrderDetailInfoService(String requestMsg) {
        try {
            RequestQueryOrderInfo requestQueryOrderInfo = JaXmlBeanUtil.xmlToBean(RequestQueryOrderInfo.class ,requestMsg);
            ResponseQueryOrderInfo responseQueryOrderInfo = bsoftDaoMapper.getOrderDetailInfoService(requestQueryOrderInfo);
            String xml = reqMessageHeader.success(JaXmlBeanUtil.parseBeanToXml(ResponseQueryOrderInfo.class,responseQueryOrderInfo));
            return xml;
        } catch (JAXBException e) {
            return Response.exception(e.getMessage());
        } catch (IOException e) {
            return Response.exception(e.getMessage());
        } catch (SAXException e) {
            return Response.exception(e.getMessage());
        } catch (ParserConfigurationException e) {
            return Response.exception(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return Response.exception(e.getCause().getMessage());
        }
    }

    @Override
    public String checkPatientInfoService(String requestMsg){
        return "<Response><MessageHeader><code>0</code><desc>验证通过</desc></MessageHeader></Response>";
    }

    @Override
    public String getResourceDoctInfoService(String requestMsg) {
        try {
            RequestDeptInfo requestDeptInfo = JaXmlBeanUtil.xmlToBean(RequestDeptInfo.class ,requestMsg);
            List<ResponseDoctorInfo> responseDoctorInfos = bsoftDaoMapper.getResourceDoctInfoService(requestDeptInfo);
            StringBuffer sb = new StringBuffer("<List>");
            for (ResponseDoctorInfo responseDoctorInfo : responseDoctorInfos) {
                sb.append(JaXmlBeanUtil.parseBeanToXml(ResponseDoctorInfo.class,responseDoctorInfo));
            }
            sb.append("</List>");
            String xml = reqMessageHeader.success(sb);
            return xml;
        } catch (JAXBException e) {
            e.printStackTrace();
            return Response.exception(e.getMessage());
        } catch (SAXException e) {
            e.printStackTrace();
            return Response.exception(e.getMessage());
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            return Response.exception(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            return Response.exception(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return Response.exception(e.getCause().getMessage());
        }
    }

    @Override
    public String getResourceOutPatInfoService(String requestMsg) {
        try {
            RequestDeptInfo requestDeptInfo = JaXmlBeanUtil.xmlToBean(RequestDeptInfo.class ,requestMsg);
            List<ResponseDeptInfo> responseNumSourceInfos = bsoftDaoMapper.getResourceOutPatInfoService(requestDeptInfo);
            StringBuffer sb = new StringBuffer("<List>");
            for (ResponseDeptInfo responseNumSourceInfo : responseNumSourceInfos) {
                sb.append(JaXmlBeanUtil.parseBeanToXml(ResponseDeptInfo.class,responseNumSourceInfo));
            }
            sb.append("</List>");
            String xml = reqMessageHeader.success(sb);
            return xml;
        } catch (JAXBException e) {
            e.printStackTrace();
            return Response.exception(e.getMessage());
        } catch (SAXException e) {
            e.printStackTrace();
            return Response.exception(e.getMessage());
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            return Response.exception(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            return Response.exception(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return Response.exception(e.getCause().getMessage());
        }
    }



}
