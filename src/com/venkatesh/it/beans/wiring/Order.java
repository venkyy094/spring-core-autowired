package com.venkatesh.it.beans.wiring;

public class Order {
	
		private Cart cart;

		public Order() {
			super();
			
		}
		

		public Order(Cart cart) {
			super();
			this.cart = cart;
		}


		public Cart getCart() {
			return cart;
		}

		public void setCart(Cart cart) {
			this.cart = cart;
		}
		
		

}
