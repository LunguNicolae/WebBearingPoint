/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bearingpoint.hibernate;

import com.bearingpoint.entities.User;
import com.bearingpoint.entities.UserRole;
import com.bearingpoint.service.impl.UserRoleServiceImpl;
import com.bearingpoint.service.impl.UserServiceImpl;
import com.bearingpoint.service.intf.GeneralServiceIntf;
import com.bearingpoint.service.intf.concrete.UserServiceIntf;

import java.util.List;

public class UserTest {

    public static void main(String[] args) {
        UserServiceIntf userService = new UserServiceImpl();

        GeneralServiceIntf userRoleService = new UserRoleServiceImpl();
//        UserRole userRoles = (UserRole) userRoleService.findById(1L);
//        System.out.println("USer ROles Persisted are :");
//        User user1 = new User();;
//        User user2 = new User();
//        User user3 = new User();
//            System.out.println("user role "+userRoles.toString());
//  
//
//            user1 = new User(1L, "admin@gmail.com", "123", userRoles);
//            user2 = new User(2L, "manager@gmail.com", "456", userRoles);
//            user3 = new User(3L, "user@gmail.com", "789", userRoles);
//        
//            System.out.println("user 1 "+user1.toString());
//        System.out.println("*** Persist - start ***");
//
//        userService.persist(user1);
//        userService.persist(user2);
//        userService.persist(user3);

        List<User> users = userService.findAll();
        System.out.println("USer Persisted are :");
        for (User b : users) {
            System.out.println("-" + b.toString());
        }
        System.exit(0);

    }

}
