package com.kaamoo.companymanagement.entity;

public class CompanyWithBLOBs extends Company {
    private String feecontent;

    private String agreement;

    private String agreementemploy;

    public String getFeecontent() {
        return feecontent;
    }

    public void setFeecontent(String feecontent) {
        this.feecontent = feecontent == null ? null : feecontent.trim();
    }

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement == null ? null : agreement.trim();
    }

    public String getAgreementemploy() {
        return agreementemploy;
    }

    public void setAgreementemploy(String agreementemploy) {
        this.agreementemploy = agreementemploy == null ? null : agreementemploy.trim();
    }
}