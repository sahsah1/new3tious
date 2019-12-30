
package com.new3tious.new3app.model.food;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ENERC_KCAL",
    "PROCNT",
    "FAT",
    "CHOCDF",
    "FIBTG"
})
public class Nutrients implements Serializable
{

    @JsonProperty("ENERC_KCAL")
    private Integer eNERCKCAL;
    @JsonProperty("PROCNT")
    private Double pROCNT;
    @JsonProperty("FAT")
    private Double fAT;
    @JsonProperty("CHOCDF")
    private Double cHOCDF;
    @JsonProperty("FIBTG")
    private Double fIBTG;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2704031955105395410L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Nutrients() {
    }

    /**
     * 
     * @param cHOCDF
     * @param eNERCKCAL
     * @param pROCNT
     * @param fIBTG
     * @param fAT
     */
    public Nutrients(Integer eNERCKCAL, Double pROCNT, Double fAT, Double cHOCDF, Double fIBTG) {
        super();
        this.eNERCKCAL = eNERCKCAL;
        this.pROCNT = pROCNT;
        this.fAT = fAT;
        this.cHOCDF = cHOCDF;
        this.fIBTG = fIBTG;
    }

    @JsonProperty("ENERC_KCAL")
    public Integer getENERCKCAL() {
        return eNERCKCAL;
    }

    @JsonProperty("ENERC_KCAL")
    public void setENERCKCAL(Integer eNERCKCAL) {
        this.eNERCKCAL = eNERCKCAL;
    }

    public Nutrients withENERCKCAL(Integer eNERCKCAL) {
        this.eNERCKCAL = eNERCKCAL;
        return this;
    }

    @JsonProperty("PROCNT")
    public Double getPROCNT() {
        return pROCNT;
    }

    @JsonProperty("PROCNT")
    public void setPROCNT(Double pROCNT) {
        this.pROCNT = pROCNT;
    }

    public Nutrients withPROCNT(Double pROCNT) {
        this.pROCNT = pROCNT;
        return this;
    }

    @JsonProperty("FAT")
    public Double getFAT() {
        return fAT;
    }

    @JsonProperty("FAT")
    public void setFAT(Double fAT) {
        this.fAT = fAT;
    }

    public Nutrients withFAT(Double fAT) {
        this.fAT = fAT;
        return this;
    }

    @JsonProperty("CHOCDF")
    public Double getCHOCDF() {
        return cHOCDF;
    }

    @JsonProperty("CHOCDF")
    public void setCHOCDF(Double cHOCDF) {
        this.cHOCDF = cHOCDF;
    }

    public Nutrients withCHOCDF(Double cHOCDF) {
        this.cHOCDF = cHOCDF;
        return this;
    }

    @JsonProperty("FIBTG")
    public Double getFIBTG() {
        return fIBTG;
    }

    @JsonProperty("FIBTG")
    public void setFIBTG(Double fIBTG) {
        this.fIBTG = fIBTG;
    }

    public Nutrients withFIBTG(Double fIBTG) {
        this.fIBTG = fIBTG;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Nutrients withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("eNERCKCAL", eNERCKCAL).append("pROCNT", pROCNT).append("fAT", fAT).append("cHOCDF", cHOCDF).append("fIBTG", fIBTG).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cHOCDF).append(eNERCKCAL).append(additionalProperties).append(pROCNT).append(fIBTG).append(fAT).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Nutrients) == false) {
            return false;
        }
        Nutrients rhs = ((Nutrients) other);
        return new EqualsBuilder().append(cHOCDF, rhs.cHOCDF).append(eNERCKCAL, rhs.eNERCKCAL).append(additionalProperties, rhs.additionalProperties).append(pROCNT, rhs.pROCNT).append(fIBTG, rhs.fIBTG).append(fAT, rhs.fAT).isEquals();
    }

}
