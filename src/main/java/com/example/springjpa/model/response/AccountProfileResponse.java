package com.example.springjpa.model.response;

import java.time.LocalDate;

public interface AccountProfileResponse {

    Integer getId();

    String getUsername();

    String getName();

    String getAddress();

    String getPhone();

    Integer getAge();

    LocalDate getBirthday();
}
