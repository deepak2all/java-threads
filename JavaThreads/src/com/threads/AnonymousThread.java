package com.threads;

public class AnonymousThread {

	public static void main(String[] args) {
		new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Thread running by making use of anonymous inner class");
			}
			
		}).start();	
	}

}
