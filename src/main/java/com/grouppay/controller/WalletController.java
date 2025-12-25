package com.grouppay.controller;

//import com.grouppay.model.Debt;
import com.grouppay.model.Wallet;
//import com.grouppay.model.Transaction;
import com.grouppay.model.WalletMember;
import com.grouppay.repository.WalletMemberRepository;
import com.grouppay.service.WalletService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/wallet")
@CrossOrigin("*")
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    // ---------------- Existing Methods ----------------
    @PostMapping("/create")
    public String createWallet(@RequestBody Wallet wallet) {

        // DEBUG (IMPORTANT)
        System.out.println("Wallet Name: " + wallet.getWalletName());
        System.out.println("UPI Alias: " + wallet.getUpiAlias());

        walletService.createWallet(wallet);
        return "WALLET_CREATED";
    }

    @GetMapping("/all")
    public List<Wallet> getAllWallets() {
        return walletService.getAllWallets();
    }

    @GetMapping("/{id}")
    public Wallet getWalletById(@PathVariable Long id) {
        return walletService.getWalletById(id);
    }

    @PostMapping("/add-money")
    public Wallet addMoney(@RequestParam Long userId,
                           @RequestParam Double amount) {
        return walletService.addMoney(userId, amount);
    }

    /*@PostMapping("/split-money")
    public ResponseEntity<?> splitMoney(
            @RequestParam Long walletId,
            @RequestParam Double amount) {

        try {
            Wallet wallet = walletService.splitMoney(walletId, amount); // call service method
            return ResponseEntity.ok(wallet);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(e.getMessage());
        }
    }*/

    /*@GetMapping("/debts")
    public ResponseEntity<?> getDebts(@RequestParam Long walletId) {
        try {
            WalletMemberRepository debtRepository = null;
            List<WalletMember> debts = debtRepository.findByWalletId(walletId);
            // Optional: map to DTO with names instead of full objects
            List<Map<String, String>> result = debts.stream().map(d -> Map.of(
                    "fromUserName", d.getFromUser().getName(),
                    "toUserName", d.getToUser().getName(),
                    "amount", d.getAmount()
            )).toList();

            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }*/



    // ---------------- New Methods for Transactions ----------------

    // Get main wallet for a user
   /* @GetMapping("/main")
    public Wallet getMainWallet(@RequestParam String userId) {
        return walletService.getMainWallet(userId);
    }

    // Add money to a wallet
    @PostMapping("/add-money")
    public Wallet addMoney(@RequestParam String userId, @RequestParam double amount) {
        return walletService.addMoney(userId, amount);
    }

    // Get recent 10 transactions
    @GetMapping("/transactions")
    public List<Transaction> getRecentTransactions(@RequestParam String userId) {
        return walletService.getRecentTransactions(userId);
    }*/
}
