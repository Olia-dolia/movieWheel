package com.moviewheel.artifact.payload.dto;

import com.moviewheel.artifact.entity.User;
import lombok.Data;

@Data
public class CouponDto {

    private Long id;
    private User User;
    private Integer couponType;
    private Boolean isUsed;
}
