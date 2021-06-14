package org.example.alvin.shop.goods.dao;

import org.example.alvin.shop.goods.model.ShopGoods;

public interface ShopGoodsMapper {

  int deleteByPrimaryKey(Long goodsId);

  int insert(ShopGoods record);

  int insertSelective(ShopGoods record);

  ShopGoods selectByPrimaryKey(Long goodsId);

  int updateByPrimaryKeySelective(ShopGoods record);

  int updateByPrimaryKey(ShopGoods record);
}