package org.example.alvin.shop.order.dao;

import org.example.alvin.shop.order.model.ShopOrder;

public interface ShopOrderMapper {

  int deleteByPrimaryKey(Long orderId);

  int insert(ShopOrder record);

  int insertSelective(ShopOrder record);

  ShopOrder selectByPrimaryKey(Long orderId);

  int updateByPrimaryKeySelective(ShopOrder record);

  int updateByPrimaryKey(ShopOrder record);
}