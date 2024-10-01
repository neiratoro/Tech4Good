package com.example.Tech4Good.MODELOS;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="DeliveryAct")
public class DeliveryAct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDelivery;

    @Column(name = "descriptionDelivery", nullable = false)
    private String descriptionDelivery;

    @Column(name = "deliveryDate", nullable = false)
    private LocalDate deliveryDate;

    @Column(name = "idOrganization", nullable = false)
    private Long idOrganization;

    @Column(name = "idProduct", nullable = false)
    private Long idProduct;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    public DeliveryAct() {
    }

    public DeliveryAct(Long idDelivery, String descriptionDelivery, LocalDate deliveryDate, Long idOrganization, Long idProduct, Integer quantity) {
        this.idDelivery = idDelivery;
        this.descriptionDelivery = descriptionDelivery;
        this.deliveryDate = deliveryDate;
        this.idOrganization = idOrganization;
        this.idProduct = idProduct;
        this.quantity = quantity;
    }

    public Long getIdDelivery() {
        return idDelivery;
    }

    public void setIdDelivery(Long idDelivery) {
        this.idDelivery = idDelivery;
    }

    public String getDescriptionDelivery() {
        return descriptionDelivery;
    }

    public void setDescriptionDelivery(String descriptionDelivery) {
        this.descriptionDelivery = descriptionDelivery;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Long getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(Long idOrganization) {
        this.idOrganization = idOrganization;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
