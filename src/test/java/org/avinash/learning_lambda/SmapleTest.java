package org.avinash.learning_lambda;

import junit.framework.TestCase;

public class SmapleTest extends TestCase {
	public void test() {
		Sample sample = new Sample();
		sample.ceremony();
		System.out.println("In main");
		System.out.println(Thread.currentThread().getName());
	}

}
