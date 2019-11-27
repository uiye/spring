package mvc.ajax.service;

import mvc.ajax.entity.Alcohol;
import org.omg.CORBA.INTERNAL;

import java.util.List;

public interface AlcoholService {
	List<Alcohol> queryAlcohol(Integer pageNum, Integer pageSize);

	Integer insertAlcohol(Alcohol alcohol);
}
