package com.cxf.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ResourceInfo")
public class OrderStatus {
    private String hosOrgCode;
    private String orderId;
    private String orderStatus;
    private String payState;
    private String cancelDate;
    private String replaceDoctorID;
    private String replaceDoctorName;

    public String getHosOrgCode() {
        return hosOrgCode;
    }

    public void setHosOrgCode(String hosOrgCode) {
        this.hosOrgCode = hosOrgCode;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState;
    }

    public String getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getReplaceDoctorID() {
        return replaceDoctorID;
    }

    public void setReplaceDoctorID(String replaceDoctorID) {
        this.replaceDoctorID = replaceDoctorID;
    }

    public String getReplaceDoctorName() {
        return replaceDoctorName;
    }

    public void setReplaceDoctorName(String replaceDoctorName) {
        this.replaceDoctorName = replaceDoctorName;
    }
}
