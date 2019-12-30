
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
    "FATRN",
    "FAMS",
    "FAPU",
    "CHOCDF",
    "FIBTG",
    "SUGAR",
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
    "FOLFD",
    "VITB12",
    "VITD",
    "TOCPHA",
    "VITK1"
})
public class TotalNutrients implements Serializable
{

    @JsonProperty("ENERC_KCAL")
    private ENERCKCAL eNERCKCAL;
    @JsonProperty("FAT")
    private FAT fAT;
    @JsonProperty("FASAT")
    private FASAT fASAT;
    @JsonProperty("FATRN")
    private FATRN fATRN;
    @JsonProperty("FAMS")
    private FAMS fAMS;
    @JsonProperty("FAPU")
    private FAPU fAPU;
    @JsonProperty("CHOCDF")
    private CHOCDF cHOCDF;
    @JsonProperty("FIBTG")
    private FIBTG fIBTG;
    @JsonProperty("SUGAR")
    private SUGAR sUGAR;
    @JsonProperty("PROCNT")
    private PROCNT pROCNT;
    @JsonProperty("CHOLE")
    private CHOLE cHOLE;
    @JsonProperty("NA")
    private NA nA;
    @JsonProperty("CA")
    private CA cA;
    @JsonProperty("MG")
    private MG mG;
    @JsonProperty("K")
    private K k;
    @JsonProperty("FE")
    private FE fE;
    @JsonProperty("ZN")
    private ZN zN;
    @JsonProperty("P")
    private P p;
    @JsonProperty("VITA_RAE")
    private VITARAE vITARAE;
    @JsonProperty("VITC")
    private VITC vITC;
    @JsonProperty("THIA")
    private THIA tHIA;
    @JsonProperty("RIBF")
    private RIBF rIBF;
    @JsonProperty("NIA")
    private NIA nIA;
    @JsonProperty("VITB6A")
    private VITB6A vITB6A;
    @JsonProperty("FOLDFE")
    private FOLDFE fOLDFE;
    @JsonProperty("FOLFD")
    private FOLFD fOLFD;
    @JsonProperty("VITB12")
    private VITB12 vITB12;
    @JsonProperty("VITD")
    private VITD vITD;
    @JsonProperty("TOCPHA")
    private TOCPHA tOCPHA;
    @JsonProperty("VITK1")
    private VITK1 vITK1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1010202280768138980L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TotalNutrients() {
    }

    /**
     * 
     * @param cHOCDF
     * @param tHIA
     * @param fOLDFE
     * @param fE
     * @param fOLFD
     * @param nA
     * @param eNERCKCAL
     * @param fAMS
     * @param vITB6A
     * @param pROCNT
     * @param vITD
     * @param vITARAE
     * @param vITC
     * @param fASAT
     * @param cA
     * @param vITK1
     * @param fIBTG
     * @param fATRN
     * @param k
     * @param nIA
     * @param vITB12
     * @param fAPU
     * @param rIBF
     * @param tOCPHA
     * @param cHOLE
     * @param mG
     * @param p
     * @param sUGAR
     * @param zN
     * @param fAT
     */
    public TotalNutrients(ENERCKCAL eNERCKCAL, FAT fAT, FASAT fASAT, FATRN fATRN, FAMS fAMS, FAPU fAPU, CHOCDF cHOCDF, FIBTG fIBTG, SUGAR sUGAR, PROCNT pROCNT, CHOLE cHOLE, NA nA, CA cA, MG mG, K k, FE fE, ZN zN, P p, VITARAE vITARAE, VITC vITC, THIA tHIA, RIBF rIBF, NIA nIA, VITB6A vITB6A, FOLDFE fOLDFE, FOLFD fOLFD, VITB12 vITB12, VITD vITD, TOCPHA tOCPHA, VITK1 vITK1) {
        super();
        this.eNERCKCAL = eNERCKCAL;
        this.fAT = fAT;
        this.fASAT = fASAT;
        this.fATRN = fATRN;
        this.fAMS = fAMS;
        this.fAPU = fAPU;
        this.cHOCDF = cHOCDF;
        this.fIBTG = fIBTG;
        this.sUGAR = sUGAR;
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
        this.fOLFD = fOLFD;
        this.vITB12 = vITB12;
        this.vITD = vITD;
        this.tOCPHA = tOCPHA;
        this.vITK1 = vITK1;
    }

