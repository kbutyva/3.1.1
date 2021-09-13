package com.kopiko.boot.security.service;


import com.kopiko.boot.security.entity.Role;
import com.kopiko.boot.security.entity.User;

import java.util.List;


public interface UserService {
    List<User> allUsers();
    void addUser(User user);
    void removeUser(int id);
    void editUser(User user);
    User getById(int id);
    User findByUsername(String username);
    List<Role> findAll();
}
