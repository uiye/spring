package com.practice1.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Date;

public class DrinksEntity {
	@Min(1)
	private Integer id;
	@Size(min = 1,max = 10)
	private String name;
	private Date date;

	public DrinksEntity() {}

	public DrinksEntity(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "DrinksEntity{" +
					   "id=" + id +
					   ", name='" + name + '\'' +
					   ", date=" + date +
					   '}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
