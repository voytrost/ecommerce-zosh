package com.example.ecommerce.repository;

import com.example.ecommerce.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

    Coupon findByCode(String code);


}
