package com.company.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.company.userservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}