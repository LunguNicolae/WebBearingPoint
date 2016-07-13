/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bearingpoint.service.intf.concrete;

import java.io.Serializable;
import java.util.List;

import com.bearingpoint.entities.User;
import com.bearingpoint.service.intf.GeneralServiceIntf;

public interface UserServiceIntf<T, Id extends Serializable> extends GeneralServiceIntf<T, Long> {

	 User findByUserNamePassword(User entity);
	
}
