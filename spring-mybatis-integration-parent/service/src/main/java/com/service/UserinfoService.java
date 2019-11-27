package com.service;

import com.entity.Userinfo;

import java.util.List;

public interface UserinfoService {
	List<Userinfo> queryUserinfo(Integer pageNum, Integer pageSize);

	void txInsertDelete(String name, Integer id);
}
