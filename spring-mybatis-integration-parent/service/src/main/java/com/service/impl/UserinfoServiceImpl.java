package com.service.impl;

import com.dao.UserinfDao;
import com.entity.Userinfo;
import com.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserinfoServiceImpl implements UserinfoService {
	@Autowired
	private UserinfDao userinfDao;

	@Override
	public List<Userinfo> queryUserinfo(Integer pageNum, Integer pageSize) {
		return userinfDao.queryUserinfo(pageNum,pageSize);
	}

	@Override
	@Transactional
	public void txInsertDelete(String name, Integer id) {
		userinfDao.delete(id);
		userinfDao.insert(name);
	}
}
