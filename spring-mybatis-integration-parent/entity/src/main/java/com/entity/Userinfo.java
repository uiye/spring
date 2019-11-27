package com.entity;

public class Userinfo {
	private Integer id;
	private String sysUsername;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSysUsername() {
		return sysUsername;
	}

	public void setSysUsername(String sysUsername) {
		this.sysUsername = sysUsername;
	}

	@Override
	public String toString() {
		return "Userinfo{" +
					   "id=" + id +
					   ", sysUsername='" + sysUsername + '\'' +
					   '}';
	}
}
