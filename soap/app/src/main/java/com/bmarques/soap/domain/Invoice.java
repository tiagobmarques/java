package com.bmarques.soap.domain;

import java.time.LocalDate;

public class Invoice {

    private Long id;
    private String client;
    private LocalDate installmentDate;
    private Double value;

    public Invoice() {
    }

    public Invoice(Long id, String client, LocalDate installmentDate, Double value) {
        this.id = id;
        this.client = client;
        this.installmentDate = installmentDate;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public LocalDate getInstallmentDate() {
        return installmentDate;
    }

    public void setInstallmentDate(LocalDate installmentDate) {
        this.installmentDate = installmentDate;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
