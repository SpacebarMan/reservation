
package com.wondersgroup.qyws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AppointmentServer", targetNamespace = "http://www.wondersgroup.com/qyws", wsdlLocation = "http://10.17.157.166:8080/yyzlWS/webservice/ss?wsdl")
public class AppointmentServer_Service
    extends Service
{

    private final static URL APPOINTMENTSERVER_WSDL_LOCATION;
    private final static WebServiceException APPOINTMENTSERVER_EXCEPTION;
    private final static QName APPOINTMENTSERVER_QNAME = new QName("http://www.wondersgroup.com/qyws", "AppointmentServer");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.17.157.166:8080/yyzlWS/webservice/ss?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        APPOINTMENTSERVER_WSDL_LOCATION = url;
        APPOINTMENTSERVER_EXCEPTION = e;
    }

    public AppointmentServer_Service() {
        super(__getWsdlLocation(), APPOINTMENTSERVER_QNAME);
    }

    public AppointmentServer_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), APPOINTMENTSERVER_QNAME, features);
    }

    public AppointmentServer_Service(URL wsdlLocation) {
        super(wsdlLocation, APPOINTMENTSERVER_QNAME);
    }

    public AppointmentServer_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, APPOINTMENTSERVER_QNAME, features);
    }

    public AppointmentServer_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AppointmentServer_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AppointmentServer
     */
    @WebEndpoint(name = "YyzlWebServiceImplPort")
    public AppointmentServer getYyzlWebServiceImplPort() {
        return super.getPort(new QName("http://www.wondersgroup.com/qyws", "YyzlWebServiceImplPort"), AppointmentServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AppointmentServer
     */
    @WebEndpoint(name = "YyzlWebServiceImplPort")
    public AppointmentServer getYyzlWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.wondersgroup.com/qyws", "YyzlWebServiceImplPort"), AppointmentServer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (APPOINTMENTSERVER_EXCEPTION!= null) {
            throw APPOINTMENTSERVER_EXCEPTION;
        }
        return APPOINTMENTSERVER_WSDL_LOCATION;
    }

}
