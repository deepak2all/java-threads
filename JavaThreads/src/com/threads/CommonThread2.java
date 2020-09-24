package com.threads;

public class CommonThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread running by implementing runnable");
	}

	public static void main(String[] args){
		CommonThread1 ct1 = new CommonThread1();
		Thread t = new Thread(ct1);
		t.start();
		//t.start(); // IllegalThreadStateException thrown
		t.run();
		t.run();
	}
}

//When a class extends Thread
//Implementing run() is MANDATORY
//start() method starts the thread and executes the code insdide the run() method
//Though start() can be called only once, run() can be called any number of times
//Both start() and run() executes the code inside run() method