    @JsonProperty("ENERC_KCAL")
    public ENERCKCAL getENERCKCAL() {
        return eNERCKCAL;
    }

    @JsonProperty("ENERC_KCAL")
    public void setENERCKCAL(ENERCKCAL eNERCKCAL) {
        this.eNERCKCAL = eNERCKCAL;
    }

    public TotalNutrients withENERCKCAL(ENERCKCAL eNERCKCAL) {
        this.eNERCKCAL = eNERCKCAL;
        return this;
    }

    @JsonProperty("FAT")
    public FAT getFAT() {
        return fAT;
    }

    @JsonProperty("FAT")
    public void setFAT(FAT fAT) {
        this.fAT = fAT;
    }

    public TotalNutrients withFAT(FAT fAT) {
        this.fAT = fAT;
        return this;
    }

    @JsonProperty("FASAT")
    public FASAT getFASAT() {
        return fASAT;
    }

    @JsonProperty("FASAT")
    public void setFASAT(FASAT fASAT) {
        this.fASAT = fASAT;
    }

    public TotalNutrients withFASAT(FASAT fASAT) {
        this.fASAT = fASAT;
        return this;
    }

    @JsonProperty("FATRN")
    public FATRN getFATRN() {
        return fATRN;
    }

    @JsonProperty("FATRN")
    public void setFATRN(FATRN fATRN) {
        this.fATRN = fATRN;
    }

    public TotalNutrients withFATRN(FATRN fATRN) {
        this.fATRN = fATRN;
        return this;
    }

    @JsonProperty("FAMS")
    public FAMS getFAMS() {
        return fAMS;
    }

    @JsonProperty("FAMS")
    public void setFAMS(FAMS fAMS) {
        this.fAMS = fAMS;
    }

    public TotalNutrients withFAMS(FAMS fAMS) {
        this.fAMS = fAMS;
        return this;
    }

    @JsonProperty("FAPU")
    public FAPU getFAPU() {
        return fAPU;
    }

    @JsonProperty("FAPU")
    public void setFAPU(FAPU fAPU) {
        this.fAPU = fAPU;
    }

    public TotalNutrients withFAPU(FAPU fAPU) {
        this.fAPU = fAPU;
        return this;
    }

    @JsonProperty("CHOCDF")
    public CHOCDF getCHOCDF() {
        return cHOCDF;
    }

    @JsonProperty("CHOCDF")
    public void setCHOCDF(CHOCDF cHOCDF) {
        this.cHOCDF = cHOCDF;
    }

    public TotalNutrients withCHOCDF(CHOCDF cHOCDF) {
        this.cHOCDF = cHOCDF;
        return this;
    }

    @JsonProperty("FIBTG")
    public FIBTG getFIBTG() {
        return fIBTG;
    }

    @JsonProperty("FIBTG")
    public void setFIBTG(FIBTG fIBTG) {
        this.fIBTG = fIBTG;
    }

    public TotalNutrients withFIBTG(FIBTG fIBTG) {
        this.fIBTG = fIBTG;
        return this;
    }

    @JsonProperty("SUGAR")
    public SUGAR getSUGAR() {
        return sUGAR;
    }

    @JsonProperty("SUGAR")
    public void setSUGAR(SUGAR sUGAR) {
        this.sUGAR = sUGAR;
    }

    public TotalNutrients withSUGAR(SUGAR sUGAR) {
        this.sUGAR = sUGAR;
        return this;
    }

    @JsonProperty("PROCNT")
    public PROCNT getPROCNT() {
        return pROCNT;
    }

    @JsonProperty("PROCNT")
    public void setPROCNT(PROCNT pROCNT) {
        this.pROCNT = pROCNT;
    }

    public TotalNutrients withPROCNT(PROCNT pROCNT) {
        this.pROCNT = pROCNT;
        return this;
    }

    @JsonProperty("CHOLE")
    public CHOLE getCHOLE() {
        return cHOLE;
    }

    @JsonProperty("CHOLE")
    public void setCHOLE(CHOLE cHOLE) {
        this.cHOLE = cHOLE;
    }

    public TotalNutrients withCHOLE(CHOLE cHOLE) {
        this.cHOLE = cHOLE;
        return this;
    }

    @JsonProperty("NA")
    public NA getNA() {
        return nA;
    }

    @JsonProperty("NA")
    public void setNA(NA nA) {
        this.nA = nA;
    }

    public TotalNutrients withNA(NA nA) {
        this.nA = nA;
        return this;
    }

