package com.nnww.cloud.repository;

import com.nnww.cloud.entity.Coupon;
import com.nnww.cloud.entity.Coupon2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CouponRepository extends JpaRepository<Coupon, Integer> {

    @Query(value = "select * from coupons c where c.amount_total = :amountTotal limit 0,5", nativeQuery = true)
    public List<Coupon> findCouponByAmountTotal(@Param("amountTotal") double amountTotal);

    @Query(value = "select * from coupons c where c.amount_total = :amountTotal limit 0,5", nativeQuery = true)
    public List<Coupon2> findCouponByAmountTotal2(@Param("amountTotal") double amountTotal);
}
