package com.cxf.entity.webService;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Result")
public class ResponseOrderInfo {
    private String hosOrgCode;
    private String orderId;
    private String visitNo;
    private String numSourceDetailId;
    private String numPassword;
    private String room;
    private String hosNumSourceId;

    public ResponseOrderInfo(){}

    public ResponseOrderInfo(String hosOrgCode,String orderId,String numSourceDetailId){
        this.setHosOrgCode(hosOrgCode);
        this.setOrderId(orderId);
        this.setVisitNo(orderId);
        this.setNumSourceDetailId(numSourceDetailId);
        this.setNumPassword("");
        this.setRoom("");
        this.setHosNumSourceId("");
    }

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

    public String getVisitNo() {
        return visitNo;
    }

    public void setVisitNo(String visitNo) {
        this.visitNo = visitNo;
    }

    public String getNumSourceDetailId() {
        return numSourceDetailId;
    }

    public void setNumSourceDetailId(String numSourceDetailId) {
        this.numSourceDetailId = numSourceDetailId;
    }

    public String getNumPassword() {
        return numPassword;
    }

    public void setNumPassword(String numPassword) {
        this.numPassword = numPassword;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getHosNumSourceId() {
        return hosNumSourceId;
    }

    public void setHosNumSourceId(String hosNumSourceId) {
        this.hosNumSourceId = hosNumSourceId;
    }


}
