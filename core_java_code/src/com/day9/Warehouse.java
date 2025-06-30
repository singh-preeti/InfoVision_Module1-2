package com.day9;

public class Warehouse {
	String[]  productSlots = new String[100];
	
	public void storeProduct(int slot,String product) {
		productSlots[slot] = product;
	}
	public String getProduct(int slot) {
		System.out.println(productSlots[slot]);
		  return productSlots[slot];
	}
	
	public static void main(String[] args) {
		Warehouse warehouse = new Warehouse();
		warehouse.storeProduct(200, "Shampoo");
		warehouse.getProduct(20);
	}

}
