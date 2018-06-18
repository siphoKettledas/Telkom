package za.co.telkom.bsdapi.services.createchange._20180112;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.0.redhat-610379
 * 2018-01-19T23:15:00.109+02:00
 * Generated source version: 2.7.0.redhat-610379
 * 
 */
@WebService(targetNamespace = "http://bsdapi.telkom.co.za/services/CreateChange/20180112", name = "CreateChange_HTTP_PortType")
@XmlSeeAlso({za.co.telkom.bsdapi.schemas.createchange._20180112.datamodel.schema.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CreateChangeHTTPPortType {

    @WebMethod(operationName = "CreateChangeCallback", action = "http://bsdapi.telkom.co.za/services/CreateChange/20180112/Reply")
    @Oneway
    public void createChangeCallback(
        @WebParam(partName = "ServicePart-CreateChangeResponse", name = "Response", targetNamespace = "http://bsdapi.telkom.co.za/schemas/CreateChange/20180112/DataModel/Schema.xsd")
        za.co.telkom.bsdapi.schemas.createchange._20180112.datamodel.schema.Response servicePartCreateChangeResponse
    );

    @WebMethod(operationName = "CreateChange", action = "http://bsdapi.telkom.co.za/services/CreateChange/20180112/Request")
    @WebResult(name = "Response", targetNamespace = "http://bsdapi.telkom.co.za/schemas/CreateChange/20180112/DataModel/Schema.xsd", partName = "ServicePart-CreateChangeResponse")
    public za.co.telkom.bsdapi.schemas.createchange._20180112.datamodel.schema.Response createChange(
        @WebParam(partName = "ServicePart-CreateChangeRequest", name = "Request", targetNamespace = "http://bsdapi.telkom.co.za/schemas/CreateChange/20180112/DataModel/Schema.xsd")
        za.co.telkom.bsdapi.schemas.createchange._20180112.datamodel.schema.Request servicePartCreateChangeRequest
    ) throws CreateChangeFault;
}