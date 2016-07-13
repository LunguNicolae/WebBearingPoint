/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bearingpoint.dao.intf.concrete;

import java.io.Serializable;
import java.util.List;

import com.bearingpoint.dao.intf.GeneralDaoIntf;

public interface UserDaoIntf<T, Id extends Serializable> extends GeneralDaoIntf<T, Long> {

    public T findByUserNamePassword(T entity);

}
