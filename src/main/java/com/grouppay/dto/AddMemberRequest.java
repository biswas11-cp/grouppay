package com.grouppay.dto;

public class AddMemberRequest {

    private Long walletId;
    private String memberIdentifier; // email or phone
    private String role;             // ADMIN or MEMBER

    public Long getWalletId() {
        return walletId;
    }

    public void setWalletId(Long walletId) {
        this.walletId = walletId;
    }


    public String getMemberIdentifier() { return memberIdentifier; }
    public void setMemberIdentifier(String memberIdentifier) { this.memberIdentifier = memberIdentifier; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }


}

