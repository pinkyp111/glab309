package com.demo.glab309_8_1_SP14.repository;

import com.demo.glab309_8_1_SP14.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findUserByEmail(String email);
    public User findUserByUserName(String name);
}

