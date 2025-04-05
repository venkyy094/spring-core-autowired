package com.venkatesh.it.beans.wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringBeanAutowiringTest {

	public static void main(String[] args) {
		ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\venky\\Downloads\\java latest\\eclipse\\eclipse files\\spring-bean-auto-wiring\\spring-beans-autowiring.xml");
		
		Cart c1  = (Cart) container.getBean("cart");
		Product p1 = c1.getProduct1();
		System.out.println(p1.getPrice());
		System.out.println(p1.getProductId());
		System.out.println(p1.getProductName());
		
		Product p2 = c1.getProduct2();
		System.out.println(p2.getPrice());
		System.out.println(p2.getProductId());
		System.out.println(p2.getProductName());
		
		Order order = (Order) container.getBean("order");
		System.out.println(order.getCart().getProduct1().getPrice());
		System.out.println(order.getCart().getProduct2().getPrice());
		
		

	}

}
