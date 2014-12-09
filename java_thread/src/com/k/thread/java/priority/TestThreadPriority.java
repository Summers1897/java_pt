package com.k.thread.java.priority;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class TestThreadPriority extends Thread {
	protected Logger log = LoggerFactory.getLogger(Thread.class);
	public TestThreadPriority() {
	}
	@Override
	public void run() {
		log.info("123");
	}
	@Test
	public void test() {
		TestThreadPriority tt = new TestThreadPriority();
		tt.setPriority(Thread.MAX_PRIORITY);
		tt.start();
	}
}
