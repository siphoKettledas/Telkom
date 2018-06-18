
package za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ResponseHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd}MessageID"/>
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
 *         &lt;element ref="{http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd}RelatesTo"/>
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
@XmlType(name = "ResponseHeaderType", propOrder = {
    "messageID",
    "referenceParameters",
    "relatesTo",
    "any"
})
public class ResponseHeaderType {

    @XmlElement(name = "MessageID", required = true)
    protected MessageID messageID;
    @XmlElement(name = "ReferenceParameters")
    protected ResponseHeaderType.ReferenceParameters referenceParameters;
    @XmlElement(name = "RelatesTo", required = true)
    protected RelatesTo relatesTo;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * This is the unique messageID that is set by the
     * 						receiver for a specific message interaction.
     * 					
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
     * Gets the value of the referenceParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeaderType.ReferenceParameters }
     *     
     */
    public ResponseHeaderType.ReferenceParameters getReferenceParameters() {
        return referenceParameters;
    }

    /**
     * Sets the value of the referenceParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeaderType.ReferenceParameters }
     *     
     */
    public void setReferenceParameters(ResponseHeaderType.ReferenceParameters value) {
        this.referenceParameters = value;
    }

    /**
     * This is the unique messageID that is set by the
     * 						client for a specific message interaction. For a given client
     * 						(SystemID), the messageID must be unique. Will be echoed back from
     * 						the RequestHeader
     * 					
     * 
     * @return
     *     possible object is
     *     {@link RelatesTo }
     *     
     */
    public RelatesTo getRelatesTo() {
        return relatesTo;
    }

    /**
     * Sets the value of the relatesTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatesTo }
     *     
     */
    public void setRelatesTo(RelatesTo value) {
        this.relatesTo = value;
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
        protected ResponseHeaderType.ReferenceParameters.Extensions extensions;

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
         *     {@link ResponseHeaderType.ReferenceParameters.Extensions }
         *     
         */
        public ResponseHeaderType.ReferenceParameters.Extensions getExtensions() {
            return extensions;
        }

        /**
         * Sets the value of the extensions property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseHeaderType.ReferenceParameters.Extensions }
         *     
         */
        public void setExtensions(ResponseHeaderType.ReferenceParameters.Extensions value) {
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

}
