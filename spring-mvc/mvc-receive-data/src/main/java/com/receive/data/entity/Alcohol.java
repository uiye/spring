package com.receive.data.entity;

public class Alcohol {
	private Integer price;
	private String name;

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Alcohol{" +
					   "price=" + price +
					   ", name='" + name + '\'' +
					   '}';
	}
}
