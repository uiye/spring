package com.entity;

public class DrinksBackups {
	private Integer drinksBackupsId;
	private String drinksBackupsName;

	public Integer getDrinksBackupsId() {
		return drinksBackupsId;
	}

	public void setDrinksBackupsId(Integer drinksBackupsId) {
		this.drinksBackupsId = drinksBackupsId;
	}

	public String getDrinksBackupsName() {
		return drinksBackupsName;
	}

	public void setDrinksBackupsName(String drinksBackupsName) {
		this.drinksBackupsName = drinksBackupsName;
	}

	@Override
	public String toString() {
		return "Drinks_Backups{" +
					   "drinksBackupsId=" + drinksBackupsId +
					   ", drinksBackupsName='" + drinksBackupsName + '\'' +
					   '}';
	}
}
