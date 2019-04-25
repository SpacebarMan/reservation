package com.cxf.entity.webService;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OrderInfo")
public class RequestOrderInfo {
    private String yyxh;            //主键预约序号
    private String hosOrgCode;
    private String oneDeptCode;
    private String deptCode;
    private String orderType;
    private String resourceCode;
    private String channelCode;
    private String scheduleId;
    private String numSourceId;
    private String payMode;
    private String patient_type;
    private String patient_id;
    private String mediCardId;
    private String mediCardType;
    private String userCardType;
    private String userCardId;
    private String userName;
    private String userPhone;
    private String userSex;
    private String userBD;
    private String userContAdd;
    private String replaceUserCardType;
    private String replaceUserCardId;
    private String replaceUserName;
    private String ipAddr;
    private String macAddr;
    private String outHospitalCode;
    private String outOrderId;
    private String numSourceDate;
    private String startTime;
    private String endTime;
    private String platformType;
    private String platformCode;
    private String channelName;
    private String numSourceFrom;
    private String brid;

    public String getYyxh() {
        return yyxh;
    }

    public void setYyxh(String yyxh) {
        this.yyxh = yyxh;
    }

    public String getHosOrgCode() {
        return hosOrgCode;
    }

    public void setHosOrgCode(String hosOrgCode) {
        this.hosOrgCode = hosOrgCode;
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

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
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

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public String getPatient_type() {
        return patient_type;
    }

    public void setPatient_type(String patient_type) {
        this.patient_type = patient_type;
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

    public String getUserCardType() {
        return userCardType;
    }

    public void setUserCardType(String userCardType) {
        this.userCardType = userCardType;
    }

    public String getUserCardId() {
        return userCardId;
    }

    public void setUserCardId(String userCardId) {
        this.userCardId = userCardId;
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

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserBD() {
        return userBD;
    }

    public void setUserBD(String userBD) {
        this.userBD = userBD;
    }

    public String getUserContAdd() {
        return userContAdd;
    }

    public void setUserContAdd(String userContAdd) {
        this.userContAdd = userContAdd;
    }

    public String getReplaceUserCardType() {
        return replaceUserCardType;
    }

    public void setReplaceUserCardType(String replaceUserCardType) {
        this.replaceUserCardType = replaceUserCardType;
    }

    public String getReplaceUserCardId() {
        return replaceUserCardId;
    }

    public void setReplaceUserCardId(String replaceUserCardId) {
        this.replaceUserCardId = replaceUserCardId;
    }

    public String getReplaceUserName() {
        return replaceUserName;
    }

    public void setReplaceUserName(String replaceUserName) {
        this.replaceUserName = replaceUserName;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }

    public String getOutHospitalCode() {
        return outHospitalCode;
    }

    public void setOutHospitalCode(String outHospitalCode) {
        this.outHospitalCode = outHospitalCode;
    }

    public String getOutOrderId() {
        return outOrderId;
    }

    public void setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
    }

    public String getNumSourceDate() {
        return numSourceDate;
    }

    public void setNumSourceDate(String numSourceDate) {
        this.numSourceDate = numSourceDate;
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

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getNumSourceFrom() {
        return numSourceFrom;
    }

    public void setNumSourceFrom(String numSourceFrom) {
        this.numSourceFrom = numSourceFrom;
    }

    public String getBrid() {
        return brid;
    }

    public void setBrid(String brid) {
        this.brid = brid;
    }



}
