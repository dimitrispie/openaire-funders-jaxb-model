//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.23 at 12:54:05 PM EET 
//


package org.openaire.funders.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fundingParentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fundingParentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="funding_level_1" type="{http://namespace.openaire.eu/oaf}fundingType"/>
 *         &lt;element name="funding_level_0" type="{http://namespace.openaire.eu/oaf}fundingType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fundingParentType", propOrder = {
    "fundingLevel1",
    "fundingLevel0"
})
public class FundingParentType {

    @XmlElement(name = "funding_level_1")
    protected FundingType fundingLevel1;
    @XmlElement(name = "funding_level_0")
    protected FundingType fundingLevel0;

    /**
     * Gets the value of the fundingLevel1 property.
     * 
     * @return
     *     possible object is
     *     {@link FundingType }
     *     
     */
    public FundingType getFundingLevel1() {
        return fundingLevel1;
    }

    /**
     * Sets the value of the fundingLevel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingType }
     *     
     */
    public void setFundingLevel1(FundingType value) {
        this.fundingLevel1 = value;
    }

    /**
     * Gets the value of the fundingLevel0 property.
     * 
     * @return
     *     possible object is
     *     {@link FundingType }
     *     
     */
    public FundingType getFundingLevel0() {
        return fundingLevel0;
    }

    /**
     * Sets the value of the fundingLevel0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingType }
     *     
     */
    public void setFundingLevel0(FundingType value) {
        this.fundingLevel0 = value;
    }

}
