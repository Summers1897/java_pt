package com.k.thread.java.synchronized_.s2;
public class Thread1 extends Thread {
	private Example example;
	public Thread1(Example example) {
		this.example = example;
	}
	@Override
	public void run() {
		example.execute();
	}
}
