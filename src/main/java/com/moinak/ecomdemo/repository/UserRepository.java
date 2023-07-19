package com.moinak.ecomdemo.repository;

import com.moinak.ecomdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUserId(long userId);
    public User findByUserEmail(String userEmail);
    public User findByUserPhone(String userPhone);
}