    @JsonProperty("CA")
    public CA getCA() {
        return cA;
    }

    @JsonProperty("CA")
    public void setCA(CA cA) {
        this.cA = cA;
    }

    public TotalNutrients withCA(CA cA) {
        this.cA = cA;
        return this;
    }

    @JsonProperty("MG")
    public MG getMG() {
        return mG;
    }

    @JsonProperty("MG")
    public void setMG(MG mG) {
        this.mG = mG;
    }

    public TotalNutrients withMG(MG mG) {
        this.mG = mG;
        return this;
    }

    @JsonProperty("K")
    public K getK() {
        return k;
    }

    @JsonProperty("K")
    public void setK(K k) {
        this.k = k;
    }

    public TotalNutrients withK(K k) {
        this.k = k;
        return this;
    }

    @JsonProperty("FE")
    public FE getFE() {
        return fE;
    }

    @JsonProperty("FE")
    public void setFE(FE fE) {
        this.fE = fE;
    }

    public TotalNutrients withFE(FE fE) {
        this.fE = fE;
        return this;
    }

    @JsonProperty("ZN")
    public ZN getZN() {
        return zN;
    }

    @JsonProperty("ZN")
    public void setZN(ZN zN) {
        this.zN = zN;
    }

    public TotalNutrients withZN(ZN zN) {
        this.zN = zN;
        return this;
    }

    @JsonProperty("P")
    public P getP() {
        return p;
    }

    @JsonProperty("P")
    public void setP(P p) {
        this.p = p;
    }

    public TotalNutrients withP(P p) {
        this.p = p;
        return this;
    }

    @JsonProperty("VITA_RAE")
    public VITARAE getVITARAE() {
        return vITARAE;
    }

    @JsonProperty("VITA_RAE")
    public void setVITARAE(VITARAE vITARAE) {
        this.vITARAE = vITARAE;
    }

    public TotalNutrients withVITARAE(VITARAE vITARAE) {
        this.vITARAE = vITARAE;
        return this;
    }

    @JsonProperty("VITC")
    public VITC getVITC() {
        return vITC;
    }

    @JsonProperty("VITC")
    public void setVITC(VITC vITC) {
        this.vITC = vITC;
    }

    public TotalNutrients withVITC(VITC vITC) {
        this.vITC = vITC;
        return this;
    }

    @JsonProperty("THIA")
    public THIA getTHIA() {
        return tHIA;
    }

    @JsonProperty("THIA")
    public void setTHIA(THIA tHIA) {
        this.tHIA = tHIA;
    }

    public TotalNutrients withTHIA(THIA tHIA) {
        this.tHIA = tHIA;
        return this;
    }

    @JsonProperty("RIBF")
    public RIBF getRIBF() {
        return rIBF;
    }

    @JsonProperty("RIBF")
    public void setRIBF(RIBF rIBF) {
        this.rIBF = rIBF;
    }

    public TotalNutrients withRIBF(RIBF rIBF) {
        this.rIBF = rIBF;
        return this;
    }

    @JsonProperty("NIA")
    public NIA getNIA() {
        return nIA;
    }

    @JsonProperty("NIA")
    public void setNIA(NIA nIA) {
        this.nIA = nIA;
    }

    public TotalNutrients withNIA(NIA nIA) {
        this.nIA = nIA;
        return this;
    }

    @JsonProperty("VITB6A")
    public VITB6A getVITB6A() {
        return vITB6A;
    }

    @JsonProperty("VITB6A")
    public void setVITB6A(VITB6A vITB6A) {
        this.vITB6A = vITB6A;
    }

    public TotalNutrients withVITB6A(VITB6A vITB6A) {
        this.vITB6A = vITB6A;
        return this;
    }

    @JsonProperty("FOLDFE")
    public FOLDFE getFOLDFE() {
        return fOLDFE;
    }

    @JsonProperty("FOLDFE")
    public void setFOLDFE(FOLDFE fOLDFE) {
        this.fOLDFE = fOLDFE;
    }

    public TotalNutrients withFOLDFE(FOLDFE fOLDFE) {
        this.fOLDFE = fOLDFE;
        return this;
    }

    @JsonProperty("FOLFD")
    public FOLFD getFOLFD() {
        return fOLFD;
    }

    @JsonProperty("FOLFD")
    public void setFOLFD(FOLFD fOLFD) {
        this.fOLFD = fOLFD;
    }

