package com.org;

public class Demo {
	static {
		System.out.println("Demo class Static block");
	}
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.org.Test");
	}
}
