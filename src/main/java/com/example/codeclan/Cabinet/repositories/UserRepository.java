package com.example.codeclan.Cabinet.repositories;

import com.example.codeclan.Cabinet.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
