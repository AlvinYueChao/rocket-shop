package org.example.alvin.shop.order.dao;

import org.example.alvin.shop.order.model.ShopCoupon;

public interface ShopCouponMapper {

  int deleteByPrimaryKey(Long couponId);

  int insert(ShopCoupon record);

  int insertSelective(ShopCoupon record);

  ShopCoupon selectByPrimaryKey(Long couponId);

  int updateByPrimaryKeySelective(ShopCoupon record);

  int updateByPrimaryKey(ShopCoupon record);
}