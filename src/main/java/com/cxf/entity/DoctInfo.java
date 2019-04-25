package com.cxf.entity;

import com.cxf.utils.ImgUtil;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ResourceInfo")
public class DoctInfo {
    private String hosOrgCode;
    private String oneDeptCode;
    private String deptCode;
    private String resourceCode;
    private String resourceName;
    private String doctTile;
    private String personType;
    private String personId;
    private String doctImg;
    private String doctSex;
    private String doctInfo;
    private String doctSpecialty;
    private String isRegister;
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

    public String getDoctTile() {
        return doctTile;
    }

    public void setDoctTile(String doctTile) {
        this.doctTile = doctTile;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getDoctImg() {
        return ImgUtil.queryGetPhotoImageBlob(this.doctImg);
    }

    public void setDoctImg(String doctImg) {
        this.doctImg = doctImg;
    }

    public String getDoctSex() {
        return doctSex;
    }

    public void setDoctSex(String doctSex) {
        this.doctSex = doctSex;
    }

    public String getDoctInfo() {
        return doctInfo;
    }

    public void setDoctInfo(String doctInfo) {
        this.doctInfo = doctInfo;
    }

    public String getDoctSpecialty() {
        return doctSpecialty;
    }

    public void setDoctSpecialty(String doctSpecialty) {
        this.doctSpecialty = doctSpecialty;
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
