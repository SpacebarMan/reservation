package com.cxf.dao;

import com.cxf.entity.webService.*;


import java.util.List;

public interface BsoftDaoMapper {
    List<ResponseNumSourceInfo> getOrderNumInfoService(RequestNumSourceInfo numSourceInfo);
    Integer submitOrderByUserInfoService(RequestOrderInfo requestOrderInfo);
    Integer orderCancelInfoService(RequestOrderCancelInfo requestOrderCancelInfo);
    List<ResponseOrderList> getOrderListService(RequestOrderList requestOrderList);
    ResponseQueryOrderInfo getOrderDetailInfoService(RequestQueryOrderInfo  requestQueryOrderInfo);
    List<ResponseDoctorInfo> getResourceDoctInfoService(RequestDeptInfo requestDeptInfo);
    List<ResponseDeptInfo> getResourceOutPatInfoService(RequestDeptInfo requestDeptInfo);
    String queryBridByID(RequestOrderInfo requestOrderInfo);
}
