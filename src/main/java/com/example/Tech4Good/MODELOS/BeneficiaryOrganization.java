package com.example.Tech4Good.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name="BeneficiaryOrganization")
public class BeneficiaryOrganization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrganization;

    @Column(name = "nameOrganization", nullable = false)
    private String nameOrganization;

    @Column(name = "identificationNumber", nullable = false)
    private String identificationNumber;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;

    @Column(name = "addressOrganization", nullable = false)
    private String addressOrganization;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "contactPerson", nullable = false)
    private String contactPerson;

    @Column(name = "organizationType", nullable = false)
    private String organizationType;

    public BeneficiaryOrganization() {
    }

    public BeneficiaryOrganization(Long idOrganization, String nameOrganization, String identificationNumber, String email, String phoneNumber, String addressOrganization, String city, String contactPerson, String organizationType) {
        this.idOrganization = idOrganization;
        this.nameOrganization = nameOrganization;
        this.identificationNumber = identificationNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.addressOrganization = addressOrganization;
        this.city = city;
        this.contactPerson = contactPerson;
        this.organizationType = organizationType;
    }

    public Long getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(Long idOrganization) {
        this.idOrganization = idOrganization;
    }

    public String getNameOrganization() {
        return nameOrganization;
    }

    public void setNameOrganization(String nameOrganization) {
        this.nameOrganization = nameOrganization;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddressOrganization() {
        return addressOrganization;
    }

    public void setAddressOrganization(String addressOrganization) {
        this.addressOrganization = addressOrganization;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }
}
