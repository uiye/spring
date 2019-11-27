package mvc.ajax.entity;

import java.math.BigDecimal;

public class Alcohol {
	private Integer id;
	private String name;
	private BigDecimal price;
	private Integer stock;

	public Alcohol() {}

	public Alcohol(String name, BigDecimal price, Integer stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public Alcohol(Integer id, String name, BigDecimal price, Integer stock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Alcohol{" +
					   "id=" + id +
					   ", name='" + name + '\'' +
					   ", price=" + price +
					   ", stock=" + stock +
					   '}';
	}
}
