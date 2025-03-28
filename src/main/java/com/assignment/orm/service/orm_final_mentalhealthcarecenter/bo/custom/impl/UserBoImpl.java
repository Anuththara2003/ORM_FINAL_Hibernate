package com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.custom.impl;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.BoFactory;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.custom.PasswordEncryptBo;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.custom.UserBo;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.DaoFactory;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom.UserDao;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dto.UserDto;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserBoImpl implements UserBo {
    private final UserDao userDao = DaoFactory.getInstance().getDAO(DaoFactory.DAOType.USER);
    private final PasswordEncryptBo passwordEncryptBo = BoFactory.getInstance().getBo(BoFactory.BOType.PASSWORD);

    @Override
    public User getUser(String userName) {
        return userDao.getUser(userName);
    }

    @Override
    public String getNextId() throws SQLException {
        String id = userDao.getNextId();
        if (id != null) {
            String lastId = id.substring(1);
            String substring = lastId.substring(1);
            int i = Integer.parseInt(substring);
            int newIdIndex = i + 1;
            return String.format("A%03d", newIdIndex);
        }
        return "A001";
    }

    @Override
    public boolean save(UserDto userDto) throws SQLException {
        User user = new User();
        user.setUser_id(userDto.getUser_id());
        user.setUsername(userDto.getUsername());
        user.setPassword(passwordEncryptBo.encryptPassword(userDto.getPassword()));
        user.setRole(userDto.getRole());

        return userDao.save(user);
    }

    @Override
    public boolean delete(String userId) throws SQLException {
        return userDao.delete(userId);
    }

    @Override
    public List<UserDto> getAll() throws SQLException {
        List<User> users = userDao.getAll();
        List<UserDto> userDtos = new ArrayList<>();

        for (User user : users) {
            UserDto userDto = new UserDto();
            userDto.setUser_id(user.getUser_id());
            userDto.setUsername(user.getUsername());
            userDto.setRole(user.getRole());

            userDtos.add(userDto);
        }
        return userDtos;
    }

    @Override
    public boolean update(UserDto dto) throws SQLException {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setUser_id(dto.getUser_id());
        user.setRole(dto.getRole());
        user.setPassword(passwordEncryptBo.encryptPassword(dto.getPassword()));

        return userDao.update(user);
    }
}
