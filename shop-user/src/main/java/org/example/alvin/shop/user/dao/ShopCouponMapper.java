package org.example.alvin.shop.user.dao;

import org.example.alvin.shop.user.model.ShopCoupon;

public interface ShopCouponMapper {

  int deleteByPrimaryKey(Long couponId);

  int insert(ShopCoupon record);

  int insertSelective(ShopCoupon record);

  ShopCoupon selectByPrimaryKey(Long couponId);

  int updateByPrimaryKeySelective(ShopCoupon record);

  int updateByPrimaryKey(ShopCoupon record);
}