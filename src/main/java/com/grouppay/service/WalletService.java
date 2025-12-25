package com.grouppay.service;

//import com.grouppay.model.Debt;
import com.grouppay.model.User;
import com.grouppay.model.Wallet;
//import com.grouppay.model.Transaction;
//import com.grouppay.repository.DebtRepository;
import com.grouppay.repository.WalletRepository;
//import com.grouppay.repository.TransactionRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.time.LocalDateTime;
import java.util.List;

@Service
public class WalletService {

    private final WalletRepository walletRepository;

    //@Autowired
    //private TransactionRepository transactionRepository;

    //@Autowired
    //private DebtRepository debtRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    // Existing methods
    public Wallet createWallet(Wallet wallet) {
        return walletRepository.save(wallet);
    }

    public List<Wallet> getAllWallets() {
        return walletRepository.findAll();
    }


    public Wallet getWalletById(Long id) {
        return walletRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Wallet not found"));
    }

    public Wallet addMoney(Long walletId, Double amount) {
        Wallet wallet = walletRepository.findById(walletId)
                .orElseThrow(() -> new RuntimeException("Wallet not found"));

        wallet.setBalance(wallet.getBalance() + amount);
        walletRepository.save(wallet);

        return wallet; // 🔥 THIS IS CRITICAL
    }

    /*public Wallet splitMoney(Long walletId, Double amount) {
        Wallet wallet = walletRepository.findById(walletId)
                .orElseThrow(() -> new RuntimeException("Wallet not found"));

        List<User> members = wallet.getMembers();
        int numMembers = members.size();
        double share = amount / numMembers;

        for (User member : members) {
            if (!member.getId().equals(wallet.getOwner().getId())) {
                Debt debt = new Debt();
                debt.setFromUser(member);
                debt.setToUser(wallet.getOwner());
                debt.setWallet(wallet); // important!
                debt.setAmount(share);
                debtRepository.save(debt);
            }
        }

        // Record transaction
        Transaction tx = new Transaction();
        tx.setWallet(wallet); // correct
        tx.setType("CREDIT");
        tx.setAmount(amount);
        tx.setTimestamp(LocalDateTime.now());
        transactionRepository.save(tx);

        // Update wallet balance
        wallet.setBalance(wallet.getBalance() + amount);
        return walletRepository.save(wallet);
    }*/





    // ----- New Methods for Transactions -----

    // Get main wallet of a user
    /*public Wallet getMainWallet(String userId) {
        return walletRepository.findByUserId(userId);
    }

    // Add money to wallet
    public Wallet addMoney(String userId, double amount) {
        Wallet wallet = walletRepository.findByUserId(userId);
        if(wallet == null) {
            throw new RuntimeException("Wallet not found for user: " + userId);
        }

        wallet.setBalance(wallet.getBalance() + amount);
        walletRepository.save(wallet);

        // Create transaction record
        Transaction txn = new Transaction();
        txn.setWallet(wallet);
        txn.setAmount(amount);
        txn.setType("CREDIT");
        txn.setTimestamp(LocalDateTime.now());
        transactionRepository.save(txn);

        return wallet;
    }

    // Get recent 10 transactions
    public List<Transaction> getRecentTransactions(String userId) {
        Wallet wallet = walletRepository.findByUserId(userId);
        if(wallet == null) {
            throw new RuntimeException("Wallet not found for user: " + userId);
        }
        return transactionRepository.findTop10ByWalletOrderByTimestampDesc(wallet);
    }*/
}

