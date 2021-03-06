package com.practice2.entity;

import lombok.Data;

@Data
public class DrinksEntity {
	private Integer id;
	private String name;

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
}
