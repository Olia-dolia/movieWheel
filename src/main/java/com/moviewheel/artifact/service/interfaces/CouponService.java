package com.moviewheel.artifact.service.interfaces;

import com.moviewheel.artifact.entity.Coupon;
import com.moviewheel.artifact.payload.dto.CouponDto;

public interface CouponService {

    Coupon createCoupon(CouponDto coupon);
    Coupon getCouponById(Long id);
    Coupon updateCoupon(Long couponId, CouponDto coupon);
    void deleteCoupon(Long id);
}
