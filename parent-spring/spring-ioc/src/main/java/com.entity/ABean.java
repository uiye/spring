package com.entity;

public class ABean {
	private BBean bBean;

	public ABean() {}

	public ABean(BBean bBean) {
		this.bBean = bBean;
	}

	public BBean getB(Integer id, String name) {
		return new BBean(id,name);
	}

	public BBean getbBean() {
		return bBean;
	}

	public void setbBean(BBean bBean) {
		this.bBean = bBean;
	}

	@Override
	public String toString() {
		return "ABean{" +
					   "bBean=" + bBean +
					   '}';
	}
}
