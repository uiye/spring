package com.dao.impl;

import com.dao.BaesDao;
import com.dao.GoodsDao;

public class GoodsDaoImpl extends BaesDao implements GoodsDao {
	@Override
	public void delete(Integer id) {
		System.out.println("删除 Goods do Type ID :" + id);
	}
}
