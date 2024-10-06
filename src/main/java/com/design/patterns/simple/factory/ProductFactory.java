package com.design.patterns.simple.factory;

public class ProductFactory {

	public static Post factory(String type) {
		switch (type) {
		case "blog":
			return new BlogPost();
		case "product":
			return new ProductPost();
		default:
			throw new IllegalArgumentException("type is unknown");
		}
	}

}
