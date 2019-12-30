
package com.new3tious.new3app.model.recipe;

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
    "FAT",
    "FASAT",
    "CHOCDF",
    "FIBTG",
    "PROCNT",
    "CHOLE",
    "NA",
    "CA",
    "MG",
    "K",
    "FE",
    "ZN",
    "P",
    "VITA_RAE",
    "VITC",
    "THIA",
    "RIBF",
    "NIA",
    "VITB6A",
    "FOLDFE",
    "VITB12",
    "VITD",
    "TOCPHA",
    "VITK1"
})
public class TotalDaily implements Serializable
{

    @JsonProperty("ENERC_KCAL")
    private ENERCKCAL_ eNERCKCAL;
    @JsonProperty("FAT")
    private FAT_ fAT;
    @JsonProperty("FASAT")
    private FASAT_ fASAT;
    @JsonProperty("CHOCDF")
    private CHOCDF_ cHOCDF;
    @JsonProperty("FIBTG")
    private FIBTG_ fIBTG;
    @JsonProperty("PROCNT")
    private PROCNT_ pROCNT;
    @JsonProperty("CHOLE")
    private CHOLE_ cHOLE;
    @JsonProperty("NA")
    private NA_ nA;
    @JsonProperty("CA")
    private CA_ cA;
    @JsonProperty("MG")
    private MG_ mG;
    @JsonProperty("K")
    private K_ k;
    @JsonProperty("FE")
    private FE_ fE;
    @JsonProperty("ZN")
    private ZN_ zN;
    @JsonProperty("P")
    private P_ p;
    @JsonProperty("VITA_RAE")
    private VITARAE_ vITARAE;
    @JsonProperty("VITC")
    private VITC_ vITC;
    @JsonProperty("THIA")
    private THIA_ tHIA;
    @JsonProperty("RIBF")
    private RIBF_ rIBF;
    @JsonProperty("NIA")
    private NIA_ nIA;
    @JsonProperty("VITB6A")
    private VITB6A_ vITB6A;
    @JsonProperty("FOLDFE")
    private FOLDFE_ fOLDFE;
    @JsonProperty("VITB12")
    private VITB12_ vITB12;
    @JsonProperty("VITD")
    private VITD_ vITD;
    @JsonProperty("TOCPHA")
    private TOCPHA_ tOCPHA;
    @JsonProperty("VITK1")
    private VITK1_ vITK1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7429137471123336443L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TotalDaily() {
    }

    /**
     * 
     * @param cHOCDF
     * @param tHIA
     * @param fOLDFE
     * @param fE
     * @param nA
     * @param eNERCKCAL
     * @param vITB6A
     * @param pROCNT
     * @param vITARAE
     * @param vITD
     * @param vITC
     * @param fASAT
     * @param cA
     * @param vITK1
     * @param fIBTG
     * @param k
     * @param nIA
     * @param rIBF
     * @param vITB12
     * @param cHOLE
     * @param tOCPHA
     * @param mG
     * @param p
     * @param zN
     * @param fAT
     */
    public TotalDaily(ENERCKCAL_ eNERCKCAL, FAT_ fAT, FASAT_ fASAT, CHOCDF_ cHOCDF, FIBTG_ fIBTG, PROCNT_ pROCNT, CHOLE_ cHOLE, NA_ nA, CA_ cA, MG_ mG, K_ k, FE_ fE, ZN_ zN, P_ p, VITARAE_ vITARAE, VITC_ vITC, THIA_ tHIA, RIBF_ rIBF, NIA_ nIA, VITB6A_ vITB6A, FOLDFE_ fOLDFE, VITB12_ vITB12, VITD_ vITD, TOCPHA_ tOCPHA, VITK1_ vITK1) {
        super();
        this.eNERCKCAL = eNERCKCAL;
        this.fAT = fAT;
        this.fASAT = fASAT;
        this.cHOCDF = cHOCDF;
        this.fIBTG = fIBTG;
        this.pROCNT = pROCNT;
        this.cHOLE = cHOLE;
        this.nA = nA;
        this.cA = cA;
        this.mG = mG;
        this.k = k;
        this.fE = fE;
        this.zN = zN;
        this.p = p;
        this.vITARAE = vITARAE;
        this.vITC = vITC;
        this.tHIA = tHIA;
        this.rIBF = rIBF;
        this.nIA = nIA;
        this.vITB6A = vITB6A;
        this.fOLDFE = fOLDFE;
        this.vITB12 = vITB12;
        this.vITD = vITD;
        this.tOCPHA = tOCPHA;
        this.vITK1 = vITK1;
    }

