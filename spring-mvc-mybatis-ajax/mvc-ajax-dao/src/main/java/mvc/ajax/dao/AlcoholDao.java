package mvc.ajax.dao;

import mvc.ajax.entity.Alcohol;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlcoholDao {
	List<Alcohol> queryAlcohol(@Param("pageNum") Integer pageNum,@Param("pageSize") Integer pageSize);

	Integer insertAlcohol(Alcohol alcohol);
}
