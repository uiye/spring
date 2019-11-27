package com.dao;

import com.entity.Alcohol;
import org.apache.ibatis.annotations.Select;

import javax.security.auth.login.AccountLockedException;
import java.util.List;

public interface AlcoholDao {
	//这是在注解中使用 SQL 语句，也可以达到效果，但是不建议使用这种方式，
	@Select({"select alcohol_id,alcohol_name,alcohol_price,alcohol_stock from alcohol"})
	List<Alcohol> queryListAlcohol();

	Integer delete(Integer id);

	Integer update(Alcohol alcohol);

	Alcohol queryAlcohol(Integer id);
}
