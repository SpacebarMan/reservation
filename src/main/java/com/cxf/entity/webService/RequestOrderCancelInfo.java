package com.cxf.entity.webService;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OrderInfo")
public class RequestOrderCancelInfo {
    private String hosOrgCode;
    private String orderId;
    private String cancelReason;
    private String cancelObj;

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

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getCancelObj() {
        return cancelObj;
    }

    public void setCancelObj(String cancelObj) {
        this.cancelObj = cancelObj;
    }
}
