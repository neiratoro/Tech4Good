package com.example.Tech4Good.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name="Donors")
public class Donors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDonor;

    @Column(name = "nameDonor", nullable = false)
    private String nameDonor;

    @Column(name = "identificationNumber", nullable = false)
    private String identificationNumber;

    @Column(name = "donorType", nullable = false)
    private String donorType;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;

    @Column(name = "addressDonor", nullable = false)
    private String addressDonor;

    @Column(name = "city", nullable = false)
    private String city;

    public Donors() {
    }

    public Donors(Long idDonor, String nameDonor, String identificationNumber, String donorType, String email, String phoneNumber, String addressDonor, String city) {
        this.idDonor = idDonor;
        this.nameDonor = nameDonor;
        this.identificationNumber = identificationNumber;
        this.donorType = donorType;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.addressDonor = addressDonor;
        this.city = city;
    }

    public Long getIdDonor() {
        return idDonor;
    }

    public void setIdDonor(Long idDonor) {
        this.idDonor = idDonor;
    }

    public String getNameDonor() {
        return nameDonor;
    }

    public void setNameDonor(String nameDonor) {
        this.nameDonor = nameDonor;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getDonorType() {
        return donorType;
    }

    public void setDonorType(String donorType) {
        this.donorType = donorType;
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

    public String getAddressDonor() {
        return addressDonor;
    }

    public void setAddressDonor(String addressDonor) {
        this.addressDonor = addressDonor;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
