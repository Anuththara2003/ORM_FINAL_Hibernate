package com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.custom;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.SuperBo;

public interface PasswordEncryptBo extends SuperBo {
    public String encryptPassword(String password);
    public boolean checkedPassword(String normalPassword, String encodedPassword);

}
