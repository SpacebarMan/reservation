package com.cxf.config;

import com.cxf.utils.ImgUtil;
import com.cxf.utils.JaXmlBeanUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import sun.misc.BASE64Encoder;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.*;

@Component
@XmlRootElement(name = "HosInfo")
@XmlType(propOrder = { "hosOrgCode", "orgCode","hosName","hospitalAdd",
        "hospitalRule","hospitalWeb","trafficGuide","hospitalDesc","hospitalTel",
        "hospitalGrade","hospitalLevel","hospitalType","payMode","orderMode",
        "isRegister","isSpTime","shortName","orgSort","hospitalArea","hospitalImage"})
@ConfigurationProperties(prefix = "HosInfo")
@PropertySource(value = "classpath:application-HosInfoConfig.yml",encoding = "UTF-8")
public class HosInfo {
    @Value("${hosOrgCode}")
    private String hosOrgCode;          //医院代码
    @Value("${orgCode}")
    private String orgCode;             //卫⽣机构(组织)代码
    @Value("${hosName}")
    private String hosName;             //医院名称
    @Value("${hospitalAdd}")
    private String hospitalAdd;         //医院地址
    @Value("${hospitalRule}")
    private String hospitalRule;        //预约挂号须知
    @Value("${hospitalWeb}")
    private String hospitalWeb;         //医院⽹址
    @Value("${trafficGuide}")
    private String trafficGuide;        //交通指南
    @Value("${hospitalDesc}")
    private String hospitalDesc;        //医院简介
    @Value("${hospitalTel}")
    private String hospitalTel;         //联系电话
    @Value("${hospitalGrade}")
    private String hospitalGrade;       //医院级别
    @Value("${hospitalLevel}")
    private String hospitalLevel;       //医院等级
    @Value("${hospitalType}")
    private String hospitalType;        //医院类别
    @Value("${payMode}")
    private String payMode;             //⽀付⽅式
    @Value("${orderMode}")
    private String orderMode;           //预约⽅式
    @Value("${isRegister}")
    private String isRegister;          //是否开展预约
    @Value("${isSpTime}")
    private String isSpTime;            //是否⽀持分时段
    @Value("${shortName}")
    private String shortName;           //医院简称
    @Value("${orgSort}")
    private String orgSort;             //医院属性 [ 1：市属:2：区属 ]
    @Value("${hospitalArea}")
    private String hospitalArea;        //所属区代码
    @Value("${hospitalImage}")
    private String hospitalImage;       //医院图⽚

    public String getHosOrgCode() {
        return hosOrgCode;
    }

    public void setHosOrgCode(String hosOrgCode) {
        this.hosOrgCode = hosOrgCode;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getHosName() {
        return hosName;
    }

    public void setHosName(String hosName) {
        this.hosName = hosName;
    }

    public String getHospitalAdd() {
        return hospitalAdd;
    }

    public void setHospitalAdd(String hospitalAdd) {
        this.hospitalAdd = hospitalAdd;
    }

    public String getHospitalRule() {
        return hospitalRule;
    }

    public void setHospitalRule(String hospitalRule) {
        this.hospitalRule = hospitalRule;
    }

    public String getHospitalWeb() {
        return hospitalWeb;
    }

    public void setHospitalWeb(String hospitalWeb) {
        this.hospitalWeb = hospitalWeb;
    }

    public String getTrafficGuide() {
        return trafficGuide;
    }

    public void setTrafficGuide(String trafficGuide) {
        this.trafficGuide = trafficGuide;
    }

    public String getHospitalDesc() {
        return hospitalDesc;
    }

    public void setHospitalDesc(String hospitalDesc) {
        this.hospitalDesc = hospitalDesc;
    }

    public String getHospitalTel() {
        return hospitalTel;
    }

    public void setHospitalTel(String hospitalTel) {
        this.hospitalTel = hospitalTel;
    }

    public String getHospitalGrade() {
        return hospitalGrade;
    }

    public void setHospitalGrade(String hospitalGrade) {
        this.hospitalGrade = hospitalGrade;
    }

    public String getHospitalLevel() {
        return hospitalLevel;
    }

    public void setHospitalLevel(String hospitalLevel) {
        this.hospitalLevel = hospitalLevel;
    }

    public String getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(String hospitalType) {
        this.hospitalType = hospitalType;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public String getOrderMode() {
        return orderMode;
    }

    public void setOrderMode(String orderMode) {
        this.orderMode = orderMode;
    }

    public String getIsRegister() {
        return isRegister;
    }

    public void setIsRegister(String isRegister) {
        this.isRegister = isRegister;
    }

    public String getIsSpTime() {
        return isSpTime;
    }

    public void setIsSpTime(String isSpTime) {
        this.isSpTime = isSpTime;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getOrgSort() {
        return orgSort;
    }

    public void setOrgSort(String orgSort) {
        this.orgSort = orgSort;
    }

    public String getHospitalArea() {
        return hospitalArea;
    }

    public void setHospitalArea(String hospitalArea) {
        this.hospitalArea = hospitalArea;
    }

    public String getHospitalImage() {
        return ImgUtil.queryGetPhotoImageBlob(this.hospitalImage);
    }

    public void setHospitalImage(String hospitalImage) {
        this.hospitalImage = hospitalImage;
    }


    @Override
    public String toString() {
        try {
            return JaXmlBeanUtil.parseBeanToXml(HosInfo.class,this);
        } catch (JAXBException e) {
            e.printStackTrace();
            return "";
        }
    }


}
