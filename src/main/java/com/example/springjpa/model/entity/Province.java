package com.example.springjpa.model.entity;


import javax.persistence.*;

@Table
@Entity(name = "provinces")
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
    private String name;
    @Column(name = "name_en")
    private String nameEn;
    @Column(name = "code_name")
    private String codeName;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "full_name_en")
    private String fullNameEn;
    @Column(name = "administrative_unit_id")
    private int unitId;
    @Column(name = "administrative_region_id")
    private int regionId;

    public String getCode() {
        return code;
    }

    public Province setCode(String code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public Province setName(String name) {
        this.name = name;
        return this;
    }

    public String getNameEn() {
        return nameEn;
    }

    public Province setNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    public String getCodeName() {
        return codeName;
    }

    public Province setCodeName(String codeName) {
        this.codeName = codeName;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public Province setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getFullNameEn() {
        return fullNameEn;
    }

    public Province setFullNameEn(String fullNameEn) {
        this.fullNameEn = fullNameEn;
        return this;
    }

    public int getUnitId() {
        return unitId;
    }

    public Province setUnitId(int unitId) {
        this.unitId = unitId;
        return this;
    }

    public int getRegionId() {
        return regionId;
    }

    public Province setRegionId(int regionId) {
        this.regionId = regionId;
        return this;
    }
}
