
package za.co.telkom.bsdapi.schemas.updatechange._20180117.datamodel.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Param" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Key" use="required" type="{http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd}RequiredStringType" />
 *                 &lt;attribute name="Qualifier" use="required" type="{http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd}RequiredStringType" />
 *                 &lt;attribute name="Value" use="required" type="{http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd}RequiredStringType" />
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
@XmlType(name = "MetadataType", propOrder = {
    "param"
})
public class MetadataType {

    @XmlElement(name = "Param", required = true)
    protected List<MetadataType.Param> param;

    /**
     * Gets the value of the param property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the param property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataType.Param }
     * 
     * 
     */
    public List<MetadataType.Param> getParam() {
        if (param == null) {
            param = new ArrayList<MetadataType.Param>();
        }
        return this.param;
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
     *       &lt;attribute name="Key" use="required" type="{http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd}RequiredStringType" />
     *       &lt;attribute name="Qualifier" use="required" type="{http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd}RequiredStringType" />
     *       &lt;attribute name="Value" use="required" type="{http://bsdapi.telkom.co.za/schemas/UpdateChange/20180117/DataModel/Schema.xsd}RequiredStringType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Param {

        @XmlAttribute(name = "Key", required = true)
        protected String key;
        @XmlAttribute(name = "Qualifier", required = true)
        protected String qualifier;
        @XmlAttribute(name = "Value", required = true)
        protected String value;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

        /**
         * Gets the value of the qualifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualifier() {
            return qualifier;
        }

        /**
         * Sets the value of the qualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualifier(String value) {
            this.qualifier = value;
        }

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

    }

}
