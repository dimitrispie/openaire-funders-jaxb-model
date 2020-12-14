//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.23 at 12:54:05 PM EET 
//


package org.openaire.funders.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for controlledElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="controlledElementType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attGroup ref="{http://namespace.openaire.eu/oaf}optionalInferenceAttrGroup"/>
 *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "controlledElementType", propOrder = {
    "value"
})
public class ControlledElementType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "code", required = true)
    protected String code;
    @XmlAttribute(name = "inferred")
    protected Boolean inferred;
    @XmlAttribute(name = "inferenceprovenance")
    protected String inferenceprovenance;
    @XmlAttribute(name = "trust")
    protected String trust;

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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the inferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInferred() {
        return inferred;
    }

    /**
     * Sets the value of the inferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInferred(Boolean value) {
        this.inferred = value;
    }

    /**
     * Gets the value of the inferenceprovenance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInferenceprovenance() {
        return inferenceprovenance;
    }

    /**
     * Sets the value of the inferenceprovenance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInferenceprovenance(String value) {
        this.inferenceprovenance = value;
    }

    /**
     * Gets the value of the trust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrust() {
        return trust;
    }

    /**
     * Sets the value of the trust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrust(String value) {
        this.trust = value;
    }

}
