package com.cxf.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ResourceInfo")
public class OutPatInfo {
    private String hosOrgCode;
    private String oneDeptCode;
    private String deptCode;
    private String resourceCode;
    private String resourceName;
    private String outPatInfo;
    private String isDelete;
    private String indexNo;

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

    public String getOutPatInfo() {
        return outPatInfo;
    }

    public void setOutPatInfo(String outPatInfo) {
        this.outPatInfo = outPatInfo;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo;
    }
}
