package com.grouppay.repository;

import com.grouppay.model.WalletMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface WalletMemberRepository extends JpaRepository<WalletMember, Long> {

    List<WalletMember> findByWalletId(Long walletId);
    boolean existsByWalletIdAndMemberIdentifier(Long walletId, String memberIdentifier);
}
