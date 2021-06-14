package org.example.alvin.shop.order.dao;

import org.example.alvin.shop.order.model.ShopUser;

public interface ShopUserMapper {

  int deleteByPrimaryKey(Long userId);

  int insert(ShopUser record);

  int insertSelective(ShopUser record);

  ShopUser selectByPrimaryKey(Long userId);

  int updateByPrimaryKeySelective(ShopUser record);

  int updateByPrimaryKey(ShopUser record);
}