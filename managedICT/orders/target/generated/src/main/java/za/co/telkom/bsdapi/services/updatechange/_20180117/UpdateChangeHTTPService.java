package za.co.telkom.bsdapi.services.updatechange._20180117;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0.redhat-610379
 * 2018-01-19T23:15:00.593+02:00
 * Generated source version: 2.7.0.redhat-610379
 * 
 */
@WebServiceClient(name = "UpdateChangeHTTPService", 
                  wsdlLocation = "file:/E:/apps/ide/workspace/manageICT/orders/src/main/resources/wsdl/bsdapi_UpdateChange_WSDL_20180117.wsdl",
                  targetNamespace = "http://bsdapi.telkom.co.za/services/UpdateChange/20180117") 
public class UpdateChangeHTTPService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://bsdapi.telkom.co.za/services/UpdateChange/20180117", "UpdateChangeHTTPService");
    public final static QName UpdateChangeSoap11HTTPEP = new QName("http://bsdapi.telkom.co.za/services/UpdateChange/20180117", "UpdateChange_Soap11_HTTP_EP");
    static {
        URL url = null;
        try {
            url = new URL("file:/E:/apps/ide/workspace/manageICT/orders/src/main/resources/wsdl/bsdapi_UpdateChange_WSDL_20180117.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UpdateChangeHTTPService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/E:/apps/ide/workspace/manageICT/orders/src/main/resources/wsdl/bsdapi_UpdateChange_WSDL_20180117.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UpdateChangeHTTPService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UpdateChangeHTTPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UpdateChangeHTTPService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UpdateChangeHTTPService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UpdateChangeHTTPService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UpdateChangeHTTPService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns UpdateChangeHTTPPortType
     */
    @WebEndpoint(name = "UpdateChange_Soap11_HTTP_EP")
    public UpdateChangeHTTPPortType getUpdateChangeSoap11HTTPEP() {
        return super.getPort(UpdateChangeSoap11HTTPEP, UpdateChangeHTTPPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UpdateChangeHTTPPortType
     */
    @WebEndpoint(name = "UpdateChange_Soap11_HTTP_EP")
    public UpdateChangeHTTPPortType getUpdateChangeSoap11HTTPEP(WebServiceFeature... features) {
        return super.getPort(UpdateChangeSoap11HTTPEP, UpdateChangeHTTPPortType.class, features);
    }

}
