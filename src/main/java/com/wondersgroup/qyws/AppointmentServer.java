
package com.wondersgroup.qyws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AppointmentServer", targetNamespace = "http://www.wondersgroup.com/qyws")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AppointmentServer {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "BlackUserInfoSynchronousService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "BlackUserInfoSynchronousService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.BlackUserInfoSynchronousService")
    @ResponseWrapper(localName = "BlackUserInfoSynchronousServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.BlackUserInfoSynchronousServiceResponse")
    public String blackUserInfoSynchronousService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CheckPatientInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CheckPatientInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.CheckPatientInfoService")
    @ResponseWrapper(localName = "CheckPatientInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.CheckPatientInfoServiceResponse")
    public String checkPatientInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "SubmitOrderByUserInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SubmitOrderByUserInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.SubmitOrderByUserInfoService")
    @ResponseWrapper(localName = "SubmitOrderByUserInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.SubmitOrderByUserInfoServiceResponse")
    public String submitOrderByUserInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetOutPatInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetOutPatInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetOutPatInfoService")
    @ResponseWrapper(localName = "GetOutPatInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetOutPatInfoServiceResponse")
    public String getOutPatInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetDeptInfoTopService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetDeptInfoTopService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetDeptInfoTopService")
    @ResponseWrapper(localName = "GetDeptInfoTopServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetDeptInfoTopServiceResponse")
    public String getDeptInfoTopService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetHospitalOrderDetailInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetHospitalOrderDetailInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetHospitalOrderDetailInfoService")
    @ResponseWrapper(localName = "GetHospitalOrderDetailInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetHospitalOrderDetailInfoServiceResponse")
    public String getHospitalOrderDetailInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "OrderCancelInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "OrderCancelInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.OrderCancelInfoService")
    @ResponseWrapper(localName = "OrderCancelInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.OrderCancelInfoServiceResponse")
    public String orderCancelInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpRuleInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpRuleInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpRuleInfoService")
    @ResponseWrapper(localName = "UpRuleInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpRuleInfoServiceResponse")
    public String upRuleInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetResourceDoctInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetResourceDoctInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetResourceDoctInfoService")
    @ResponseWrapper(localName = "GetResourceDoctInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetResourceDoctInfoServiceResponse")
    public String getResourceDoctInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpStopScheduleInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpStopScheduleInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpStopScheduleInfoService")
    @ResponseWrapper(localName = "UpStopScheduleInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpStopScheduleInfoServiceResponse")
    public String upStopScheduleInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpNumSourceDetailUsedInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpNumSourceDetailUsedInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpNumSourceDetailUsedInfoService")
    @ResponseWrapper(localName = "UpNumSourceDetailUsedInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpNumSourceDetailUsedInfoServiceResponse")
    public String upNumSourceDetailUsedInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetDoctInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetDoctInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetDoctInfoService")
    @ResponseWrapper(localName = "GetDoctInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetDoctInfoServiceResponse")
    public String getDoctInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "PullOrderService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "PullOrderService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.PullOrderService")
    @ResponseWrapper(localName = "PullOrderServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.PullOrderServiceResponse")
    public String pullOrderService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpDeptInfoTwoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpDeptInfoTwoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpDeptInfoTwoService")
    @ResponseWrapper(localName = "UpDeptInfoTwoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpDeptInfoTwoServiceResponse")
    public String upDeptInfoTwoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpMonitorOrderStatusService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpMonitorOrderStatusService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpMonitorOrderStatusService")
    @ResponseWrapper(localName = "UpMonitorOrderStatusServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpMonitorOrderStatusServiceResponse")
    public String upMonitorOrderStatusService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetHospitalCfgService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetHospitalCfgService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetHospitalCfgService")
    @ResponseWrapper(localName = "GetHospitalCfgServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetHospitalCfgServiceResponse")
    public String getHospitalCfgService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetHospitalOrderListInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetHospitalOrderListInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetHospitalOrderListInfoService")
    @ResponseWrapper(localName = "GetHospitalOrderListInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetHospitalOrderListInfoServiceResponse")
    public String getHospitalOrderListInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpappealUserInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpappealUserInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpappealUserInfoService")
    @ResponseWrapper(localName = "UpappealUserInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpappealUserInfoServiceResponse")
    public String upappealUserInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetDeptInfoTwoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetDeptInfoTwoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetDeptInfoTwoService")
    @ResponseWrapper(localName = "GetDeptInfoTwoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetDeptInfoTwoServiceResponse")
    public String getDeptInfoTwoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpReplaceScheduleInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpReplaceScheduleInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpReplaceScheduleInfoService")
    @ResponseWrapper(localName = "UpReplaceScheduleInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpReplaceScheduleInfoServiceResponse")
    public String upReplaceScheduleInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpCityAppealUserInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpCityAppealUserInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpCityAppealUserInfoService")
    @ResponseWrapper(localName = "UpCityAppealUserInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpCityAppealUserInfoServiceResponse")
    public String upCityAppealUserInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetResourceOutPatInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetResourceOutPatInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetResourceOutPatInfoService")
    @ResponseWrapper(localName = "GetResourceOutPatInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetResourceOutPatInfoServiceResponse")
    public String getResourceOutPatInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpNumSourceDetailInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpNumSourceDetailInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpNumSourceDetailInfoService")
    @ResponseWrapper(localName = "UpNumSourceDetailInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpNumSourceDetailInfoServiceResponse")
    public String upNumSourceDetailInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetOrderListService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetOrderListService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetOrderListService")
    @ResponseWrapper(localName = "GetOrderListServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetOrderListServiceResponse")
    public String getOrderListService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpMonitorAppointOrderService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpMonitorAppointOrderService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpMonitorAppointOrderService")
    @ResponseWrapper(localName = "UpMonitorAppointOrderServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpMonitorAppointOrderServiceResponse")
    public String upMonitorAppointOrderService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetOrderDetailInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetOrderDetailInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetOrderDetailInfoService")
    @ResponseWrapper(localName = "GetOrderDetailInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetOrderDetailInfoServiceResponse")
    public String getOrderDetailInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpBlackUserInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpBlackUserInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpBlackUserInfoService")
    @ResponseWrapper(localName = "UpBlackUserInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpBlackUserInfoServiceResponse")
    public String upBlackUserInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpOutPatInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpOutPatInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpOutPatInfoService")
    @ResponseWrapper(localName = "UpOutPatInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpOutPatInfoServiceResponse")
    public String upOutPatInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpHospitalInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpHospitalInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpHospitalInfoService")
    @ResponseWrapper(localName = "UpHospitalInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpHospitalInfoServiceResponse")
    public String upHospitalInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetOrderNumInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetOrderNumInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetOrderNumInfoService")
    @ResponseWrapper(localName = "GetOrderNumInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetOrderNumInfoServiceResponse")
    public String getOrderNumInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpOrderStatusService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpOrderStatusService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpOrderStatusService")
    @ResponseWrapper(localName = "UpOrderStatusServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpOrderStatusServiceResponse")
    public String upOrderStatusService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpCityBlackUserInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpCityBlackUserInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpCityBlackUserInfoService")
    @ResponseWrapper(localName = "UpCityBlackUserInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpCityBlackUserInfoServiceResponse")
    public String upCityBlackUserInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpDeptInfoTopService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpDeptInfoTopService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpDeptInfoTopService")
    @ResponseWrapper(localName = "UpDeptInfoTopServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpDeptInfoTopServiceResponse")
    public String upDeptInfoTopService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryQy", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.QueryQy")
    @ResponseWrapper(localName = "queryQyResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.QueryQyResponse")
    public String queryQy(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpOrderChannelInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpOrderChannelInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpOrderChannelInfoService")
    @ResponseWrapper(localName = "UpOrderChannelInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpOrderChannelInfoServiceResponse")
    public String upOrderChannelInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpCityOrderChannelInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpCityOrderChannelInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpCityOrderChannelInfoService")
    @ResponseWrapper(localName = "UpCityOrderChannelInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpCityOrderChannelInfoServiceResponse")
    public String upCityOrderChannelInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpDoctInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpDoctInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpDoctInfoService")
    @ResponseWrapper(localName = "UpDoctInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpDoctInfoServiceResponse")
    public String upDoctInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetHospitalInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetHospitalInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetHospitalInfoService")
    @ResponseWrapper(localName = "GetHospitalInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetHospitalInfoServiceResponse")
    public String getHospitalInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getQyState", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetQyState")
    @ResponseWrapper(localName = "getQyStateResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetQyStateResponse")
    public String getQyState(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpMonitorOrderMedicineService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpMonitorOrderMedicineService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpMonitorOrderMedicineService")
    @ResponseWrapper(localName = "UpMonitorOrderMedicineServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpMonitorOrderMedicineServiceResponse")
    public String upMonitorOrderMedicineService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpNumSourceInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpNumSourceInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpNumSourceInfoService")
    @ResponseWrapper(localName = "UpNumSourceInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpNumSourceInfoServiceResponse")
    public String upNumSourceInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpOrderMedicinService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpOrderMedicinService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpOrderMedicinService")
    @ResponseWrapper(localName = "UpOrderMedicinServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.UpOrderMedicinServiceResponse")
    public String upOrderMedicinService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetDoctByDeptInfoService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetDoctByDeptInfoService", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetDoctByDeptInfoService")
    @ResponseWrapper(localName = "GetDoctByDeptInfoServiceResponse", targetNamespace = "http://www.wondersgroup.com/qyws", className = "com.wondersgroup.qyws.GetDoctByDeptInfoServiceResponse")
    public String getDoctByDeptInfoService(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

}
