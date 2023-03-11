package com.example.springjpa.model.entity;

import javax.persistence.*;

@Table
@Entity(name = "administrative_regions")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(name = "name_en")
    private String nameEn;
    @Column(name = "code_name")
    private String codeName;
    @Column(name = "code_name_en")
    private String codeNameEn;

    public Region() {
    }

    public Region(int id, String name, String nameEn, String codeName, String codeNameEn) {
        this.id = id;
        this.name = name;
        this.nameEn = nameEn;
        this.codeName = codeName;
        this.codeNameEn = codeNameEn;
    }

    public int getId() {
        return id;
    }

    public Region setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Region setName(String name) {
        this.name = name;
        return this;
    }

    public String getNameEn() {
        return nameEn;
    }

    public Region setNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    public String getCodeName() {
        return codeName;
    }

    public Region setCodeName(String codeName) {
        this.codeName = codeName;
        return this;
    }

    public String getCodeNameEn() {
        return codeNameEn;
    }

    public Region setCodeNameEn(String codeNameEn) {
        this.codeNameEn = codeNameEn;
        return this;
    }
}
