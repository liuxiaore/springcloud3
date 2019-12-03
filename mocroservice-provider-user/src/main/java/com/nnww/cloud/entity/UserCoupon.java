package com.nnww.cloud.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_coupons")
public class UserCoupon {
    @Id
    private Integer userCouponId;

    private Integer couponId;

    private Integer userId;

    private Integer businessId;

    private String orderSn;

    private Double  saleAmount;

    private String phone;

    private Integer scene;

    private Integer fromPoiTopicId;

    private Long verifyUserCoupon;

    private String verifyMsg;

    private Integer expireStatus;

    private Integer isUse;

    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }

    public Integer getExpireStatus() {
        return expireStatus;
    }

    public void setExpireStatus(Integer expireStatus) {
        this.expireStatus = expireStatus;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Double getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(Double saleAmount) {
        this.saleAmount = saleAmount;
    }

    public String getVerifyMsg() {
        return verifyMsg;
    }

    public void setVerifyMsg(String verifyMsg) {
        this.verifyMsg = verifyMsg;
    }

    public Long getVerifyUserCoupon() {
        return verifyUserCoupon;
    }

    public void setVerifyUserCoupon(Long verifyUserCoupon) {
        this.verifyUserCoupon = verifyUserCoupon;
    }

    public Integer getUserCouponId() {
        return userCouponId;
    }

    public void setUserCouponId(Integer userCouponId) {
        this.userCouponId = userCouponId;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getScene() {
        return scene;
    }

    public void setScene(Integer scene) {
        this.scene = scene;
    }

    public Integer getFromPoiTopicId() {
        return fromPoiTopicId;
    }

    public void setFromPoiTopicId(Integer fromPoiTopicId) {
        this.fromPoiTopicId = fromPoiTopicId;
    }
}
