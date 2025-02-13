package com.africanjunction.groceryapi.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Payment payment;

    private Date receiptDate;
    private String details;

    // Constructors
    public Receipt() {}

    public Receipt(Payment payment, Date receiptDate, String details) {
        this.payment = payment;
        this.receiptDate = receiptDate;
        this.details = details;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
