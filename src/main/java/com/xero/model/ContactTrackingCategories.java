//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.25 at 11:30:02 AM PDT 
//


package com.xero.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactTrackingCategories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactTrackingCategories">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="TrackingCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingOptionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactTrackingCategories", propOrder = {

})
public class ContactTrackingCategories {

    @XmlElement(name = "TrackingCategoryName")
    protected String trackingCategoryName;
    @XmlElement(name = "TrackingOptionName")
    protected String trackingOptionName;

    /**
     * Gets the value of the trackingCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingCategoryName() {
        return trackingCategoryName;
    }

    /**
     * Sets the value of the trackingCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingCategoryName(String value) {
        this.trackingCategoryName = value;
    }

    /**
     * Gets the value of the trackingOptionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingOptionName() {
        return trackingOptionName;
    }

    /**
     * Sets the value of the trackingOptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingOptionName(String value) {
        this.trackingOptionName = value;
    }

}