
package za.co.telkom.bsdapi.schemas.createchange._20180112.datamodel.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactInfoRecord" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ContactMedium" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ContactMediumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ContactMediumValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ContactID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ContactInfoType", propOrder = {
    "contactInfoRecord"
})
public class ContactInfoType {

    @XmlElement(name = "ContactInfoRecord", required = true)
    protected List<ContactInfoType.ContactInfoRecord> contactInfoRecord;

    /**
     * Gets the value of the contactInfoRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfoRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfoRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfoType.ContactInfoRecord }
     * 
     * 
     */
    public List<ContactInfoType.ContactInfoRecord> getContactInfoRecord() {
        if (contactInfoRecord == null) {
            contactInfoRecord = new ArrayList<ContactInfoType.ContactInfoRecord>();
        }
        return this.contactInfoRecord;
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
     *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ContactMedium" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ContactMediumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ContactMediumValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ContactID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "lastName",
        "firstName",
        "contactType",
        "contactMedium",
        "contactID"
    })
    public static class ContactInfoRecord {

        @XmlElement(name = "LastName")
        protected String lastName;
        @XmlElement(name = "FirstName")
        protected String firstName;
        @XmlElement(name = "ContactType", required = true)
        protected String contactType;
        @XmlElement(name = "ContactMedium")
        protected List<ContactInfoType.ContactInfoRecord.ContactMedium> contactMedium;
        @XmlElement(name = "ContactID")
        protected String contactID;

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the contactType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactType() {
            return contactType;
        }

        /**
         * Sets the value of the contactType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactType(String value) {
            this.contactType = value;
        }

        /**
         * Gets the value of the contactMedium property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contactMedium property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContactMedium().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactInfoType.ContactInfoRecord.ContactMedium }
         * 
         * 
         */
        public List<ContactInfoType.ContactInfoRecord.ContactMedium> getContactMedium() {
            if (contactMedium == null) {
                contactMedium = new ArrayList<ContactInfoType.ContactInfoRecord.ContactMedium>();
            }
            return this.contactMedium;
        }

        /**
         * Gets the value of the contactID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactID() {
            return contactID;
        }

        /**
         * Sets the value of the contactID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactID(String value) {
            this.contactID = value;
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
         *         &lt;element name="ContactMediumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ContactMediumValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "contactMediumType",
            "contactMediumValue"
        })
        public static class ContactMedium {

            @XmlElement(name = "ContactMediumType", required = true)
            protected String contactMediumType;
            @XmlElement(name = "ContactMediumValue", required = true)
            protected String contactMediumValue;

            /**
             * Gets the value of the contactMediumType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactMediumType() {
                return contactMediumType;
            }

            /**
             * Sets the value of the contactMediumType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactMediumType(String value) {
                this.contactMediumType = value;
            }

            /**
             * Gets the value of the contactMediumValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactMediumValue() {
                return contactMediumValue;
            }

            /**
             * Sets the value of the contactMediumValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactMediumValue(String value) {
                this.contactMediumValue = value;
            }

        }

    }

}
