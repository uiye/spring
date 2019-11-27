package com.receive.data.formatter;

import com.receive.data.entity.Alcohol;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class AlcoholFormatter implements Formatter<Alcohol> {
	@Override
	public Alcohol parse(String text, Locale locale) throws ParseException {
		String[] date = text.split(",");
		Alcohol alcohol = new Alcohol();
		alcohol.setName(date[0]);
		alcohol.setPrice(Integer.parseInt(date[1]));
		return alcohol;
	}

	@Override
	public String print(Alcohol object, Locale locale) {
		return object.toString();
	}
}
