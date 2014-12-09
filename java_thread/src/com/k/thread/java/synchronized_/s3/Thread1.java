package com.k.thread.java.synchronized_.s3;
public class Thread1 extends Thread {
	private Example example;
	public Thread1(Example example) {
		this.example = example;
	}
	@Override
	public void run() {
		Example.execute();
	}
}
