package com.nnww.cloud.mocroserviceprovideruser;

import com.nnww.cloud.entity.Coupon;
import com.nnww.cloud.entity.Coupon2;
import com.nnww.cloud.repository.CouponRepository;
import com.nnww.cloud.service.CouponService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MocroserviceProviderUserApplicationTests {


	@Autowired
	CouponService couponService;
	@Autowired
	CouponRepository couponRepository;
//	@Test
//	public void test() {
//		List<Coupon> all =  couponService.getAll();
//		for (Coupon coupon : all) {
//			System.out.println(coupon);
//		}
//	}

	@Test
	public void test2() {
		List<Coupon> all =  couponRepository.findCouponByAmountTotal(10d);
		for (Coupon coupon : all) {
			System.out.println(coupon);
		}
	}

	@Test
	public void test3() {
		List<Coupon2> all =  couponRepository.findCouponByAmountTotal2(10d);
		for (Coupon2 coupon : all) {
			System.out.println(coupon);
		}
	}

}
