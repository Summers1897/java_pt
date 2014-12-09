package com.k.thread.java.synchronized_.s4;
public class Example {
	private Object object = new Object();
	public void execute() {
		synchronized (object) {
			for (int i = 0; i < 20; ++i) {
				try {
					Thread.sleep((long) Math.random() * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Hello: " + i);
			}
		}
	}
	public void execute2() {
		synchronized (object) {
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
}