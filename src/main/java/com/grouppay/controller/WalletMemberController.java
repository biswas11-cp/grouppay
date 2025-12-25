package com.grouppay.controller;

import com.grouppay.dto.AddMemberRequest;
import com.grouppay.model.WalletMember;
import com.grouppay.service.WalletMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wallet/member")
@CrossOrigin("*")
public class WalletMemberController {

    @Autowired
    private WalletMemberService service;

    // ✅ Add member (FIXED)
    @PostMapping("/add")
    public ResponseEntity<String> addMember(@RequestBody AddMemberRequest request) {

        service.addMember(
                request.getWalletId(),
                request.getMemberIdentifier(),
                request.getRole()
        );

        return ResponseEntity.ok("Member added successfully");
    }

    // ✅ Get members
    @GetMapping("/{walletId}")
    public List<WalletMember> getMembers(@PathVariable Long walletId) {
        return service.getMembers(walletId);
    }
    // delete member
    @DeleteMapping("/delete/{memberId}")
    public ResponseEntity<String> deleteMember(@PathVariable Long memberId) {
        service.removeMember(memberId);
        return ResponseEntity.ok("Member removed successfully");
    }
}
