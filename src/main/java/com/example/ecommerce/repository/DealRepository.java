package com.example.ecommerce.repository;

import com.example.ecommerce.model.Deal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealRepository extends JpaRepository<Deal, Long> {
}
