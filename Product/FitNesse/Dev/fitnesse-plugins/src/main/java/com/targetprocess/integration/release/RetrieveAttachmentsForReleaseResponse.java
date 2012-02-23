
package com.targetprocess.integration.release;

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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RetrieveAttachmentsForReleaseResult" type="{http://targetprocess.com}ArrayOfAttachmentDTO" minOccurs="0"/>
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
    "retrieveAttachmentsForReleaseResult"
})
@XmlRootElement(name = "RetrieveAttachmentsForReleaseResponse")
public class RetrieveAttachmentsForReleaseResponse {

    @XmlElement(name = "RetrieveAttachmentsForReleaseResult")
    protected ArrayOfAttachmentDTO retrieveAttachmentsForReleaseResult;

    /**
     * Gets the value of the retrieveAttachmentsForReleaseResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachmentDTO }
     *     
     */
    public ArrayOfAttachmentDTO getRetrieveAttachmentsForReleaseResult() {
        return retrieveAttachmentsForReleaseResult;
    }

    /**
     * Sets the value of the retrieveAttachmentsForReleaseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachmentDTO }
     *     
     */
    public void setRetrieveAttachmentsForReleaseResult(ArrayOfAttachmentDTO value) {
        this.retrieveAttachmentsForReleaseResult = value;
    }

}