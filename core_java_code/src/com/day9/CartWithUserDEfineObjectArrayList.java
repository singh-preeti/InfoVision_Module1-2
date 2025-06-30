package com.day9;

import java.util.ArrayList;
import java.util.List;

public class CartWithUserDEfineObjectArrayList {

	public static void main(String[] args) {
	
		List<Cart> cart_list = new ArrayList<>();
		cart_list.add(new Cart(101,102,"Shampoo",6000));
		System.out.println(cart_list);
	
}
}
