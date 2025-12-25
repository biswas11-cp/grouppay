package com.grouppay.service;

import com.grouppay.model.WalletMember;
import com.grouppay.repository.WalletMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletMemberService {

    @Autowired
    private WalletMemberRepository repository;

    public void addMember(Long walletId, String identifier, String role) {

        // 🔴 DEBUG LINE (ADD THIS)
        System.out.println(
                "DEBUG → walletId=" + walletId +
                        ", identifier=" + identifier +
                        ", role=" + role
        );

        WalletMember member = new WalletMember();
        member.setWalletId(walletId);
        member.setMemberIdentifier(identifier);
        member.setRole(role);

        repository.save(member); // MUST BE PRESENT
    }
    public List<WalletMember> getMembers(Long walletId) {
        return repository.findByWalletId(walletId);
    }

    public void removeMember(Long memberId) {
        repository.deleteById(memberId);
    }



}
