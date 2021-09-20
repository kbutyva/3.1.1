package com.kopiko.boot.security.repository;

import com.kopiko.boot.security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
