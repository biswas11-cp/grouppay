/*package com.grouppay.service;

import com.grouppay.model.Transaction;
import com.grouppay.model.Wallet;
import com.grouppay.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    // Add a transaction
    public Transaction addTransaction(Wallet wallet, Double amount, String type, String doneBy, Long walletId) {
        if (wallet == null) throw new RuntimeException("Wallet cannot be null");

        Transaction transaction = new Transaction(walletId, amount, "CREDIT", doneBy);
        transaction.setWalletId(wallet.getId());
        transaction.setAmount(amount);
        transaction.setType(type.toUpperCase()); // ensure CREDIT/DEBIT
        transaction.setDoneBy(doneBy);
        transaction.setTimestamp(LocalDateTime.now());

        return transactionRepository.save(transaction);
    }

    // Get all transactions for a wallet (latest first)
    public List<Transaction> getTransactionsByWallet(Wallet wallet) {
        if (wallet == null) throw new RuntimeException("Wallet cannot be null");
        return transactionRepository.findByWalletIdOrderByTimestampDesc(wallet.getId());
    }
}*/
