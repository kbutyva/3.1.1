package com.kopiko.boot.security.repository;


import com.kopiko.boot.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
    User findUserById(int id);

}
