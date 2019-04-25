package com.cxf.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name="BsoftServices", targetNamespace="http://schemas.xmlsoap.org/soap/encoding")
public interface BsoftServices {

    @WebMethod(operationName = "GetOrderNumInfoService" )
    @WebResult(name="responsetMsg")
    @SOAPBinding(style= SOAPBinding.Style.RPC)
    String getOrderNumInfoService(@WebParam(name="requestMsg")String requestMsg) ;


    @WebMethod(operationName = "SubmitOrderByUserInfoService" )
    @WebResult(name="responsetMsg")
    @SOAPBinding(style= SOAPBinding.Style.RPC)
    String submitOrderByUserInfoService(@WebParam(name="requestMsg")String requestMsg);


    @WebMethod(operationName = "GetOrderListService" )
    @WebResult(name="responsetMsg")
    @SOAPBinding(style= SOAPBinding.Style.RPC)
    String getOrderListService(@WebParam(name="requestMsg")String requestMsg) ;


    @WebMethod(operationName = "GetOrderDetailInfoService" )
    @WebResult(name="responsetMsg")
    @SOAPBinding(style= SOAPBinding.Style.RPC)
    String getOrderDetailInfoService(@WebParam(name="requestMsg")String requestMsg);

    @WebMethod(operationName = "CheckPatientInfoService" )
    @WebResult(name="responsetMsg")
    @SOAPBinding(style= SOAPBinding.Style.RPC)
    String checkPatientInfoService(@WebParam(name="requestMsg")String requestMsg) ;

    @WebMethod(operationName = "GetResourceDoctInfoService" )
    @WebResult(name="responsetMsg")
    @SOAPBinding(style= SOAPBinding.Style.RPC)
    String getResourceDoctInfoService(@WebParam(name="requestMsg")String requestMsg) ;


    @WebMethod(operationName = "GetResourceOutPatInfoService" )
    @WebResult(name="responsetMsg")
    @SOAPBinding(style= SOAPBinding.Style.RPC)
    String getResourceOutPatInfoService(@WebParam(name="requestMsg")String requestMsg);


    @WebMethod(operationName = "OrderCancelInfoService" )
    @WebResult(name="responsetMsg")
    @SOAPBinding(style= SOAPBinding.Style.RPC)
    String orderCancelInfoService(@WebParam(name="requestMsg")String requestMsg);


}
