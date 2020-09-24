package com.threads;

public class CommonThread1 extends Thread{

	public void run(){
		System.out.println("Thread running by extending thread");
	}
	
	public static void main(String[] args){
		CommonThread1 ct1 = new CommonThread1();
		//ct1.start();
		ct1.start(); // IllegalThreadStateException thrown
		//ct1.run(); 
		//ct1.run();
	}
}

// When a class extends Thread
// Implementing run() looks optional though preferred (even commenting run() will not give any error)
// start() method starts the thread and executes the code insdide the run() method
// Though start() can be called only once, run() can be called any number of times
// Both start() and run() executes the code inside run() method