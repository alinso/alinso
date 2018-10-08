package com.alinso.cms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
public class Customer extends BaseEntity {

    public enum Gender {
        MALE,
        FEMALE
    }

    @Column(length = 35,unique = true)
    @NotBlank(message = "{Required.field}")
    private String username;

    @Column(length = 35)
    @NotBlank(message = "{Required.field}")
    private String name;

    @Column(length = 35)
    @NotBlank(message = "{Required.field}")
    private String surname;

    @Column(length = 45)
    @NotBlank(message = "{Required.field}")
    private String email;

    @Column(length = 200)
    @NotBlank(message = "{Required.field}")
    private String password;

    @NotNull(message = "{Required.field}")
    private Gender gender;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
