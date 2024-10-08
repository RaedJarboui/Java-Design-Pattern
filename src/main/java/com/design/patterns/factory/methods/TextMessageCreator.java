package com.design.patterns.factory.methods;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {

		return new TextMessage();
	}

}