    @JsonProperty("ENERC_KCAL")
    public ENERCKCAL_ getENERCKCAL() {
        return eNERCKCAL;
    }

    @JsonProperty("ENERC_KCAL")
    public void setENERCKCAL(ENERCKCAL_ eNERCKCAL) {
        this.eNERCKCAL = eNERCKCAL;
    }

    public TotalDaily withENERCKCAL(ENERCKCAL_ eNERCKCAL) {
        this.eNERCKCAL = eNERCKCAL;
        return this;
    }

    @JsonProperty("FAT")
    public FAT_ getFAT() {
        return fAT;
    }

    @JsonProperty("FAT")
    public void setFAT(FAT_ fAT) {
        this.fAT = fAT;
    }

    public TotalDaily withFAT(FAT_ fAT) {
        this.fAT = fAT;
        return this;
    }

    @JsonProperty("FASAT")
    public FASAT_ getFASAT() {
        return fASAT;
    }

    @JsonProperty("FASAT")
    public void setFASAT(FASAT_ fASAT) {
        this.fASAT = fASAT;
    }

    public TotalDaily withFASAT(FASAT_ fASAT) {
        this.fASAT = fASAT;
        return this;
    }

    @JsonProperty("CHOCDF")
    public CHOCDF_ getCHOCDF() {
        return cHOCDF;
    }

    @JsonProperty("CHOCDF")
    public void setCHOCDF(CHOCDF_ cHOCDF) {
        this.cHOCDF = cHOCDF;
    }

    public TotalDaily withCHOCDF(CHOCDF_ cHOCDF) {
        this.cHOCDF = cHOCDF;
        return this;
    }

    @JsonProperty("FIBTG")
    public FIBTG_ getFIBTG() {
        return fIBTG;
    }

    @JsonProperty("FIBTG")
    public void setFIBTG(FIBTG_ fIBTG) {
        this.fIBTG = fIBTG;
    }

    public TotalDaily withFIBTG(FIBTG_ fIBTG) {
        this.fIBTG = fIBTG;
        return this;
    }

    @JsonProperty("PROCNT")
    public PROCNT_ getPROCNT() {
        return pROCNT;
    }

    @JsonProperty("PROCNT")
    public void setPROCNT(PROCNT_ pROCNT) {
        this.pROCNT = pROCNT;
    }

    public TotalDaily withPROCNT(PROCNT_ pROCNT) {
        this.pROCNT = pROCNT;
        return this;
    }

    @JsonProperty("CHOLE")
    public CHOLE_ getCHOLE() {
        return cHOLE;
    }

    @JsonProperty("CHOLE")
    public void setCHOLE(CHOLE_ cHOLE) {
        this.cHOLE = cHOLE;
    }

    public TotalDaily withCHOLE(CHOLE_ cHOLE) {
        this.cHOLE = cHOLE;
        return this;
    }

    @JsonProperty("NA")
    public NA_ getNA() {
        return nA;
    }

    @JsonProperty("NA")
    public void setNA(NA_ nA) {
        this.nA = nA;
    }

    public TotalDaily withNA(NA_ nA) {
        this.nA = nA;
        return this;
    }

    @JsonProperty("CA")
    public CA_ getCA() {
        return cA;
    }

    @JsonProperty("CA")
    public void setCA(CA_ cA) {
        this.cA = cA;
    }

