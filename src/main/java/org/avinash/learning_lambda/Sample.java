package org.avinash.learning_lambda;

public class Sample {
	public void ceremony() {
		Thread th1 = new Thread(() -> {
			System.out.println("In another thread");
			System.out.println(Thread.currentThread().getName());
		});
		th1.start();
		
	}
}
