package com.design.patterns.decorator;

public class Client {

	public static void main(String[] args) {
		Message m = new TextMessage("The <FORCE> is strong with this one!");
		System.out.println(m.getContent());
		Message m1 = new HtmlEncodedMessage(m);
		System.out.println(m1.getContent());

	}
}