    public TotalNutrients withFOLFD(FOLFD fOLFD) {
        this.fOLFD = fOLFD;
        return this;
    }

    @JsonProperty("VITB12")
    public VITB12 getVITB12() {
        return vITB12;
    }

    @JsonProperty("VITB12")
    public void setVITB12(VITB12 vITB12) {
        this.vITB12 = vITB12;
    }

    public TotalNutrients withVITB12(VITB12 vITB12) {
        this.vITB12 = vITB12;
        return this;
    }

    @JsonProperty("VITD")
    public VITD getVITD() {
        return vITD;
    }

    @JsonProperty("VITD")
    public void setVITD(VITD vITD) {
        this.vITD = vITD;
    }

    public TotalNutrients withVITD(VITD vITD) {
        this.vITD = vITD;
        return this;
    }

    @JsonProperty("TOCPHA")
    public TOCPHA getTOCPHA() {
        return tOCPHA;
    }

    @JsonProperty("TOCPHA")
    public void setTOCPHA(TOCPHA tOCPHA) {
        this.tOCPHA = tOCPHA;
    }

    public TotalNutrients withTOCPHA(TOCPHA tOCPHA) {
        this.tOCPHA = tOCPHA;
        return this;
    }

    @JsonProperty("VITK1")
    public VITK1 getVITK1() {
        return vITK1;
    }

    @JsonProperty("VITK1")
    public void setVITK1(VITK1 vITK1) {
        this.vITK1 = vITK1;
    }

    public TotalNutrients withVITK1(VITK1 vITK1) {
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

    public TotalNutrients withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("eNERCKCAL", eNERCKCAL).append("fAT", fAT).append("fASAT", fASAT).append("fATRN", fATRN).append("fAMS", fAMS).append("fAPU", fAPU).append("cHOCDF", cHOCDF).append("fIBTG", fIBTG).append("sUGAR", sUGAR).append("pROCNT", pROCNT).append("cHOLE", cHOLE).append("nA", nA).append("cA", cA).append("mG", mG).append("k", k).append("fE", fE).append("zN", zN).append("p", p).append("vITARAE", vITARAE).append("vITC", vITC).append("tHIA", tHIA).append("rIBF", rIBF).append("nIA", nIA).append("vITB6A", vITB6A).append("fOLDFE", fOLDFE).append("fOLFD", fOLFD).append("vITB12", vITB12).append("vITD", vITD).append("tOCPHA", tOCPHA).append("vITK1", vITK1).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cHOCDF).append(tHIA).append(fOLDFE).append(fE).append(fOLFD).append(nA).append(eNERCKCAL).append(fAMS).append(vITB6A).append(pROCNT).append(vITD).append(vITARAE).append(vITC).append(fASAT).append(cA).append(vITK1).append(fIBTG).append(k).append(fATRN).append(nIA).append(vITB12).append(rIBF).append(fAPU).append(tOCPHA).append(cHOLE).append(additionalProperties).append(p).append(mG).append(sUGAR).append(zN).append(fAT).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TotalNutrients) == false) {
            return false;
        }
        TotalNutrients rhs = ((TotalNutrients) other);
        return new EqualsBuilder().append(cHOCDF, rhs.cHOCDF).append(tHIA, rhs.tHIA).append(fOLDFE, rhs.fOLDFE).append(fE, rhs.fE).append(fOLFD, rhs.fOLFD).append(nA, rhs.nA).append(eNERCKCAL, rhs.eNERCKCAL).append(fAMS, rhs.fAMS).append(vITB6A, rhs.vITB6A).append(pROCNT, rhs.pROCNT).append(vITD, rhs.vITD).append(vITARAE, rhs.vITARAE).append(vITC, rhs.vITC).append(fASAT, rhs.fASAT).append(cA, rhs.cA).append(vITK1, rhs.vITK1).append(fIBTG, rhs.fIBTG).append(k, rhs.k).append(fATRN, rhs.fATRN).append(nIA, rhs.nIA).append(vITB12, rhs.vITB12).append(rIBF, rhs.rIBF).append(fAPU, rhs.fAPU).append(tOCPHA, rhs.tOCPHA).append(cHOLE, rhs.cHOLE).append(additionalProperties, rhs.additionalProperties).append(p, rhs.p).append(mG, rhs.mG).append(sUGAR, rhs.sUGAR).append(zN, rhs.zN).append(fAT, rhs.fAT).isEquals();
    }

}
