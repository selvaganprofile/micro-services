
package com.cloudshop.product.common.model.request;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "The basic Product object with  elements")
@XmlRootElement
public class ApplicationArea {

   
    private String creationDateTime;
    @JsonProperty("BODID")
    private String bODID;
    @JsonProperty("CreatorNameCode")
    private String creatorNameCode;
    @JsonProperty("SenderNameCode")
    private String senderNameCode;
    @JsonProperty("DestinationNameCode")
    private String destinationNameCode;
    
    /**
     * 
     * @return
     *     The creationDateTime
     */
    @JsonProperty("CreationDateTime")
    public String getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * 
     * @param creationDateTime
     *     The CreationDateTime
     */
    @JsonProperty("CreationDateTime")
    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * 
     * @return
     *     The bODID
     */
    @JsonProperty("BODID")
    public String getBODID() {
        return bODID;
    }

    /**
     * 
     * @param bODID
     *     The BODID
     */
    @JsonProperty("BODID")
    public void setBODID(String bODID) {
        this.bODID = bODID;
    }

    /**
     * 
     * @return
     *     The creatorNameCode
     */
    @JsonProperty("CreatorNameCode")
    public String getCreatorNameCode() {
        return creatorNameCode;
    }

    /**
     * 
     * @param creatorNameCode
     *     The CreatorNameCode
     */
    @JsonProperty("CreatorNameCode")
    public void setCreatorNameCode(String creatorNameCode) {
        this.creatorNameCode = creatorNameCode;
    }

    /**
     * 
     * @return
     *     The senderNameCode
     */
    @JsonProperty("SenderNameCode")
    public String getSenderNameCode() {
        return senderNameCode;
    }

    /**
     * 
     * @param senderNameCode
     *     The SenderNameCode
     */
    @JsonProperty("SenderNameCode")
    public void setSenderNameCode(String senderNameCode) {
        this.senderNameCode = senderNameCode;
    }

    /**
     * 
     * @return
     *     The destinationNameCode
     */
    @JsonProperty("DestinationNameCode")
    public String getDestinationNameCode() {
        return destinationNameCode;
    }

    /**
     * 
     * @param destinationNameCode
     *     The DestinationNameCode
     */
    @JsonProperty("DestinationNameCode")
    public void setDestinationNameCode(String destinationNameCode) {
        this.destinationNameCode = destinationNameCode;
    }



}
