
package za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AffectedEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedEntityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AffectedEntityID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AffectedEntityType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AffectedEntityTitle" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AffectedEntityAlias" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AssociatedEntities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AssociatedEntityRecord" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AssociatedEntityID">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AssociatedEntityType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AssociatedEntityTitle" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AssociatedEntityAlias" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedEntityType", propOrder = {
    "affectedEntityID",
    "affectedEntityType",
    "affectedEntityTitle",
    "affectedEntityAlias",
    "associatedEntities"
})
public class AffectedEntityType {

    @XmlElement(name = "AffectedEntityID", required = true)
    protected String affectedEntityID;
    @XmlElement(name = "AffectedEntityType")
    protected String affectedEntityType;
    @XmlElement(name = "AffectedEntityTitle")
    protected String affectedEntityTitle;
    @XmlElement(name = "AffectedEntityAlias")
    protected String affectedEntityAlias;
    @XmlElement(name = "AssociatedEntities")
    protected AffectedEntityType.AssociatedEntities associatedEntities;

    /**
     * Gets the value of the affectedEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffectedEntityID() {
        return affectedEntityID;
    }

    /**
     * Sets the value of the affectedEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffectedEntityID(String value) {
        this.affectedEntityID = value;
    }

    /**
     * Gets the value of the affectedEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffectedEntityType() {
        return affectedEntityType;
    }

    /**
     * Sets the value of the affectedEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffectedEntityType(String value) {
        this.affectedEntityType = value;
    }

    /**
     * Gets the value of the affectedEntityTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffectedEntityTitle() {
        return affectedEntityTitle;
    }

    /**
     * Sets the value of the affectedEntityTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffectedEntityTitle(String value) {
        this.affectedEntityTitle = value;
    }

    /**
     * Gets the value of the affectedEntityAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffectedEntityAlias() {
        return affectedEntityAlias;
    }

    /**
     * Sets the value of the affectedEntityAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffectedEntityAlias(String value) {
        this.affectedEntityAlias = value;
    }

    /**
     * Gets the value of the associatedEntities property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedEntityType.AssociatedEntities }
     *     
     */
    public AffectedEntityType.AssociatedEntities getAssociatedEntities() {
        return associatedEntities;
    }

    /**
     * Sets the value of the associatedEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedEntityType.AssociatedEntities }
     *     
     */
    public void setAssociatedEntities(AffectedEntityType.AssociatedEntities value) {
        this.associatedEntities = value;
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
     *         &lt;element name="AssociatedEntityRecord" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AssociatedEntityID">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AssociatedEntityType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AssociatedEntityTitle" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AssociatedEntityAlias" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
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
        "associatedEntityRecord"
    })
    public static class AssociatedEntities {

        @XmlElement(name = "AssociatedEntityRecord", required = true)
        protected List<AffectedEntityType.AssociatedEntities.AssociatedEntityRecord> associatedEntityRecord;

        /**
         * Gets the value of the associatedEntityRecord property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the associatedEntityRecord property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssociatedEntityRecord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedEntityType.AssociatedEntities.AssociatedEntityRecord }
         * 
         * 
         */
        public List<AffectedEntityType.AssociatedEntities.AssociatedEntityRecord> getAssociatedEntityRecord() {
            if (associatedEntityRecord == null) {
                associatedEntityRecord = new ArrayList<AffectedEntityType.AssociatedEntities.AssociatedEntityRecord>();
            }
            return this.associatedEntityRecord;
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
         *         &lt;element name="AssociatedEntityID">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AssociatedEntityType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AssociatedEntityTitle" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AssociatedEntityAlias" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "associatedEntityID",
            "associatedEntityType",
            "associatedEntityTitle",
            "associatedEntityAlias"
        })
        public static class AssociatedEntityRecord {

            @XmlElement(name = "AssociatedEntityID", required = true)
            protected String associatedEntityID;
            @XmlElement(name = "AssociatedEntityType")
            protected String associatedEntityType;
            @XmlElement(name = "AssociatedEntityTitle")
            protected String associatedEntityTitle;
            @XmlElement(name = "AssociatedEntityAlias")
            protected String associatedEntityAlias;

            /**
             * Gets the value of the associatedEntityID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssociatedEntityID() {
                return associatedEntityID;
            }

            /**
             * Sets the value of the associatedEntityID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssociatedEntityID(String value) {
                this.associatedEntityID = value;
            }

            /**
             * Gets the value of the associatedEntityType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssociatedEntityType() {
                return associatedEntityType;
            }

            /**
             * Sets the value of the associatedEntityType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssociatedEntityType(String value) {
                this.associatedEntityType = value;
            }

            /**
             * Gets the value of the associatedEntityTitle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssociatedEntityTitle() {
                return associatedEntityTitle;
            }

            /**
             * Sets the value of the associatedEntityTitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssociatedEntityTitle(String value) {
                this.associatedEntityTitle = value;
            }

            /**
             * Gets the value of the associatedEntityAlias property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssociatedEntityAlias() {
                return associatedEntityAlias;
            }

            /**
             * Sets the value of the associatedEntityAlias property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssociatedEntityAlias(String value) {
                this.associatedEntityAlias = value;
            }

        }

    }

}
