package com.magentafinal.magentalogininternshipfinal.repository;

import com.magentafinal.magentalogininternshipfinal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