    public TotalDaily withCA(CA_ cA) {
        this.cA = cA;
        return this;
    }

    @JsonProperty("MG")
    public MG_ getMG() {
        return mG;
    }

    @JsonProperty("MG")
    public void setMG(MG_ mG) {
        this.mG = mG;
    }

    public TotalDaily withMG(MG_ mG) {
        this.mG = mG;
        return this;
    }

    @JsonProperty("K")
    public K_ getK() {
        return k;
    }

    @JsonProperty("K")
    public void setK(K_ k) {
        this.k = k;
    }

    public TotalDaily withK(K_ k) {
        this.k = k;
        return this;
    }

    @JsonProperty("FE")
    public FE_ getFE() {
        return fE;
    }

    @JsonProperty("FE")
    public void setFE(FE_ fE) {
        this.fE = fE;
    }

    public TotalDaily withFE(FE_ fE) {
        this.fE = fE;
        return this;
    }

    @JsonProperty("ZN")
    public ZN_ getZN() {
        return zN;
    }

    @JsonProperty("ZN")
    public void setZN(ZN_ zN) {
        this.zN = zN;
    }

    public TotalDaily withZN(ZN_ zN) {
        this.zN = zN;
        return this;
    }

    @JsonProperty("P")
    public P_ getP() {
        return p;
    }

    @JsonProperty("P")
    public void setP(P_ p) {
        this.p = p;
    }

    public TotalDaily withP(P_ p) {
        this.p = p;
        return this;
    }

    @JsonProperty("VITA_RAE")
    public VITARAE_ getVITARAE() {
        return vITARAE;
    }

    @JsonProperty("VITA_RAE")
    public void setVITARAE(VITARAE_ vITARAE) {
        this.vITARAE = vITARAE;
    }

    public TotalDaily withVITARAE(VITARAE_ vITARAE) {
        this.vITARAE = vITARAE;
        return this;
    }

    @JsonProperty("VITC")
    public VITC_ getVITC() {
        return vITC;
    }

    @JsonProperty("VITC")
    public void setVITC(VITC_ vITC) {
        this.vITC = vITC;
    }

    public TotalDaily withVITC(VITC_ vITC) {
        this.vITC = vITC;
        return this;
    }

    @JsonProperty("THIA")
    public THIA_ getTHIA() {
        return tHIA;
    }

    @JsonProperty("THIA")
    public void setTHIA(THIA_ tHIA) {
        this.tHIA = tHIA;
    }

    public TotalDaily withTHIA(THIA_ tHIA) {
        this.tHIA = tHIA;
        return this;
    }

    @JsonProperty("RIBF")
    public RIBF_ getRIBF() {
        return rIBF;
    }

    @JsonProperty("RIBF")
    public void setRIBF(RIBF_ rIBF) {
        this.rIBF = rIBF;
    }

    public TotalDaily withRIBF(RIBF_ rIBF) {
        this.rIBF = rIBF;
        return this;
    }

    @JsonProperty("NIA")
    public NIA_ getNIA() {
        return nIA;
    }

    @JsonProperty("NIA")
    public void setNIA(NIA_ nIA) {
        this.nIA = nIA;
    }

    public TotalDaily withNIA(NIA_ nIA) {
        this.nIA = nIA;
        return this;
    }

    @JsonProperty("VITB6A")
    public VITB6A_ getVITB6A() {
        return vITB6A;
    }

    @JsonProperty("VITB6A")
    public void setVITB6A(VITB6A_ vITB6A) {
        this.vITB6A = vITB6A;
    }

    public TotalDaily withVITB6A(VITB6A_ vITB6A) {
        this.vITB6A = vITB6A;
        return this;
    }

    @JsonProperty("FOLDFE")
    public FOLDFE_ getFOLDFE() {
        return fOLDFE;
    }

    @JsonProperty("FOLDFE")
    public void setFOLDFE(FOLDFE_ fOLDFE) {
        this.fOLDFE = fOLDFE;
    }

