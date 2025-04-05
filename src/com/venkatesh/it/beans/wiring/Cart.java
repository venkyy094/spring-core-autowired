package com.venkatesh.it.beans.wiring;

public class Cart {
		private int noOfItems;
		private Product product1;
		private Product product2;
		public Cart() {
			super();
			
		}
		public Cart(int noOfItems, Product product1, Product product2) {
			super();
			this.noOfItems = noOfItems;
			this.product1 = product1;
			this.product2 = product2;
		}
		public int getNoOfItems() {
			return noOfItems;
		}
		public void setNoOfItems(int noOfItems) {
			this.noOfItems = noOfItems;
		}
		public Product getProduct1() {
			return product1;
		}
		public void setProduct1(Product product1) {
			this.product1 = product1;
		}
		public Product getProduct2() {
			return product2;
		}
		public void setProduct2(Product product2) {
			this.product2 = product2;
		}
		
		
		
		

}
