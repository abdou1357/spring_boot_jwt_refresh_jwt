package com.abdou.security.service;

import com.abdou.security.model.ERole;
import com.abdou.security.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getUsers();
    User getUser(String username);
    void addRoleToUser(String userName, ERole roleName);
}
