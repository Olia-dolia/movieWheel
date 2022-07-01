package com.moviewheel.artifact.mapper;

import com.moviewheel.artifact.entity.Coupon;
import com.moviewheel.artifact.payload.dto.CouponDto;
import org.mapstruct.*;

@Mapper
public interface CouponMapper {

    @Mapping(target = "id", ignore = true)
    Coupon fromDto(CouponDto couponDto);

    CouponDto toDto(Coupon coupon);

    @Mapping(target = "id", ignore = true)
    void updateCoupon(@MappingTarget Coupon coupon, CouponDto couponDto);
}
