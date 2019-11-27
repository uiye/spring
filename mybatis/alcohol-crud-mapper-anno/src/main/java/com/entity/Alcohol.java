package com.entity;

import java.math.BigDecimal;

public class Alcohol {
	private Integer alcohol_id;
	private String alcohol_name;
	private BigDecimal alcohol_price;
	private Integer alcohol_stock;

	public Alcohol() {}

	public Alcohol(Integer alcohol_id, String alcohol_name, BigDecimal alcohol_price, Integer alcohol_stock) {
		this.alcohol_id = alcohol_id;
		this.alcohol_name = alcohol_name;
		this.alcohol_price = alcohol_price;
		this.alcohol_stock = alcohol_stock;
	}

	public Integer getAlcohol_id() {
		return alcohol_id;
	}

	public void setAlcohol_id(Integer alcohol_id) {
		this.alcohol_id = alcohol_id;
	}

	public String getAlcohol_name() {
		return alcohol_name;
	}

	public void setAlcohol_name(String alcohol_name) {
		this.alcohol_name = alcohol_name;
	}

	public BigDecimal getAlcohol_price() {
		return alcohol_price;
	}

	public void setAlcohol_price(BigDecimal alcohol_price) {
		this.alcohol_price = alcohol_price;
	}

	public Integer getAlcohol_stock() {
		return alcohol_stock;
	}

	public void setAlcohol_stock(Integer alcohol_stock) {
		this.alcohol_stock = alcohol_stock;
	}

	@Override
	public String toString() {
		return "Alcohol{" +
					   "alcohol_id=" + alcohol_id +
					   ", alcohol_name='" + alcohol_name + '\'' +
					   ", alcohol_price=" + alcohol_price +
					   ", alcohol_stock=" + alcohol_stock +
					   '}';
	}
}
