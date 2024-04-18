package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String clientId;

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private String description;

    protected Portfolio() {

    }

    public Portfolio(String clientId, String portfolioName, String description) {
        this.clientId = clientId;
        this.portfolioName = portfolioName;
        this.description = description;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
