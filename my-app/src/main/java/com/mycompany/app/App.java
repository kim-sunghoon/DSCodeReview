package com.mycompany.app;

import java.util.logging.Logger;

public class App {
	private static Logger logger = Logger.getLogger(App.class.getName());
	private static final String HELLO = "Hello ";

	public static void main(String[] args) {
		String message = getMessage();
		logger.info(message);
	}

	public static String getMessage() {
		return getMessage("World");
	}

	public static String getMessage(String name) {
		if (name == null) {
			name = "Who are you";
		}
		return HELLO + name + "!";
	}
}
