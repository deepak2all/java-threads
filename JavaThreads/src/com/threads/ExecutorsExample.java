package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {

	public static void main(String[] args){
		ExecutorService es = Executors.newFixedThreadPool(10);
		es.submit(() -> precessTax("user1"));
		es.submit(() -> precessTax("user2"));
		heavyExecutions();
	}

	private static void heavyExecutions() {
		System.out.println("Method run by the main thread");
	}

	private static String precessTax(String string) {
		System.out.println("Process tax for " + string);
		return string;
	}
}
