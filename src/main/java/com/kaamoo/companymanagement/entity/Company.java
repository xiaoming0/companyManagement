package com.kaamoo.companymanagement.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.kaamoo.companymanagement.util.JsonDateSerializer;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class Company {
    private Long id;

    @JsonSerialize(using=JsonDateSerializer.class)
    private Date created;

    @JsonSerialize(using=JsonDateSerializer.class)
    private Date updated;

    @NotEmpty(message="公司名称简称不能为空")
    private String abbreviation;

    @NotEmpty(message = "公司地址不能为空")
    private String companyaddress;

    @NotEmpty(message = "公司名字不能为空")
    private String companyname;


    private Boolean companytype;

    @Email(message = "电子邮件格式不对")
    private String email;

    private String fox;

    private String fzzphone;//400电话

    @NotNull(message = "公司纬度不能为空")
    private Double latitude;

    private String logo;

    @NotNull(message = "公司经度不能为空")
    private Double longitude;

    @NotEmpty(message = "公司负责人不能为空")
    private String manager;

    private String memo;

    private String mobilephone;

    private Integer scope;

    @NotEmpty(message = "公司电话不能为空")
    private String telephone;

    @NotNull(message = "收费标准不能为空")
    private Long areaId;//收费标准

    private String pinyin;

    private String signname;

    private Long driverlevelId;

    @NotEmpty(message = "appKey 不能为空")
    private String appkey;

    private String filialeAppKey;

    @NotEmpty(message = "城市名不能为空")
    private String cityname;

    @NotEmpty(message = "省份不能为空")
    private String provname;

    private String picture;

    private String introducetitle;

    private String introducecontent;

    private String recommendpicture;

    private String recommendintroducetitle;

    private String recommendintroducecontent;

    private String companyweburl;

    private String sharetitle;

    private String sharecontent;

    private String shareimage;

    private String shareurl;

    public String getFilialeAppKey() {
        return filialeAppKey;
    }

    public void setFilialeAppKey(String filialeAppKey) {
        this.filialeAppKey = filialeAppKey;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation == null ? null : abbreviation.trim();
    }

    public String getCompanyaddress() {
        return companyaddress;
    }

    public void setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress == null ? null : companyaddress.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public Boolean getCompanytype() {
        return companytype==null?Boolean.FALSE:this.companytype;
    }

    public void setCompanytype(Boolean companytype) {
        this.companytype = companytype;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getFox() {
        return fox;
    }

    public void setFox(String fox) {
        this.fox = fox == null ? null : fox.trim();
    }

    public String getFzzphone() {
        return fzzphone;
    }

    public void setFzzphone(String fzzphone) {
        this.fzzphone = fzzphone == null ? null : fzzphone.trim();
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public Integer getScope() {
        return scope;
    }

    public void setScope(Integer scope) {
        this.scope = scope;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    public String getSignname() {
        return signname;
    }

    public void setSignname(String signname) {
        this.signname = signname == null ? null : signname.trim();
    }

    public Long getDriverlevelId() {
        return driverlevelId;
    }

    public void setDriverlevelId(Long driverlevelId) {
        this.driverlevelId = driverlevelId;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey == null ? null : appkey.trim();
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public String getProvname() {
        return provname;
    }

    public void setProvname(String provname) {
        this.provname = provname == null ? null : provname.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getIntroducetitle() {
        return introducetitle;
    }

    public void setIntroducetitle(String introducetitle) {
        this.introducetitle = introducetitle == null ? null : introducetitle.trim();
    }

    public String getIntroducecontent() {
        return introducecontent;
    }

    public void setIntroducecontent(String introducecontent) {
        this.introducecontent = introducecontent == null ? null : introducecontent.trim();
    }

    public String getRecommendpicture() {
        return recommendpicture;
    }

    public void setRecommendpicture(String recommendpicture) {
        this.recommendpicture = recommendpicture == null ? null : recommendpicture.trim();
    }

    public String getRecommendintroducetitle() {
        return recommendintroducetitle;
    }

    public void setRecommendintroducetitle(String recommendintroducetitle) {
        this.recommendintroducetitle = recommendintroducetitle == null ? null : recommendintroducetitle.trim();
    }

    public String getRecommendintroducecontent() {
        return recommendintroducecontent;
    }

    public void setRecommendintroducecontent(String recommendintroducecontent) {
        this.recommendintroducecontent = recommendintroducecontent == null ? null : recommendintroducecontent.trim();
    }

    public String getCompanyweburl() {
        return companyweburl;
    }

    public void setCompanyweburl(String companyweburl) {
        this.companyweburl = companyweburl == null ? null : companyweburl.trim();
    }

    public String getSharetitle() {
        return sharetitle;
    }

    public void setSharetitle(String sharetitle) {
        this.sharetitle = sharetitle == null ? null : sharetitle.trim();
    }

    public String getSharecontent() {
        return sharecontent;
    }

    public void setSharecontent(String sharecontent) {
        this.sharecontent = sharecontent == null ? null : sharecontent.trim();
    }

    public String getShareimage() {
        return shareimage;
    }

    public void setShareimage(String shareimage) {
        this.shareimage = shareimage == null ? null : shareimage.trim();
    }

    public String getShareurl() {
        return shareurl;
    }

    public void setShareurl(String shareurl) {
        this.shareurl = shareurl == null ? null : shareurl.trim();
    }
}