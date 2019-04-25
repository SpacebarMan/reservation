package com.cxf.entity.webService;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NumSourceInfo")
public class ResponseNumSourceInfo {
    private String hosOrgCode;
    private String scheduleId;
    private String numSourceId;
    private String orderType;
    private String resourceCode;
    private String hosName;
    private String oneDeptName;
    private String deptName;
    private String resourceName;
    private String visitCost;
    private String scheduleDate;
    private String timeRange;
    private String startTime;
    private String endTime;
    private String remainNum;
    private String reserveOrderNum;
    private String orderNumType;

    public String getHosOrgCode() {
        return hosOrgCode;
    }

    public void setHosOrgCode(String hosOrgCode) {
        this.hosOrgCode = hosOrgCode;
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

    public String getVisitCost() {
        return visitCost;
    }

    public void setVisitCost(String visitCost) {
        this.visitCost = visitCost;
    }

    public String getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
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

    public String getRemainNum() {
        return remainNum;
    }

    public void setRemainNum(String remainNum) {
        this.remainNum = remainNum;
    }

    public String getReserveOrderNum() {
        return reserveOrderNum;
    }

    public void setReserveOrderNum(String reserveOrderNum) {
        this.reserveOrderNum = reserveOrderNum;
    }

    public String getOrderNumType() {
        return orderNumType;
    }

    public void setOrderNumType(String orderNumType) {
        this.orderNumType = orderNumType;
    }
}
