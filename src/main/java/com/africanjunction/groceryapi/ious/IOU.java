package com.AfricanJunction.groceryapi.ious;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "ious")
public class IOU {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String borrower;

    @Column(nullable = false)
    private String lender;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false)
    private Instant dateTime;

    // Default constructor
    public IOU() {
        this("Unknown Borrower", "Unknown Lender", BigDecimal.ZERO, Instant.now());
    }

    // Parameterized constructor
    public IOU(String borrower, String lender, BigDecimal amount, Instant dateTime) {
        this.borrower = borrower;
        this.lender = lender;
        this.amount = amount;
        this.dateTime = dateTime;
    }

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getLender() {
        return lender;
    }

    public void setLender(String lender) {
        this.lender = lender;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Instant getDateTime() {
        return dateTime;
    }

    public void setDateTime(Instant dateTime) {
        this.dateTime = dateTime;
    }
}


