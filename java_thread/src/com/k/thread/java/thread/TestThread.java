package com.k.thread.java.thread;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class TestThread extends Thread {
	protected Logger log = LoggerFactory.getLogger(Thread.class);
	public TestThread() {
	}
	@Override
	public void run() {
		log.info("123");
	}
	@Test
	public void test() {
		TestThread tt = new TestThread();
		tt.start();
	}
}
