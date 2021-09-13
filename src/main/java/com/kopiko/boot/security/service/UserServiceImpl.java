package com.kopiko.boot.security.service;

import com.kopiko.boot.security.entity.Role;
import com.kopiko.boot.security.entity.User;
import com.kopiko.boot.security.repository.RoleRepository;
import com.kopiko.boot.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public List<User> allUsers() {
        return userRepository.findAll();
    }

    @Override
    public void addUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public void removeUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public void editUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getById(int id) {
        return userRepository.findUserById(id);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }


}
