package com.example.hotelmanagement.hotel_management_system.repository;

import com.example.hotelmanagement.hotel_management_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods can be added here if needed
}