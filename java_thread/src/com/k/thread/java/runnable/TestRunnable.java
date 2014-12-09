package com.k.thread.java.runnable;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class TestRunnable implements Runnable {
	protected Logger log = LoggerFactory.getLogger(Runnable.class);
	@Override
	public void run() {
		log.info("123");
	}
	@Test
	public void test() {
		Thread tt = new Thread(new TestRunnable());
		tt.start();
	}
}
