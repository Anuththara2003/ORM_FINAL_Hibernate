package com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.custom;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.SuperBo;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dto.UserDto;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.User;


import java.sql.SQLException;
import java.util.List;

public interface UserBo extends SuperBo {
     User getUser(String userName);
     String getNextId() throws SQLException;
     boolean save(UserDto user) throws SQLException;
     boolean delete(String userId) throws SQLException;
     List<UserDto> getAll() throws SQLException;
     boolean update(UserDto dto) throws SQLException;

}
