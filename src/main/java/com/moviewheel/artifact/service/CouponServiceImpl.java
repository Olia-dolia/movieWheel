package com.moviewheel.artifact.service;

import com.moviewheel.artifact.entity.Coupon;
import com.moviewheel.artifact.mapper.CouponMapper;
import com.moviewheel.artifact.payload.dto.CouponDto;
import com.moviewheel.artifact.repository.CouponRepository;
import com.moviewheel.artifact.service.interfaces.CouponService;
import org.springframework.stereotype.Service;

@Service
public class CouponServiceImpl implements CouponService {

    private final CouponRepository couponRepository;
    private final CouponMapper couponMapper;

    public CouponServiceImpl(CouponRepository couponRepository, CouponMapper couponMapper) {
        this.couponRepository = couponRepository;
        this.couponMapper = couponMapper;
    }

    @Override
    public Coupon createCoupon(CouponDto couponDto) {
        Coupon coupon = couponMapper.fromDto(couponDto);
        return couponRepository.save(coupon);
    }

    @Override
    public Coupon getCouponById(Long id) {
        return couponRepository.findById(id).orElseThrow(() -> new RuntimeException("Coupon not found by id - " + id));
    }

    @Override
    public Coupon updateCoupon(Long couponId, CouponDto coupon) {
        Coupon couponFromDb = getCouponById(couponId);
        couponMapper.updateCoupon(couponFromDb, coupon);
        return couponRepository.save(couponFromDb);
    }

    @Override
    public void deleteCoupon(Long id) {
        couponRepository.deleteById(id);
    }
}
