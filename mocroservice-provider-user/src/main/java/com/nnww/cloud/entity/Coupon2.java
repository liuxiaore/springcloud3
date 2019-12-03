/**
 * Project Name:listeners-coupons File Name:Coupons.java Package Name:com.lsn.coupons
 * Date:2017年5月16日上午9:15:22 Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 */

package com.nnww.cloud.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coupons")
public class Coupon2
{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer couponId;

    // 达到满减的金额
    @Column(name = "amount_total")
    private Double amountTotal;

    // 优惠券金额
    @Column
    private Double amountCoupon;

    // 商家ID
    private Integer businessId;

    private Integer scene;

    // 优惠券限制数量
    private Integer limitCount;

    private Integer getTotal;

    private Integer isEnable;

    // 有效时间
    private Integer validDay;

    private Integer created;

    //描述
    private String description;

    //标题
    private String title;

    //优惠券售价
    private Double saleAmount;

    //1.商户优惠券 2 带客通优惠 3  代金券 4 套餐券
    private Integer couponType;

    //1 删除 2 未删除
    private Integer deleted;

    //修改时间
    private Integer modified;

    //商品原售价
    private Double originalPrice;

    //图片
    private String images;

    //审核信息
    private String  verifyInfo;

    //内容佣金
    private Double recommendCommission;

    //活动说明
    private String activityDes;

    //验券方式,0 默认 1 商户手动发送验证
    private Integer verifyCouponWay;

    //是否上架:1 上架 2 下架
    private Integer isSale;

    public Coupon2()
    {
        super();
    }

    public Coupon2(Double amountTotal, Double amountCoupon, Integer businessId, Integer scene)
    {
        super();
        this.amountTotal = amountTotal;
        this.amountCoupon = amountCoupon;
        this.businessId = businessId;
        this.scene = scene;
    }

//    public Coupon(Double amountTotal, Double amountCoupon, Integer businessId, Integer isEnable,
//                  Integer getTotal, Integer created)
//    {
//        super();
//        this.amountTotal = amountTotal;
//        this.amountCoupon = amountCoupon;
//        this.businessId = businessId;
//        this.isEnable = isEnable;
//        this.created = created;
//        this.getTotal = getTotal;
//    }

    public Coupon2(Integer couponId, Double amountTotal, Double amountCoupon, Integer limitCount,
                   Integer getTotal, Integer isEnable, Integer validDay, Integer created)
    {
        super();
        this.couponId = couponId;
        this.amountTotal = amountTotal;
        this.amountCoupon = amountCoupon;
        this.limitCount = limitCount;
        this.getTotal = getTotal;
        this.isEnable = isEnable;
        this.validDay = validDay;
        this.created = created;
    }


    public Integer getVerifyCouponWay() {
        return verifyCouponWay;
    }

    public void setVerifyCouponWay(Integer verifyCouponWay) {
        this.verifyCouponWay = verifyCouponWay;
    }

    public Integer getIsSale() {
        return isSale;
    }

    public void setIsSale(Integer isSale) {
        this.isSale = isSale;
    }

    public Integer getCouponId()
    {
        return couponId;
    }

    public void setCouponId(Integer couponId)
    {
        this.couponId = couponId;
    }

    public Double getAmountTotal()
    {
        return amountTotal;
    }

    public void setAmountTotal(Double amountTotal)
    {
        this.amountTotal = amountTotal;
    }

    public Double getAmountCoupon()
    {
        return amountCoupon;
    }

    public void setAmountCoupon(Double amountCoupon)
    {
        this.amountCoupon = amountCoupon;
    }

    public Integer getBusinessId()
    {
        return businessId;
    }

    public void setBusinessId(Integer businessId)
    {
        this.businessId = businessId;
    }

    public Integer getIsEnable()
    {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable)
    {
        this.isEnable = isEnable;
    }

    public Integer getCreated()
    {
        return created;
    }


    public Integer getValidDay()
    {
        return validDay;
    }

    public void setValidDay(Integer validDay)
    {
        this.validDay = validDay;
    }

    public void setCreated(Integer created)
    {
        this.created = created;
    }

    public Integer getGetTotal()
    {
        return getTotal;
    }

    public void setGetTotal(Integer getTotal)
    {
        this.getTotal = getTotal;
    }

    public Integer getScene()
    {
        return scene;
    }

    public void setScene(Integer scene)
    {
        this.scene = scene;
    }

