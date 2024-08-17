package com.example.hotelmanagement.hotel_management_system.repository;

import com.example.hotelmanagement.hotel_management_system.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Custom query methods can be added here if needed
}