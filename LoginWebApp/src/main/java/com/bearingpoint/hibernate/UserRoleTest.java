/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bearingpoint.hibernate;

import com.bearingpoint.entities.UserRole;
import com.bearingpoint.service.impl.UserRoleServiceImpl;
import com.bearingpoint.service.intf.GeneralServiceIntf;
import com.bearingpoint.service.intf.concrete.UserServiceIntf;

import java.util.List;

public class UserRoleTest {

    public static void main(String[] args) {
        GeneralServiceIntf userRoleService = new UserRoleServiceImpl();
//        
//        UserRole userRole1 = new UserRole(1L, "ADMIN");
//        UserRole userRole2 = new UserRole(2L, "MANAGER");
//        UserRole userRole3 = new UserRole(3L, "USER");
//        
//        System.out.println("*** Persist - start ***");
//        
//        userRoleService.persist(userRole1);
//        userRoleService.persist(userRole2);
//        userRoleService.persist(userRole3);
        
        List<UserRole> userRoles = userRoleService.findAll();
        System.out.println("USer ROles Persisted are :");
        for (UserRole b : userRoles) {
            System.out.println("-" + b.toString());
        }
         System.exit(0);
    }
}
