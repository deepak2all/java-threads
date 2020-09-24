package com.threads;

public class LambdaThread {

	public static void main(String[] args){
		new Thread(() -> System.out.println("Thread1 running using LAMBDA")).start();
		new Thread(() -> System.out.println("Thread2 running using LAMBDA")).start();
		new Thread(() -> precessTax("user1")).start();
		new Thread(() -> precessTax("user2")).start();
		heavyExecutions();
	}

	private static String precessTax(String string) {
		System.out.println("Process tax for " + string);
		return string;
	}

	private static void heavyExecutions() {
		System.out.println("Method run by the main thread");
	}
}
