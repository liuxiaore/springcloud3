package com.nnww.cloud.service;

import com.nnww.cloud.entity.Coupon;
import com.nnww.cloud.entity.Coupon2;
import com.nnww.cloud.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponService {

    @Autowired
    private CouponRepository couponRepository;

    public List<Coupon> getAll() {
        List<Coupon> all = couponRepository.findAll();
        return all;
    }
}
