package com.moviewheel.artifact.repository;

import com.moviewheel.artifact.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
}
