package com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.custom.impl;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.custom.PasswordEncryptBo;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncryptBoImpl implements PasswordEncryptBo {
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public PasswordEncryptBoImpl() {
        this.bCryptPasswordEncoder = new BCryptPasswordEncoder();
    }

    //  Ussr ge password eka encrypt karnne me method eken
    public String encryptPassword(String password) {
        return bCryptPasswordEncoder.encode(password);
    }

    // me methode eken thamayi user kenek log wenakota e log wena user ge password eka check karnne
    public boolean checkedPassword(String normalPassword, String encodedPassword) {
        return bCryptPasswordEncoder.matches(normalPassword,encodedPassword);

    }
}
