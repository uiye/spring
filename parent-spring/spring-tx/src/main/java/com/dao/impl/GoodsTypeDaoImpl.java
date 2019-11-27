package com.dao.impl;

import com.dao.BaesDao;
import com.dao.GoodsTypeDao;

public class GoodsTypeDaoImpl extends BaesDao implements GoodsTypeDao {
	@Override
	public void deleteType(Integer id) {
		System.out.println("删除 Type ID:" + id);
		throw new RuntimeException("错误！");

	}

}
