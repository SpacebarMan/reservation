package com.cxf.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DeptInfo")
public class DeptInfoTop {
    private String hosOrgCode;
    private String deptCode;
    private String deptName;
    private String normdeptCode;
    private String normdeptName;
    private String deptDesc;
    private String isRegister;
    private String isDelete;
    private String indexNo;

    public String getHosOrgCode() {
        return hosOrgCode;
    }

    public void setHosOrgCode(String hosOrgCode) {
        this.hosOrgCode = hosOrgCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getNormdeptCode() {
        return normdeptCode;
    }

    public void setNormdeptCode(String normdeptCode) {
        this.normdeptCode = normdeptCode;
    }

    public String getNormdeptName() {
        return normdeptName;
    }

    public void setNormdeptName(String normdeptName) {
        this.normdeptName = normdeptName;
    }

    public String getDeptDesc() {
        return deptDesc;
    }

    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
    }

    public String getIsRegister() {
        return isRegister;
    }

    public void setIsRegister(String isRegister) {
        this.isRegister = isRegister;
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
