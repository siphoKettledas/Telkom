
package za.co.telkom.bsdapi.services.updatechange._20180117;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0.redhat-610379
 * 2018-01-19T23:15:00.546+02:00
 * Generated source version: 2.7.0.redhat-610379
 */

@WebFault(name = "Exception", targetNamespace = "http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd")
public class UpdateChangeFault extends java.lang.Exception {
    
    private za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema.Exception exception;

    public UpdateChangeFault() {
        super();
    }
    
    public UpdateChangeFault(String message) {
        super(message);
    }
    
    public UpdateChangeFault(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateChangeFault(String message, za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema.Exception exception) {
        super(message);
        this.exception = exception;
    }

    public UpdateChangeFault(String message, za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema.Exception exception, Throwable cause) {
        super(message, cause);
        this.exception = exception;
    }

    public za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema.Exception getFaultInfo() {
        return this.exception;
    }
}
