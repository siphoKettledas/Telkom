
package za.co.telkom.bsdapi.schemas.createchange._20180112.datamodel.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://bsdapi.telkom.co.za/schemas/CreateChange/20180112/DataModel/Schema.xsd}RequestType">
 *       &lt;sequence>
 *         &lt;element name="Sequence" type="{http://bsdapi.telkom.co.za/schemas/CreateChange/20180112/DataModel/Schema.xsd}SequenceType" minOccurs="0"/>
 *         &lt;element name="ChangeInfo" type="{http://bsdapi.telkom.co.za/schemas/CreateChange/20180112/DataModel/Schema.xsd}ChangeInfoType"/>
 *         &lt;element name="AffectedEntity" type="{http://bsdapi.telkom.co.za/schemas/CreateChange/20180112/DataModel/Schema.xsd}AffectedEntityType" minOccurs="0"/>
 *         &lt;element name="ContactInfo" type="{http://bsdapi.telkom.co.za/schemas/CreateChange/20180112/DataModel/Schema.xsd}ContactInfoType" minOccurs="0"/>
 *         &lt;element name="LocationInfo" type="{http://bsdapi.telkom.co.za/schemas/CreateChange/20180112/DataModel/Schema.xsd}LocationInfoType" minOccurs="0"/>
 *         &lt;element name="Attachment" type="{http://bsdapi.telkom.co.za/schemas/CreateChange/20180112/DataModel/Schema.xsd}AttachedResourceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalInfo" type="{http://bsdapi.telkom.co.za/schemas/CreateChange/20180112/DataModel/Schema.xsd}AdditionalInfoType" maxOccurs="unbounded" minOccurs="0"/>
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
    "sequence",
    "changeInfo",
    "affectedEntity",
    "contactInfo",
    "locationInfo",
    "attachment",
    "additionalInfo"
})
@XmlRootElement(name = "Request")
public class Request
    extends RequestType
{

    @XmlElement(name = "Sequence")
    protected SequenceType sequence;
    @XmlElement(name = "ChangeInfo", required = true)
    protected ChangeInfoType changeInfo;
    @XmlElement(name = "AffectedEntity")
    protected AffectedEntityType affectedEntity;
    @XmlElement(name = "ContactInfo")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "LocationInfo")
    protected LocationInfoType locationInfo;
    @XmlElement(name = "Attachment")
    protected List<AttachedResourceType> attachment;
    @XmlElement(name = "AdditionalInfo")
    protected List<AdditionalInfoType> additionalInfo;

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceType }
     *     
     */
    public SequenceType getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceType }
     *     
     */
    public void setSequence(SequenceType value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the changeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeInfoType }
     *     
     */
    public ChangeInfoType getChangeInfo() {
        return changeInfo;
    }

    /**
     * Sets the value of the changeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeInfoType }
     *     
     */
    public void setChangeInfo(ChangeInfoType value) {
        this.changeInfo = value;
    }

    /**
     * Gets the value of the affectedEntity property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedEntityType }
     *     
     */
    public AffectedEntityType getAffectedEntity() {
        return affectedEntity;
    }

    /**
     * Sets the value of the affectedEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedEntityType }
     *     
     */
    public void setAffectedEntity(AffectedEntityType value) {
        this.affectedEntity = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the locationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInfoType }
     *     
     */
    public LocationInfoType getLocationInfo() {
        return locationInfo;
    }

    /**
     * Sets the value of the locationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInfoType }
     *     
     */
    public void setLocationInfo(LocationInfoType value) {
        this.locationInfo = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachedResourceType }
     * 
     * 
     */
    public List<AttachedResourceType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<AttachedResourceType>();
        }
        return this.attachment;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInfoType }
     * 
     * 
     */
    public List<AdditionalInfoType> getAdditionalInfo() {
        if (additionalInfo == null) {
            additionalInfo = new ArrayList<AdditionalInfoType>();
        }
        return this.additionalInfo;
    }

}
