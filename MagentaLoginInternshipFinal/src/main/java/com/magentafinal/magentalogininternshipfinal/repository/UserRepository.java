package com.magentafinal.magentalogininternshipfinal.repository;

import com.magentafinal.magentalogininternshipfinal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
