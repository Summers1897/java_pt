package com.k.thread.javaThreadStu.chapter10;
import java.util.concurrent.TimeUnit;
public class Task12 implements Runnable {
	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}