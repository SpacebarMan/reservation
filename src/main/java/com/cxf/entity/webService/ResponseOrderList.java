package com.cxf.entity.webService;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OrderInfo")
public class ResponseOrderList {
    private String orderId;
    private String hosOrgCode;
    private String orderStatus;
    private String oneDeptCode;
    private String deptCode;
    private String orderType;
    private String resourceCode;
    private String scheduleId;
    private String numSourceId;
    private String numSourceDetailId;
    private String hosName;
    private String oneDeptName;
    private String deptName;
    private String resourceName;
    private String orderTime;
    private String timeRange;
    private String startTime;
    private String endTime;
    private String payMode;
    private String payState;
    private String patient_id;
    private String mediCardId;
    private String mediCardType;
    private String userName;
    private String userPhone;
    private String applyDate;
    private String cancelDate;
    private String orderNumType;
    private String hosNumSourceId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getHosOrgCode() {
        return hosOrgCode;
    }

    public void setHosOrgCode(String hosOrgCode) {
        this.hosOrgCode = hosOrgCode;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOneDeptCode() {
        return oneDeptCode;
    }

    public void setOneDeptCode(String oneDeptCode) {
        this.oneDeptCode = oneDeptCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getNumSourceId() {
        return numSourceId;
    }

    public void setNumSourceId(String numSourceId) {
        this.numSourceId = numSourceId;
    }

    public String getNumSourceDetailId() {
        return numSourceDetailId;
    }

    public void setNumSourceDetailId(String numSourceDetailId) {
        this.numSourceDetailId = numSourceDetailId;
    }

    public String getHosName() {
        return hosName;
    }

    public void setHosName(String hosName) {
        this.hosName = hosName;
    }

    public String getOneDeptName() {
        return oneDeptName;
    }

    public void setOneDeptName(String oneDeptName) {
        this.oneDeptName = oneDeptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getMediCardId() {
        return mediCardId;
    }

    public void setMediCardId(String mediCardId) {
        this.mediCardId = mediCardId;
    }

    public String getMediCardType() {
        return mediCardType;
    }

    public void setMediCardType(String mediCardType) {
        this.mediCardType = mediCardType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getOrderNumType() {
        return orderNumType;
    }

    public void setOrderNumType(String orderNumType) {
        this.orderNumType = orderNumType;
    }

    public String getHosNumSourceId() {
        return hosNumSourceId;
    }

    public void setHosNumSourceId(String hosNumSourceId) {
        this.hosNumSourceId = hosNumSourceId;
    }
}
