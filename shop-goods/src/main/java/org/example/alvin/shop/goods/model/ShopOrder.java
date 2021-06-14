package org.example.alvin.shop.goods.model;

import java.math.BigDecimal;
import java.util.Date;

public class ShopOrder {

  private Long orderId;

  private Long userId;

  private Byte orderStatus;

  private Byte payStatus;

  private Byte shippingStatus;

  private Long goodsId;

  private Integer goodsNumber;

  private Long couponId;

  private BigDecimal couponPaid;

  private Date addTime;

  private Date confirmTime;

  private Date payTime;

  public ShopOrder(Long orderId, Long userId, Byte orderStatus, Byte payStatus, Byte shippingStatus,
      Long goodsId, Integer goodsNumber, Long couponId, BigDecimal couponPaid, Date addTime,
      Date confirmTime, Date payTime) {
    this.orderId = orderId;
    this.userId = userId;
    this.orderStatus = orderStatus;
    this.payStatus = payStatus;
    this.shippingStatus = shippingStatus;
    this.goodsId = goodsId;
    this.goodsNumber = goodsNumber;
    this.couponId = couponId;
    this.couponPaid = couponPaid;
    this.addTime = addTime;
    this.confirmTime = confirmTime;
    this.payTime = payTime;
  }

  public ShopOrder() {
    super();
  }

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Byte getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(Byte orderStatus) {
    this.orderStatus = orderStatus;
  }

  public Byte getPayStatus() {
    return payStatus;
  }

  public void setPayStatus(Byte payStatus) {
    this.payStatus = payStatus;
  }

  public Byte getShippingStatus() {
    return shippingStatus;
  }

  public void setShippingStatus(Byte shippingStatus) {
    this.shippingStatus = shippingStatus;
  }

  public Long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(Long goodsId) {
    this.goodsId = goodsId;
  }

  public Integer getGoodsNumber() {
    return goodsNumber;
  }

  public void setGoodsNumber(Integer goodsNumber) {
    this.goodsNumber = goodsNumber;
  }

  public Long getCouponId() {
    return couponId;
  }

  public void setCouponId(Long couponId) {
    this.couponId = couponId;
  }

  public BigDecimal getCouponPaid() {
    return couponPaid;
  }

  public void setCouponPaid(BigDecimal couponPaid) {
    this.couponPaid = couponPaid;
  }

  public Date getAddTime() {
    return addTime;
  }

  public void setAddTime(Date addTime) {
    this.addTime = addTime;
  }

  public Date getConfirmTime() {
    return confirmTime;
  }

  public void setConfirmTime(Date confirmTime) {
    this.confirmTime = confirmTime;
  }

  public Date getPayTime() {
    return payTime;
  }

  public void setPayTime(Date payTime) {
    this.payTime = payTime;
  }
}