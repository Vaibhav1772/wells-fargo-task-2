package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String name;
    private String contactInfo;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor financialAdvisor;

    @OneToOne(mappedBy = "client")
    private Portfolio portfolio;

    protected Client() {
    }
    public Client(String name, Long clientId, String contactInfo, Advisor financialAdvisor, Portfolio portfolio) {
        this.name = name;
        this.clientId = clientId;
        this.contactInfo = contactInfo;
        this.financialAdvisor = financialAdvisor;
        this.portfolio = portfolio;
    }

    // Getters and Setters
    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Advisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public void setFinancialAdvisor(Advisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
