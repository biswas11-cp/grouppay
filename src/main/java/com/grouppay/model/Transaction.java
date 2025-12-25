/*package com.grouppay.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "wallet_id", nullable = false)
    private Wallet wallet;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;  // Who added/paid the transaction

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private String type; // "CREDIT" or "DEBIT"

    @Column(nullable = false)
    private LocalDateTime timestamp;

    // Constructors
    public Transaction() {}

    public Transaction(Wallet wallet, User user, double amount, String type, LocalDateTime timestamp) {
        this.wallet = wallet;
        this.user = user;
        this.amount = amount;
        this.type = type;
        this.timestamp = timestamp;
    }

    public Transaction(Long walletId, Double amount, String credit, String doneBy) {
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Wallet getWallet() { return wallet; }
    public void setWallet(Wallet wallet) { this.wallet = wallet; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public void setWalletId(Long id) {
    }

    public void setDoneBy(String doneBy) {
    }
}*/
