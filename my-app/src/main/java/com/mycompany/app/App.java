package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
	private static final String HELLO = "Hello ";

	public static void main(String[] args) {
		String message = getMessage();
		System.out.println(message);
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
