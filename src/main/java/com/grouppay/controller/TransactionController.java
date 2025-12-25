/*package com.grouppay.controller;

import com.grouppay.model.Transaction;
import com.grouppay.model.Wallet;
import com.grouppay.service.TransactionService;
import com.grouppay.service.WalletService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@CrossOrigin("*")
public class TransactionController {

    private final TransactionService transactionService;
    private final WalletService walletService;

    public TransactionController(TransactionService transactionService, WalletService walletService) {
        this.transactionService = transactionService;
        this.walletService = walletService;
    }

    // Add money / transaction
    @PostMapping("/add")
    public Transaction addTransaction(
            @RequestParam Long walletId,
            @RequestParam Double amount,
            @RequestParam String type,
            @RequestParam String doneBy
    ) {
        Wallet wallet = walletService.getWalletById(walletId);
        return transactionService.addTransaction(wallet, amount, type, doneBy, walletId);
    }

    // Get transactions for a wallet
    @GetMapping("/{walletId}")
    public List<Transaction> getTransactions(@PathVariable Long walletId) {
        Wallet wallet = walletService.getWalletById(walletId);
        return transactionService.getTransactionsByWallet(wallet);
    }
}*/
