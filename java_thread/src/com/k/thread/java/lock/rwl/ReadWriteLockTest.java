package com.k.thread.java.lock.rwl;
public class ReadWriteLockTest {
	public static void main(String[] args) {
		final Data data = new Data();
		for (int i = 0; i < 3; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					for (int j = 0; j < 5; j++) {
						data.set(Math.round(Math.random() * 20));
					}
				}
			}).start();
		}
		for (int i = 0; i < 3; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					for (int j = 0; j < 5; j++) {
						data.get();
					}
				}
			}).start();
		}
	}
}
