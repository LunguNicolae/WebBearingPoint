/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bearingpoint.service.impl;

import com.bearingpoint.dao.impl.UserRoleDao;
import com.bearingpoint.entities.UserRole;
import com.bearingpoint.service.intf.GeneralServiceIntf;
import com.bearingpoint.service.intf.concrete.UserServiceIntf;

import java.util.List;

public class UserRoleServiceImpl implements GeneralServiceIntf<UserRole, Long> {

    private static UserRoleDao userDao;

    public UserRoleServiceImpl() {
        userDao = new UserRoleDao();
    }


    @Override
    public void persist(UserRole entity) {
        userDao.openCurrentSessionwithTransaction();
        userDao.persist(entity);
        userDao.closeCurrentSessionwithTransaction();
    }

    @Override
    public void update(UserRole entity) {
        userDao.openCurrentSessionwithTransaction();
        userDao.update(entity);
        userDao.closeCurrentSessionwithTransaction();
    }

    @Override
    public UserRole findById(Long id) {
        userDao.openCurrentSession();
        UserRole user = userDao.findById(id);
        userDao.closeCurrentSession();
        return user;
    }

    @Override
    public List<UserRole> findAll() {
        userDao.openCurrentSession();
        List<UserRole> users = userDao.findAll();
        userDao.closeCurrentSession();
        return users;
    }

    @Override
    public void deleteAll() {
        userDao.openCurrentSessionwithTransaction();
        userDao.deleteAll();
        userDao.closeCurrentSessionwithTransaction();
    }

    public UserRoleDao userDao() {
        return userDao;
    }

    @Override
    public void delete(UserRole entity) {
        userDao.openCurrentSessionwithTransaction();
        UserRole user = userDao.findById(entity.getId());
        userDao.delete(user);
        userDao.closeCurrentSessionwithTransaction();
    }

}
