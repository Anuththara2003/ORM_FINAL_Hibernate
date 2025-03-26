package com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.CrudDao;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.User;

public interface UserDao extends CrudDao<User> {
    User getUser(String userName);
}
