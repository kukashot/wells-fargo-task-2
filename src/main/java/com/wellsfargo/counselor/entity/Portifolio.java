package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long portfolioId;

    @Column(nullable = false)
    private String has;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Client client;

    protected Portfolio() {
        // Default constructor required by JPA
    }

    public Portfolio(String has, Client client) {
        this.has = has;
        this.client = client;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getHas() {
        return has;
    }

    public void setHas(String has) {
        this.has = has;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
