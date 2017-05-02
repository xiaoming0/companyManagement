package com.kaamoo.companymanagement.entity;

public class CollectFeesSet {
    private Long id;

    private Long companyId;

    private Integer djInsuranceType;

    private Long djiMoneyOrder;

    private Long djiMoneyMonth;

    private Integer djiDeductTimeOrder;

    private Integer djiDeductTimeMonth;

    private Integer insureScopeStart;

    private Integer insureScopeEnd;

    private Integer driveYear;

    private Integer mishapInsuranceType;

    private Integer miMoneyOrder;

    private Integer miMoneyMonth;

    private Integer miDeductTimeOrder;

    private Integer miDeductTimeMonth;

    private Integer infoCostType;

    private Integer icMoneyOrder;

    private Integer icMoneyMonth;

    private Integer icDeductTimeOrder;

    private Integer icDeductTimeMonth;

    private String djInsuranceMemo;

    private String mishapInsuranceMemo;

    private String chargeContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Integer getDjInsuranceType() {
        return djInsuranceType;
    }

    public void setDjInsuranceType(Integer djInsuranceType) {
        this.djInsuranceType = djInsuranceType;
    }

    public Long getDjiMoneyOrder() {
        return djiMoneyOrder;
    }

    public void setDjiMoneyOrder(Long djiMoneyOrder) {
        this.djiMoneyOrder = djiMoneyOrder;
    }

    public Long getDjiMoneyMonth() {
        return djiMoneyMonth;
    }

    public void setDjiMoneyMonth(Long djiMoneyMonth) {
        this.djiMoneyMonth = djiMoneyMonth;
    }

    public Integer getDjiDeductTimeOrder() {
        return djiDeductTimeOrder;
    }

    public void setDjiDeductTimeOrder(Integer djiDeductTimeOrder) {
        this.djiDeductTimeOrder = djiDeductTimeOrder;
    }

    public Integer getDjiDeductTimeMonth() {
        return djiDeductTimeMonth;
    }

    public void setDjiDeductTimeMonth(Integer djiDeductTimeMonth) {
        this.djiDeductTimeMonth = djiDeductTimeMonth;
    }

    public Integer getInsureScopeStart() {
        return insureScopeStart;
    }

    public void setInsureScopeStart(Integer insureScopeStart) {
        this.insureScopeStart = insureScopeStart;
    }

    public Integer getInsureScopeEnd() {
        return insureScopeEnd;
    }

    public void setInsureScopeEnd(Integer insureScopeEnd) {
        this.insureScopeEnd = insureScopeEnd;
    }

    public Integer getDriveYear() {
        return driveYear;
    }

    public void setDriveYear(Integer driveYear) {
        this.driveYear = driveYear;
    }

    public Integer getMishapInsuranceType() {
        return mishapInsuranceType;
    }

    public void setMishapInsuranceType(Integer mishapInsuranceType) {
        this.mishapInsuranceType = mishapInsuranceType;
    }

    public Integer getMiMoneyOrder() {
        return miMoneyOrder;
    }

    public void setMiMoneyOrder(Integer miMoneyOrder) {
        this.miMoneyOrder = miMoneyOrder;
    }

    public Integer getMiMoneyMonth() {
        return miMoneyMonth;
    }

    public void setMiMoneyMonth(Integer miMoneyMonth) {
        this.miMoneyMonth = miMoneyMonth;
    }

    public Integer getMiDeductTimeOrder() {
        return miDeductTimeOrder;
    }

    public void setMiDeductTimeOrder(Integer miDeductTimeOrder) {
        this.miDeductTimeOrder = miDeductTimeOrder;
    }

    public Integer getMiDeductTimeMonth() {
        return miDeductTimeMonth;
    }

    public void setMiDeductTimeMonth(Integer miDeductTimeMonth) {
        this.miDeductTimeMonth = miDeductTimeMonth;
    }

    public Integer getInfoCostType() {
        return infoCostType;
    }

    public void setInfoCostType(Integer infoCostType) {
        this.infoCostType = infoCostType;
    }

    public Integer getIcMoneyOrder() {
        return icMoneyOrder;
    }

    public void setIcMoneyOrder(Integer icMoneyOrder) {
        this.icMoneyOrder = icMoneyOrder;
    }

    public Integer getIcMoneyMonth() {
        return icMoneyMonth;
    }

    public void setIcMoneyMonth(Integer icMoneyMonth) {
        this.icMoneyMonth = icMoneyMonth;
    }

    public Integer getIcDeductTimeOrder() {
        return icDeductTimeOrder;
    }

    public void setIcDeductTimeOrder(Integer icDeductTimeOrder) {
        this.icDeductTimeOrder = icDeductTimeOrder;
    }

    public Integer getIcDeductTimeMonth() {
        return icDeductTimeMonth;
    }

    public void setIcDeductTimeMonth(Integer icDeductTimeMonth) {
        this.icDeductTimeMonth = icDeductTimeMonth;
    }

    public String getDjInsuranceMemo() {
        return djInsuranceMemo;
    }

    public void setDjInsuranceMemo(String djInsuranceMemo) {
        this.djInsuranceMemo = djInsuranceMemo == null ? null : djInsuranceMemo.trim();
    }

    public String getMishapInsuranceMemo() {
        return mishapInsuranceMemo;
    }

    public void setMishapInsuranceMemo(String mishapInsuranceMemo) {
        this.mishapInsuranceMemo = mishapInsuranceMemo == null ? null : mishapInsuranceMemo.trim();
    }

    public String getChargeContent() {
        return chargeContent;
    }

    public void setChargeContent(String chargeContent) {
        this.chargeContent = chargeContent == null ? null : chargeContent.trim();
    }
}