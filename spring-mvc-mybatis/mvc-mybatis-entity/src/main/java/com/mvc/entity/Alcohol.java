package com.mvc.entity;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class Alcohol {
	private Integer alcoholId;
	@NotBlank(message = "name 不能为空")
	private String alcoholName;
	@NotNull(message = "price 不能为空")
	@DecimalMin(value = "1", message = "价格必须大于或等于 1")
	private BigDecimal alcoholPrice;
	@NotNull(message = "stock 不能为空")
	@Min(value = 1,message = "数量必须大于 1")
	private Integer alcoholStock;

	public Alcohol() {}

	public Alcohol(String alcoholName, BigDecimal alcoholPrice, Integer alcoholStock) {
		this.alcoholName = alcoholName;
		this.alcoholPrice = alcoholPrice;
		this.alcoholStock = alcoholStock;
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

	@Override
	public String toString() {
		return "Alcohol{" +
					   "alcoholId=" + alcoholId +
					   ", alcoholName='" + alcoholName + '\'' +
					   ", alcoholPrice=" + alcoholPrice +
					   ", alcoholStock=" + alcoholStock +
					   '}';
	}
}
