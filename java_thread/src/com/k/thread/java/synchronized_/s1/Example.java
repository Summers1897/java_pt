package com.k.thread.java.synchronized_.s1;
public class Example {
	public synchronized void execute() {
		for (int i = 0; i < 10; ++i) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello: " + i);
		}
	}
}