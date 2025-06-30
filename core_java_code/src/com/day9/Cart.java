package com.day9;

class Cart{
	int cart_id;
	int cart_ref_id;
	String prod_name;
	double price;
	public Cart(int cart_id, int cart_ref_id, String prod_name, double price) {
		super();
		this.cart_id = cart_id;
		this.cart_ref_id = cart_ref_id;
		this.prod_name = prod_name;
		this.price = price;
	}
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public int getCart_ref_id() {
		return cart_ref_id;
	}
	public void setCart_ref_id(int cart_ref_id) {
		this.cart_ref_id = cart_ref_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", cart_ref_id=" + cart_ref_id + ", prod_name=" + prod_name + ", price="
				+ price + "]";
	}
	
	
}

