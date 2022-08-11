package com.product;

public class Product {
	private int ProductId;
	private String name;
	private String price;
	private String url;
	private String descr;
	private String cat;
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getCat() {
		return cat;
	}
	
	public void setCat(String cat) {
		this.cat = cat;
	}
	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", name=" + name + ", price=" + price + ", url=" + url + ", desc="
				+ descr + ", cat=" + cat + "]";
	}

}