    public TotalDaily withFOLDFE(FOLDFE_ fOLDFE) {
        this.fOLDFE = fOLDFE;
        return this;
    }

    @JsonProperty("VITB12")
    public VITB12_ getVITB12() {
        return vITB12;
    }

    @JsonProperty("VITB12")
    public void setVITB12(VITB12_ vITB12) {
        this.vITB12 = vITB12;
    }

    public TotalDaily withVITB12(VITB12_ vITB12) {
        this.vITB12 = vITB12;
        return this;
    }

    @JsonProperty("VITD")
    public VITD_ getVITD() {
        return vITD;
    }

    @JsonProperty("VITD")
    public void setVITD(VITD_ vITD) {
        this.vITD = vITD;
    }

    public TotalDaily withVITD(VITD_ vITD) {
        this.vITD = vITD;
        return this;
    }

    @JsonProperty("TOCPHA")
    public TOCPHA_ getTOCPHA() {
        return tOCPHA;
    }

    @JsonProperty("TOCPHA")
    public void setTOCPHA(TOCPHA_ tOCPHA) {
        this.tOCPHA = tOCPHA;
    }

    public TotalDaily withTOCPHA(TOCPHA_ tOCPHA) {
        this.tOCPHA = tOCPHA;
        return this;
    }

    @JsonProperty("VITK1")
    public VITK1_ getVITK1() {
        return vITK1;
    }

    @JsonProperty("VITK1")
    public void setVITK1(VITK1_ vITK1) {
        this.vITK1 = vITK1;
    }

    public TotalDaily withVITK1(VITK1_ vITK1) {
        this.vITK1 = vITK1;
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

    public TotalDaily withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("eNERCKCAL", eNERCKCAL).append("fAT", fAT).append("fASAT", fASAT).append("cHOCDF", cHOCDF).append("fIBTG", fIBTG).append("pROCNT", pROCNT).append("cHOLE", cHOLE).append("nA", nA).append("cA", cA).append("mG", mG).append("k", k).append("fE", fE).append("zN", zN).append("p", p).append("vITARAE", vITARAE).append("vITC", vITC).append("tHIA", tHIA).append("rIBF", rIBF).append("nIA", nIA).append("vITB6A", vITB6A).append("fOLDFE", fOLDFE).append("vITB12", vITB12).append("vITD", vITD).append("tOCPHA", tOCPHA).append("vITK1", vITK1).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cHOCDF).append(tHIA).append(fOLDFE).append(fE).append(nA).append(eNERCKCAL).append(vITB6A).append(pROCNT).append(vITD).append(vITARAE).append(vITC).append(fASAT).append(cA).append(vITK1).append(fIBTG).append(k).append(nIA).append(vITB12).append(rIBF).append(tOCPHA).append(cHOLE).append(additionalProperties).append(p).append(mG).append(zN).append(fAT).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TotalDaily) == false) {
            return false;
        }
        TotalDaily rhs = ((TotalDaily) other);
        return new EqualsBuilder().append(cHOCDF, rhs.cHOCDF).append(tHIA, rhs.tHIA).append(fOLDFE, rhs.fOLDFE).append(fE, rhs.fE).append(nA, rhs.nA).append(eNERCKCAL, rhs.eNERCKCAL).append(vITB6A, rhs.vITB6A).append(pROCNT, rhs.pROCNT).append(vITD, rhs.vITD).append(vITARAE, rhs.vITARAE).append(vITC, rhs.vITC).append(fASAT, rhs.fASAT).append(cA, rhs.cA).append(vITK1, rhs.vITK1).append(fIBTG, rhs.fIBTG).append(k, rhs.k).append(nIA, rhs.nIA).append(vITB12, rhs.vITB12).append(rIBF, rhs.rIBF).append(tOCPHA, rhs.tOCPHA).append(cHOLE, rhs.cHOLE).append(additionalProperties, rhs.additionalProperties).append(p, rhs.p).append(mG, rhs.mG).append(zN, rhs.zN).append(fAT, rhs.fAT).isEquals();
    }

}
