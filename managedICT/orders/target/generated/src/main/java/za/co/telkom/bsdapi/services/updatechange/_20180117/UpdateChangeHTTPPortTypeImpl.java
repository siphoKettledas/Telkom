
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package za.co.telkom.bsdapi.services.updatechange._20180117;

import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.0.redhat-610379
 * 2018-01-19T23:15:00.562+02:00
 * Generated source version: 2.7.0.redhat-610379
 * 
 */

@javax.jws.WebService(
                      serviceName = "UpdateChangeHTTPService",
                      portName = "UpdateChange_Soap11_HTTP_EP",
                      targetNamespace = "http://bsdapi.telkom.co.za/services/UpdateChange/20180117",
                      wsdlLocation = "file:/E:/apps/ide/workspace/manageICT/orders/src/main/resources/wsdl/bsdapi_UpdateChange_WSDL_20180117.wsdl",
                      endpointInterface = "za.co.telkom.bsdapi.services.updatechange._20180117.UpdateChangeHTTPPortType")
                      
public class UpdateChangeHTTPPortTypeImpl implements UpdateChangeHTTPPortType {

    private static final Logger LOG = Logger.getLogger(UpdateChangeHTTPPortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see za.co.telkom.bsdapi.services.updatechange._20180117.UpdateChangeHTTPPortType#updateChangeCallback(za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema.Response  servicePartUpdateChangeResponse )*
     */
    public void updateChangeCallback(za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema.Response servicePartUpdateChangeResponse) { 
        LOG.info("Executing operation updateChangeCallback");
        System.out.println(servicePartUpdateChangeResponse);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see za.co.telkom.bsdapi.services.updatechange._20180117.UpdateChangeHTTPPortType#updateChange(za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema.Request  servicePartUpdateChangeRequest )*
     */
    public za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema.Response updateChange(za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema.Request servicePartUpdateChangeRequest) throws UpdateChangeFault    { 
        LOG.info("Executing operation updateChange");
        System.out.println(servicePartUpdateChangeRequest);
        try {
            za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema.Response _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new UpdateChangeFault("UpdateChangeFault...");
    }

}