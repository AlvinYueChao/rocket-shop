package org.example.alvin.shop.user.model;

import java.math.BigDecimal;
import java.util.Date;

public class ShopCoupon {

  private Long couponId;

  private BigDecimal couponPrice;

  private Byte isUsed;

  private Date usedTime;

  public ShopCoupon(Long couponId, BigDecimal couponPrice, Byte isUsed, Date usedTime) {
    this.couponId = couponId;
    this.couponPrice = couponPrice;
    this.isUsed = isUsed;
    this.usedTime = usedTime;
  }

  public ShopCoupon() {
    super();
  }

  public Long getCouponId() {
    return couponId;
  }

  public void setCouponId(Long couponId) {
    this.couponId = couponId;
  }

  public BigDecimal getCouponPrice() {
    return couponPrice;
  }

  public void setCouponPrice(BigDecimal couponPrice) {
    this.couponPrice = couponPrice;
  }

  public Byte getIsUsed() {
    return isUsed;
  }

  public void setIsUsed(Byte isUsed) {
    this.isUsed = isUsed;
  }

  public Date getUsedTime() {
    return usedTime;
  }

  public void setUsedTime(Date usedTime) {
    this.usedTime = usedTime;
  }
}