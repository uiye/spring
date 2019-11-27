package com.service.impl;

import com.dao.GoodsDao;
import com.dao.GoodsTypeDao;
import com.service.GoodsTypeService;

public class GoodsTypeServiceImpl implements GoodsTypeService {

	private GoodsDao goodsDao;
	private GoodsTypeDao goodsTypeDao;

	@Override
	public void deleteType(Integer id) {
		goodsDao.delete(id);
		goodsTypeDao.deleteType(id);
		System.out.println("删除完成！");
	}

	public void setGoodsDao(GoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}

	public void setGoodsTypeDao(GoodsTypeDao goodsTypeDao) {
		this.goodsTypeDao = goodsTypeDao;
	}
}
