/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bearingpoint.service.impl;

import com.bearingpoint.dao.impl.UserDao;
import com.bearingpoint.entities.User;
import com.bearingpoint.service.intf.concrete.UserServiceIntf;
import com.bearingpoint.entities.User;
import java.io.Serializable;
import java.util.List;

public class UserServiceImpl implements UserServiceIntf<User, Long> {

    private static UserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDao();
    }

    @Override
    
    public User findByUserNamePassword(User entity) {
        userDao.openCurrentSession();
        User user = userDao.findByUserNamePassword(entity);
        userDao.closeCurrentSession();
        return user;
    }

    @Override
    public void persist(User entity) {
        userDao.openCurrentSessionwithTransaction();
        userDao.persist(entity);
        userDao.closeCurrentSessionwithTransaction();
    }

    @Override
    public void update(User entity) {
        userDao.openCurrentSessionwithTransaction();
        userDao.update(entity);
        userDao.closeCurrentSessionwithTransaction();
    }

    @Override
    public User findById(Long id) {
        userDao.openCurrentSession();
        User user = userDao.findById(id);
        userDao.closeCurrentSession();
        return user;
    }

    @Override
    public List<User> findAll() {
        userDao.openCurrentSession();
        List<User> users = userDao.findAll();
        userDao.closeCurrentSession();
        return users;
    }

    @Override
    public void deleteAll() {
        userDao.openCurrentSessionwithTransaction();
        userDao.deleteAll();
        userDao.closeCurrentSessionwithTransaction();
    }

    public UserDao userDao() {
        return userDao;
    }

    @Override
    public void delete(User entity) {
        userDao.openCurrentSessionwithTransaction();
        User user = userDao.findById(entity.getId());
        userDao.delete(user);
        userDao.closeCurrentSessionwithTransaction();
    }

}
