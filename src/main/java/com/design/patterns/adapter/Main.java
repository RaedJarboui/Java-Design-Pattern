package com.design.patterns.adapter;

public class Main {

	public static void main(String[] args) {
		EmployeObjectAdapter adapter = new EmployeObjectAdapter(new Employee("Raed", "Java Developer", "Tunisia"));
		System.out.println(adapter.getName());

	}

}
