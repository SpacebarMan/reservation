package com.cxf.entity.webService;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OrderInfo")
public class RequestOrderList {
    private String queryPersonType;
    private String userCardType;
    private String userCardId;
    private String queryDateType;
    private String startTime;
    private String endTime;

    public String getQueryPersonType() {
        return queryPersonType;
    }

    public void setQueryPersonType(String queryPersonType) {
        this.queryPersonType = queryPersonType;
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

    public String getQueryDateType() {
        return queryDateType;
    }

    public void setQueryDateType(String queryDateType) {
        this.queryDateType = queryDateType;
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
}
