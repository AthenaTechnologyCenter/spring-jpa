package com.example.springjpa.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Table
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Account extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private Long profileId;
    private String name;

    public Account() {
    }

    public Account(Long id, String username, String password, Long profileId, String name) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.profileId = profileId;
        this.name = name;
    }
}
