package com.grouppay.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "wallet")
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String walletName;

    private String withdrawPermission;
    private String addMemberPermission;
    private String upiPermission;
    private double balance=0;

   // @Column(nullable = false)
    //private String userId; // owner of the wallet

    @Column(unique = true)
    private String upiAlias;

    //@OneToMany(mappedBy = "wallet", cascade = CascadeType.ALL, fetch = FetchType.LAZY,  orphanRemoval = true)
    //private List<User> members =new ArrayList<>();

    //@OneToMany(mappedBy = "wallet", cascade = CascadeType.ALL, fetch = FetchType.LAZY,  orphanRemoval = true)
    //private List<Debt> debts =new ArrayList<>();

    //@ManyToOne
    //@JoinColumn(name = "owner_id", nullable = false)
    //private User owner;


    // ===== GETTERS & SETTERS =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWalletName() {
        return walletName;
    }

    public void setWalletName(String walletName) {
        this.walletName = walletName;
    }

    public String getWithdrawPermission() {
        return withdrawPermission;
    }

    public void setWithdrawPermission(String withdrawPermission) {
        this.withdrawPermission = withdrawPermission;
    }

    public String getAddMemberPermission() {
        return addMemberPermission;
    }

    public void setAddMemberPermission(String addMemberPermission) {
        this.addMemberPermission = addMemberPermission;
    }

    public String getUpiPermission() {
        return upiPermission;
    }

    public void setUpiPermission(String upiPermission) {
        this.upiPermission = upiPermission;
    }

    public String getUpiAlias() {
        return upiAlias;
    }

    public void setUpiAlias(String upiAlias) {
        this.upiAlias = upiAlias;
    }


   public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



    /*public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }*/
}
