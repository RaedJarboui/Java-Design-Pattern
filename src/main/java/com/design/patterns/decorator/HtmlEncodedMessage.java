package com.design.patterns.decorator;

import io.micrometer.core.instrument.util.StringEscapeUtils;

//Decorator. Implements component interface
public class HtmlEncodedMessage implements Message {

	private Message msg;

	public HtmlEncodedMessage() {
	}

	public HtmlEncodedMessage(Message msg) {
		this.msg = msg;
	}

	@Override
	public String getContent() {
		return StringEscapeUtils.escapeJson(msg.getContent());
	}

}
