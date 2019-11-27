package com.entity;

public class Drinks {
	private Integer drinksId;
	private String drinksName;

	public Integer getDrinksId() {
		return drinksId;
	}

	public void setDrinksId(Integer drinksId) {
		this.drinksId = drinksId;
	}

	public String getDrinksName() {
		return drinksName;
	}

	public void setDrinksName(String drinksName) {
		this.drinksName = drinksName;
	}

	@Override
	public String toString() {
		return "Drinks{" +
					   "drinksId=" + drinksId +
					   ", drinksName='" + drinksName + '\'' +
					   '}';
	}
}
