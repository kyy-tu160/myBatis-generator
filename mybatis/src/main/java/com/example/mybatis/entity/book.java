package com.example.mybatis.entity;

import java.math.BigDecimal;

public class book {
    private BigDecimal id;

    private String bookName;

    private String message;

    private Double price;

    public book(BigDecimal id, String bookName, String message, Double price) {
        this.id = id;
        this.bookName = bookName;
        this.message = message;
        this.price = price;
    }

    public book() {
        super();
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}