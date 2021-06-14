package org.example.alvin.shop.order.dao;

import org.example.alvin.shop.order.model.ShopGoods;

public interface ShopGoodsMapper {

  int deleteByPrimaryKey(Long goodsId);

  int insert(ShopGoods record);

  int insertSelective(ShopGoods record);

  ShopGoods selectByPrimaryKey(Long goodsId);

  int updateByPrimaryKeySelective(ShopGoods record);

  int updateByPrimaryKey(ShopGoods record);
}