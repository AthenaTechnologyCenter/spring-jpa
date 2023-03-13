package com.example.springjpa.model.response;


public class ProvinceResponse {
    private String code;
    private String name;
    private String nameEn;
    private String codeName;
    private String fullName;
    private String fullNameEn;
    private String regionName;

    public ProvinceResponse() {
    }

    public ProvinceResponse(String code, String name, String nameEn, String codeName, String fullName, String fullNameEn, String regionName) {
        this.code = code;
        this.name = name;
        this.nameEn = nameEn;
        this.codeName = codeName;
        this.fullName = fullName;
        this.fullNameEn = fullNameEn;
        this.regionName = regionName;
    }

    public String getCode() {
        return code;
    }

    public ProvinceResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProvinceResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getNameEn() {
        return nameEn;
    }

    public ProvinceResponse setNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    public String getCodeName() {
        return codeName;
    }

    public ProvinceResponse setCodeName(String codeName) {
        this.codeName = codeName;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public ProvinceResponse setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getFullNameEn() {
        return fullNameEn;
    }

    public ProvinceResponse setFullNameEn(String fullNameEn) {
        this.fullNameEn = fullNameEn;
        return this;
    }

    public String getRegionName() {
        return regionName;
    }

    public ProvinceResponse setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
}
