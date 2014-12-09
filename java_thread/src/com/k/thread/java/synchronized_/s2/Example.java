package com.k.thread.java.synchronized_.s2;
public class Example {
	public synchronized void execute() {
		for (int i = 0; i < 20; ++i) {
			try {
				Thread.sleep((long) Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello: " + i);
		}
	}
	public synchronized void execute2() {
		for (int i = 0; i < 20; ++i) {
			try {
				Thread.sleep((long) Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("World: " + i);
		}
	}
}