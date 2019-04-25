package com.cxf.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ReplaceScheduleInfo {
    private String hosOrgCode;
    private String scheduleId;
    private String numSourceId;
    private String oneDeptCode;
    private String deptCode;
    private String orderType;
    private String resourceCode;
    private String resourceName;
    private String replaceDoctCode;
    private String replaceDoctName;
    private String replaceReason;

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

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getReplaceDoctCode() {
        return replaceDoctCode;
    }

    public void setReplaceDoctCode(String replaceDoctCode) {
        this.replaceDoctCode = replaceDoctCode;
    }

    public String getReplaceDoctName() {
        return replaceDoctName;
    }

    public void setReplaceDoctName(String replaceDoctName) {
        this.replaceDoctName = replaceDoctName;
    }

    public String getReplaceReason() {
        return replaceReason;
    }

    public void setReplaceReason(String replaceReason) {
        this.replaceReason = replaceReason;
    }
}
