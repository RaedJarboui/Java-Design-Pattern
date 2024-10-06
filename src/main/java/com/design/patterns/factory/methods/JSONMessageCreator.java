package com.design.patterns.factory.methods;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {

		return new JSONMessage();
	}

}
