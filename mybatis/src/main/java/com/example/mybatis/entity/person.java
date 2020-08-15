package com.example.mybatis.entity;

import java.math.BigDecimal;

public class person {
    private BigDecimal id;

    private String address;

    private Long age;

    private String name;

    public person(BigDecimal id, String address, Long age, String name) {
        this.id = id;
        this.address = address;
        this.age = age;
        this.name = name;
    }

    public person() {
        super();
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}