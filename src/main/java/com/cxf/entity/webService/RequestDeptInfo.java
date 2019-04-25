package com.cxf.entity.webService;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DeptInfo")
public class RequestDeptInfo {
    private String hosOrgCode;
    private String oneDeptCode;
    private String deptCode;

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
}
