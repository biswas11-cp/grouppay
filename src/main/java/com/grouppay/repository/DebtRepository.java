/*package com.grouppay.repository;

import com.grouppay.model.Debt;
import com.grouppay.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DebtRepository extends JpaRepository<Debt, Long> {

    // Get all debts for a specific wallet
    List<Debt> findByWallet(Wallet wallet);

    // Optional: get all debts where a specific user owes money
    List<Debt> findByFromUserId(Long userId);

    // Optional: get all debts where a specific user is owed money
    List<Debt> findByToUserId(Long userId);
}*/
