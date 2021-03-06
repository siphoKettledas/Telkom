package za.co.telkom.bsdapi.services.updatechange._20180117;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.0.redhat-610379
 * 2018-01-19T23:15:00.578+02:00
 * Generated source version: 2.7.0.redhat-610379
 * 
 */
@WebService(targetNamespace = "http://bsdapi.telkom.co.za/services/UpdateChange/20180117", name = "UpdateChange_HTTP_PortType")
@XmlSeeAlso({za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface UpdateChangeHTTPPortType {

    @WebMethod(operationName = "UpdateChangeCallback", action = "http://bsdapi.telkom.co.za/services/UpdateChange/20180117/Reply")
    @Oneway
    public void updateChangeCallback(
        @WebParam(partName = "ServicePart-UpdateChangeResponse", name = "Response", targetNamespace = "http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd")
        za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema.Response servicePartUpdateChangeResponse
    );

    @WebMethod(operationName = "UpdateChange", action = "http://bsdapi.telkom.co.za/services/UpdateChange/20180117/Request")
    @WebResult(name = "Response", targetNamespace = "http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd", partName = "ServicePart-UpdateChangeResponse")
    public za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema.Response updateChange(
        @WebParam(partName = "ServicePart-UpdateChangeRequest", name = "Request", targetNamespace = "http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd")
        za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema.Request servicePartUpdateChangeRequest
    ) throws UpdateChangeFault;
}
