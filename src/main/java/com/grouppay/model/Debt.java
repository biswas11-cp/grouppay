/*package com.grouppay.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Debt implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "from_user_id", nullable = false)
    private User fromUser;   // The member who owes money

    @ManyToOne
    @JoinColumn(name = "to_user_id", nullable = false)
    private User toUser;     // The member to whom money is owed (usually wallet owner)

    @ManyToOne
    @JoinColumn(name = "wallet_id", nullable = false)
    private Wallet wallet;   // Wallet this debt belongs to

    private Double amount;   // Amount owed

    // Constructors
    public Debt() {}

    public Debt(User fromUser, User toUser, Wallet wallet, Double amount) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.wallet = wallet;
        this.amount = amount;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getFromUser() { return fromUser; }
    public void setFromUser(User fromUser) { this.fromUser = fromUser; }

    public User getToUser() { return toUser; }
    public void setToUser(User toUser) { this.toUser = toUser; }

    public Wallet getWallet() { return wallet; }
    public void setWallet(Wallet wallet) { this.wallet = wallet; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
}*/

