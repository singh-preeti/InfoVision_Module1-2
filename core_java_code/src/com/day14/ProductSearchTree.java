package com.day14;
class  ProductNode{                             
	int price  ;                      
	ProductNode left,right;    
	
	public ProductNode(int price) {
		super();
		this.price = price;
	}
	
	public void insert(int newPrice) {
		if(newPrice < price) {
			if(left == null) left = new ProductNode(newPrice);
			else left.insert(newPrice);
		}
		else {
			if(right == null) right = new ProductNode(newPrice);
			else right.insert(newPrice);
		}
	}
	public boolean search(int targetPrice) {
		if(price == targetPrice ) return true;
		else if (targetPrice < price) return left != null  && left.search(targetPrice);
		else return right != null && right.search(targetPrice);
	}
	public void inorder() {
		if(left != null) left.inorder();
		System.out.println(price + " ");
		if(right != null) right.inorder();
	}
	
	
}														
public class ProductSearchTree {
	
	 public static void main(String[] args) {
		 ProductNode  root = new ProductNode(500);
		 int[] prices = {300,700,200,400,600,800};
		 
		 for(int price  : prices) {
			 root.insert(price);
		 }
		 
		 System.out.println("Inorder tree traversal(Sorted Prices)");
		 
		 root.inorder();
		 
		 int searchPrice = 600;
		 System.out.println(searchPrice + "Available");
		 System.out.println(root.search(searchPrice)? "Found" : "Not Found");
	}

}
