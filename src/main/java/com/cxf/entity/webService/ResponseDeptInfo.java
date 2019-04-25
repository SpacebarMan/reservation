package com.cxf.entity.webService;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ResourceInfo")
public class ResponseDeptInfo {
    private String hosOrgCode;
    private String oneDeptCode;
    private String deptCode;
    private String resourceCode;
    private String hosName;
    private String oneDeptName;
    private String deptName;
    private String resourceName;
    private String outPatInfo;
    private String indexNo;
    private String isResource;

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

    public String getOutPatInfo() {
        return outPatInfo;
    }

    public void setOutPatInfo(String outPatInfo) {
        this.outPatInfo = outPatInfo;
    }

    public String getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo;
    }

    public String getIsResource() {
        return isResource;
    }

    public void setIsResource(String isResource) {
        this.isResource = isResource;
    }
}
