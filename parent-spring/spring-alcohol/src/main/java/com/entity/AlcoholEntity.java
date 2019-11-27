package com.entity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

import java.math.BigDecimal;

public class AlcoholEntity {
	private Integer alcoholId;
	private String alcoholName;
	private BigDecimal alcoholPrice;
	private Integer alcoholStock;

	@Override
	public String toString() {
		return "AlcoholEntity{" +
					   "alcoholId=" + alcoholId +
					   ", alcoholName='" + alcoholName + '\'' +
					   ", alcoholPrice=" + alcoholPrice +
					   ", alcoholStock=" + alcoholStock +
					   '}';
	}

	public Integer getAlcoholId() {
		return alcoholId;
	}

	public void setAlcoholId(Integer alcoholId) {
		this.alcoholId = alcoholId;
	}

	public String getAlcoholName() {
		return alcoholName;
	}

	public void setAlcoholName(String alcoholName) {
		this.alcoholName = alcoholName;
	}

	public BigDecimal getAlcoholPrice() {
		return alcoholPrice;
	}

	public void setAlcoholPrice(BigDecimal alcoholPrice) {
		this.alcoholPrice = alcoholPrice;
	}

	public Integer getAlcoholStock() {
		return alcoholStock;
	}

	public void setAlcoholStock(Integer alcoholStock) {
		this.alcoholStock = alcoholStock;
	}
}
