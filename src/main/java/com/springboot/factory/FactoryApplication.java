package com.springboot.factory;

import com.springboot.factory.factories.ProductFactory;
import com.springboot.factory.services.interfaces.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {

	public static void main(String[] args)
	{
		// run Spring app...
		SpringApplication.run(FactoryApplication.class, args);

		// create product from factory...
		Product productOne = ProductFactory.getProduct("PRODUCT_ONE");
		Product productTwo = ProductFactory.getProduct("PRODUCT_TWO");

		productOne.calculateSomething();
		productTwo.calculateSomething();
	}
}
