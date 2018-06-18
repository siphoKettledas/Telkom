
package za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.w3c.dom.Element;


/**
 * <p>Java class for RequestHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd}MessageID"/>
 *         &lt;element ref="{http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd}FromLocation"/>
 *         &lt;element name="ReplyToAddress" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
 *                 &lt;attribute name="FaultToAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReferenceParameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd}BusinessKey" minOccurs="0"/>
 *                   &lt;element ref="{http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd}Metadata" minOccurs="0"/>
 *                   &lt;element name="Extensions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd}SenderID"/>
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
@XmlType(name = "RequestHeaderType", propOrder = {
    "messageID",
    "fromLocation",
    "replyToAddress",
    "referenceParameters",
    "senderID",
    "any"
})
public class RequestHeaderType {

    @XmlElement(name = "MessageID", required = true)
    protected MessageID messageID;
    @XmlElement(name = "FromLocation", required = true)
    protected FromLocation fromLocation;
    @XmlElement(name = "ReplyToAddress")
    protected RequestHeaderType.ReplyToAddress replyToAddress;
    @XmlElement(name = "ReferenceParameters")
    protected RequestHeaderType.ReferenceParameters referenceParameters;
    @XmlElement(name = "SenderID", required = true)
    protected String senderID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link MessageID }
     *     
     */
    public MessageID getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageID }
     *     
     */
    public void setMessageID(MessageID value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the fromLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FromLocation }
     *     
     */
    public FromLocation getFromLocation() {
        return fromLocation;
    }

    /**
     * Sets the value of the fromLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromLocation }
     *     
     */
    public void setFromLocation(FromLocation value) {
        this.fromLocation = value;
    }

    /**
     * Gets the value of the replyToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeaderType.ReplyToAddress }
     *     
     */
    public RequestHeaderType.ReplyToAddress getReplyToAddress() {
        return replyToAddress;
    }

    /**
     * Sets the value of the replyToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeaderType.ReplyToAddress }
     *     
     */
    public void setReplyToAddress(RequestHeaderType.ReplyToAddress value) {
        this.replyToAddress = value;
    }

    /**
     * Gets the value of the referenceParameters property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeaderType.ReferenceParameters }
     *     
     */
    public RequestHeaderType.ReferenceParameters getReferenceParameters() {
        return referenceParameters;
    }

    /**
     * Sets the value of the referenceParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeaderType.ReferenceParameters }
     *     
     */
    public void setReferenceParameters(RequestHeaderType.ReferenceParameters value) {
        this.referenceParameters = value;
    }

    /**
     * Gets the value of the senderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderID() {
        return senderID;
    }

    /**
     * Sets the value of the senderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderID(String value) {
        this.senderID = value;
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
     *         &lt;element ref="{http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd}BusinessKey" minOccurs="0"/>
     *         &lt;element ref="{http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd}Metadata" minOccurs="0"/>
     *         &lt;element name="Extensions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "businessKey",
        "metadata",
        "extensions"
    })
    public static class ReferenceParameters {

        @XmlElement(name = "BusinessKey")
        protected String businessKey;
        @XmlElement(name = "Metadata")
        protected MetadataType metadata;
        @XmlElement(name = "Extensions")
        protected RequestHeaderType.ReferenceParameters.Extensions extensions;

        /**
         * Gets the value of the businessKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessKey() {
            return businessKey;
        }

        /**
         * Sets the value of the businessKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessKey(String value) {
            this.businessKey = value;
        }

        /**
         * Gets the value of the metadata property.
         * 
         * @return
         *     possible object is
         *     {@link MetadataType }
         *     
         */
        public MetadataType getMetadata() {
            return metadata;
        }

        /**
         * Sets the value of the metadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link MetadataType }
         *     
         */
        public void setMetadata(MetadataType value) {
            this.metadata = value;
        }

        /**
         * Gets the value of the extensions property.
         * 
         * @return
         *     possible object is
         *     {@link RequestHeaderType.ReferenceParameters.Extensions }
         *     
         */
        public RequestHeaderType.ReferenceParameters.Extensions getExtensions() {
            return extensions;
        }

        /**
         * Sets the value of the extensions property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequestHeaderType.ReferenceParameters.Extensions }
         *     
         */
        public void setExtensions(RequestHeaderType.ReferenceParameters.Extensions value) {
            this.extensions = value;
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
            "any"
        })
        public static class Extensions {

            @XmlAnyElement(lax = true)
            protected List<Object> any;

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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
     *       &lt;attribute name="FaultToAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ReplyToAddress {

        @XmlValue
        @XmlSchemaType(name = "anyURI")
        protected String value;
        @XmlAttribute(name = "FaultToAddress")
        @XmlSchemaType(name = "anyURI")
        protected String faultToAddress;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the faultToAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFaultToAddress() {
            return faultToAddress;
        }

        /**
         * Sets the value of the faultToAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFaultToAddress(String value) {
            this.faultToAddress = value;
        }

    }

}