    public Integer getLimitCount()
    {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount)
    {
        this.limitCount = limitCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(Double saleAmount) {
        this.saleAmount = saleAmount;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Integer getModified() {
        return modified;
    }

    public void setModified(Integer modified) {
        this.modified = modified;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getVerifyInfo() {
        return verifyInfo;
    }

    public void setVerifyInfo(String verifyInfo) {
        this.verifyInfo = verifyInfo;
    }

    public Double getRecommendCommission() {
        return recommendCommission;
    }

    public void setRecommendCommission(Double recommendCommission) {
        this.recommendCommission = recommendCommission;
    }

    public String getActivityDes() {
        return activityDes;
    }

    public void setActivityDes(String activityDes) {
        this.activityDes = activityDes;
    }

    public Coupon2(Double originalPrice, Double amountTotal, Double amountCoupon, Integer businessId, Integer scene, Integer limitCount, Integer getTotal, Integer isEnable, Integer validDay, Integer created, String description, String title, Integer couponType, Integer modified, Integer deleted, Double recommendCommission, String activityDes, String verifyInfo) {
        this.originalPrice = originalPrice;
        this.amountTotal = amountTotal;
        this.amountCoupon = amountCoupon;
        this.businessId = businessId;
        this.scene = scene;
        this.limitCount = limitCount;
        this.getTotal = getTotal;
        this.isEnable = isEnable;
        this.validDay = validDay;
        this.created = created;
        this.description = description;
        this.title = title;
//        this.saleAmount = saleAmount;
        this.couponType = couponType;
        this.modified = modified;
        this.deleted = deleted;
        this.recommendCommission = recommendCommission;
        this.activityDes = activityDes;
        this.verifyInfo = verifyInfo;
    }

    public Coupon2(String images, Double originalPrice, Double amountTotal, Double amountCoupon, Integer businessId, Integer scene, Integer limitCount, Integer getTotal, Integer isEnable, Integer validDay, Integer created, String description, String title, Double saleAmount, Integer couponType, Integer modified, Integer deleted) {
        this.images = images;
        this.originalPrice = originalPrice;
        this.amountTotal = amountTotal;
        this.amountCoupon = amountCoupon;
        this.businessId = businessId;
        this.scene = scene;
        this.limitCount = limitCount;
        this.getTotal = getTotal;
        this.isEnable = isEnable;
        this.validDay = validDay;
        this.created = created;
        this.description = description;
        this.title = title;
        this.saleAmount = saleAmount;
        this.couponType = couponType;
        this.modified = modified;
        this.deleted = deleted;
    }

    public Coupon2(String images, Double originalPrice, Double amountTotal, Double amountCoupon, Integer businessId, Integer scene,
                   Integer limitCount, Integer getTotal, Integer isEnable, Integer validDay, Integer created,
                   String description, String title, Double saleAmount, Integer couponType, Integer modified, Integer deleted, Double recommendCommission,
                   String activityDes, String verifyInfo, Integer verifyCouponWay, Integer isSale) {
        this.images = images;
        this.originalPrice = originalPrice;
        this.amountTotal = amountTotal;
        this.amountCoupon = amountCoupon;
        this.businessId = businessId;
        this.scene = scene;
        this.limitCount = limitCount;
        this.getTotal = getTotal;
        this.isEnable = isEnable;
        this.validDay = validDay;
        this.created = created;
        this.description = description;
        this.title = title;
        this.saleAmount = saleAmount;
        this.couponType = couponType;
        this.modified = modified;
        this.deleted = deleted;
        this.recommendCommission = recommendCommission;
        this.activityDes = activityDes;
        this.verifyInfo = verifyInfo;
        this.verifyCouponWay = verifyCouponWay;
        this.isSale = isSale;
    }

    public Coupon2(Integer couponType, Integer couponId, Integer businessId, Integer isEnable, Integer deleted, Integer modified) {
        this.couponType = couponType;
        this.couponId = couponId;
        this.businessId = businessId;
        this.isEnable = isEnable;
        this.deleted = deleted;
        this.modified = modified;
    }

    public Coupon2(Integer couponId, Double saleAmount, String images, String activityDes, String description, String title, Integer isEnable) {
        this.couponId = couponId;
//        this.originalPrice = originalPrice;
        this.saleAmount = saleAmount;
        this.images = images;
        this.activityDes = activityDes;
        this.description = description;
        this.title = title;
        this.isEnable = isEnable;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "couponId=" + couponId +
                ", amountTotal=" + amountTotal +
                ", amountCoupon=" + amountCoupon +
                ", businessId=" + businessId +
                ", scene=" + scene +
                ", limitCount=" + limitCount +
                ", getTotal=" + getTotal +
                ", isEnable=" + isEnable +
                ", validDay=" + validDay +
                ", created=" + created +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                ", saleAmount=" + saleAmount +
                ", couponType=" + couponType +
                ", deleted=" + deleted +
                ", modified=" + modified +
                ", originalPrice=" + originalPrice +
                ", images='" + images + '\'' +
                ", verifyInfo='" + verifyInfo + '\'' +
                ", recommendCommission=" + recommendCommission +
                ", activityDes='" + activityDes + '\'' +
                ", verifyCouponWay=" + verifyCouponWay +
                ", isSale=" + isSale +
                '}';
    }
}
