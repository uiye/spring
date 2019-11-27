package com.dao;

import com.entity.Userinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserinfDao {
	List<Userinfo> queryUserinfo(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

	void insert(String name);

	void delete(Integer id);
}
