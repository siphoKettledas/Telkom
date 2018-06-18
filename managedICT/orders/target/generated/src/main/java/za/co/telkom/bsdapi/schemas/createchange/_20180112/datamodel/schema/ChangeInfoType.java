
package za.co.telkom.bsdapi.schemas.createchange._20180112.datamodel.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ChangeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceSystemReference">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AdditionalSourceSystemReference" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CustomerIdentifier">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ChangeActivity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ChangeType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Description">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ChangeStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ChangeStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ChangeEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ChangeRequiredDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TargetSystem">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ServiceOrganisation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Priority">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Impact">
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
@XmlType(name = "ChangeInfoType", propOrder = {
    "sourceSystemReference",
    "additionalSourceSystemReference",
    "customerIdentifier",
    "changeActivity",
    "changeType",
    "description",
    "changeStatus",
    "changeStartDate",
    "changeEndDate",
    "changeRequiredDate",
    "targetSystem",
    "serviceOrganisation",
    "priority",
    "impact"
})
public class ChangeInfoType {

    @XmlElement(name = "SourceSystemReference", required = true)
    protected String sourceSystemReference;
    @XmlElement(name = "AdditionalSourceSystemReference")
    protected String additionalSourceSystemReference;
    @XmlElement(name = "CustomerIdentifier", required = true)
    protected String customerIdentifier;
    @XmlElement(name = "ChangeActivity", required = true)
    protected String changeActivity;
    @XmlElement(name = "ChangeType", required = true)
    protected String changeType;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "ChangeStatus")
    protected String changeStatus;
    @XmlElement(name = "ChangeStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeStartDate;
    @XmlElement(name = "ChangeEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeEndDate;
    @XmlElement(name = "ChangeRequiredDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeRequiredDate;
    @XmlElement(name = "TargetSystem", required = true)
    protected String targetSystem;
    @XmlElement(name = "ServiceOrganisation")
    protected String serviceOrganisation;
    @XmlElement(name = "Priority", required = true)
    protected String priority;
    @XmlElement(name = "Impact", required = true)
    protected String impact;

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
     * Gets the value of the customerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * Sets the value of the customerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIdentifier(String value) {
        this.customerIdentifier = value;
    }

    /**
     * Gets the value of the changeActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeActivity() {
        return changeActivity;
    }

    /**
     * Sets the value of the changeActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeActivity(String value) {
        this.changeActivity = value;
    }

    /**
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeType(String value) {
        this.changeType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the changeStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeStartDate() {
        return changeStartDate;
    }

    /**
     * Sets the value of the changeStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeStartDate(XMLGregorianCalendar value) {
        this.changeStartDate = value;
    }

    /**
     * Gets the value of the changeEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeEndDate() {
        return changeEndDate;
    }

    /**
     * Sets the value of the changeEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeEndDate(XMLGregorianCalendar value) {
        this.changeEndDate = value;
    }

    /**
     * Gets the value of the changeRequiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeRequiredDate() {
        return changeRequiredDate;
    }

    /**
     * Sets the value of the changeRequiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeRequiredDate(XMLGregorianCalendar value) {
        this.changeRequiredDate = value;
    }

    /**
     * Gets the value of the targetSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetSystem() {
        return targetSystem;
    }

    /**
     * Sets the value of the targetSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetSystem(String value) {
        this.targetSystem = value;
    }

    /**
     * Gets the value of the serviceOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOrganisation() {
        return serviceOrganisation;
    }

    /**
     * Sets the value of the serviceOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOrganisation(String value) {
        this.serviceOrganisation = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the impact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpact() {
        return impact;
    }

    /**
     * Sets the value of the impact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpact(String value) {
        this.impact = value;
    }

}
