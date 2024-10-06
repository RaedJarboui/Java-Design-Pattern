package com.design.patterns.factory.methods;

public class Main {

	public static void main(String[] args) {
		printMessage(new TextMessageCreator());
		printMessage(new JSONMessageCreator());

	}

	public static Message printMessage(MessageCreator creator) {
		return creator.createMessage();
	}

}
