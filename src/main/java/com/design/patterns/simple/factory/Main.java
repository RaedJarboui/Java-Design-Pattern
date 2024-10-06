package com.design.patterns.simple.factory;

public class Main {

	public static void main(String[] args) {
		Post post = ProductFactory.factory("blog");
		System.out.println(post.getId());
	}

}
