package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long clientId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String financialAdvisorId;

    protected Client() {
        // Default constructor required by JPA
    }

    public Client(String firstName, String lastName, String financialAdvisorId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.financialAdvisorId = financialAdvisorId;
    }

    public Long getClientId() {
        return clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFinancialAdvisorId() {
        return financialAdvisorId;
    }

    public void setFinancialAdvisorId(String financialAdvisorId) {
        this.financialAdvisorId = financialAdvisorId;
    }
}
