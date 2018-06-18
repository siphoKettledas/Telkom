
package za.co.telkom.bsdapi.schemas.createchange._20180112.datamodel.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://bsdapi.telkom.co.za/schemas/CreateChange/20180112/DataModel/Schema.xsd}ResponseType">
 *       &lt;sequence>
 *         &lt;element name="Payload" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SourceSystemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AdditionalSourceSystemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ChangeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DestinationReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "payload"
})
@XmlRootElement(name = "Response")
public class Response
    extends ResponseType
{

    @XmlElement(name = "Payload")
    protected Response.Payload payload;

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link Response.Payload }
     *     
     */
    public Response.Payload getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response.Payload }
     *     
     */
    public void setPayload(Response.Payload value) {
        this.payload = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SourceSystemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AdditionalSourceSystemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ChangeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DestinationReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sourceSystemReference",
        "additionalSourceSystemReference",
        "changeStatus",
        "destinationReference",
        "any"
    })
    public static class Payload {

        @XmlElement(name = "SourceSystemReference")
        protected String sourceSystemReference;
        @XmlElement(name = "AdditionalSourceSystemReference")
        protected String additionalSourceSystemReference;
        @XmlElement(name = "ChangeStatus")
        protected String changeStatus;
        @XmlElement(name = "DestinationReference", required = true)
        protected String destinationReference;
        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the sourceSystemReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceSystemReference() {
            return sourceSystemReference;
        }

        /**
         * Sets the value of the sourceSystemReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceSystemReference(String value) {
            this.sourceSystemReference = value;
        }

        /**
         * Gets the value of the additionalSourceSystemReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalSourceSystemReference() {
            return additionalSourceSystemReference;
        }

        /**
         * Sets the value of the additionalSourceSystemReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalSourceSystemReference(String value) {
            this.additionalSourceSystemReference = value;
        }

        /**
         * Gets the value of the changeStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChangeStatus() {
            return changeStatus;
        }

        /**
         * Sets the value of the changeStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChangeStatus(String value) {
            this.changeStatus = value;
        }

        /**
         * Gets the value of the destinationReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationReference() {
            return destinationReference;
        }

        /**
         * Sets the value of the destinationReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationReference(String value) {
            this.destinationReference = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}
