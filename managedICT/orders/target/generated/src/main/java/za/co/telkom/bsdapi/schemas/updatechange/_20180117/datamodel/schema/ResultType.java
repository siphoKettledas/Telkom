
package za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ResultMsgCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResultMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultType", propOrder = {
    "resultCode",
    "resultMsgCode",
    "resultMsg"
})
public class ResultType {

    @XmlElement(name = "ResultCode")
    protected long resultCode;
    @XmlElement(name = "ResultMsgCode")
    protected String resultMsgCode;
    @XmlElement(name = "ResultMsg")
    protected String resultMsg;

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public long getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(long value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultMsgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultMsgCode() {
        return resultMsgCode;
    }

    /**
     * Sets the value of the resultMsgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultMsgCode(String value) {
        this.resultMsgCode = value;
    }

    /**
     * Gets the value of the resultMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultMsg() {
        return resultMsg;
    }

    /**
     * Sets the value of the resultMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultMsg(String value) {
        this.resultMsg = value;
    }

}
