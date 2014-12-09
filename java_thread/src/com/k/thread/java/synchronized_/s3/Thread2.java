package com.k.thread.java.synchronized_.s3;
public class Thread2 extends Thread {
	private Example example;
	public Thread2(Example example) {
		this.example = example;
	}
	@Override
	public void run() {
		Example.execute2();
	}
}