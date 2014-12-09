package com.k.thread.java.synchronized_.s4;
public class Thread2 extends Thread {
	private Example example;
	public Thread2(Example example) {
		this.example = example;
	}
	@Override
	public void run() {
		example.execute2();
	}
}