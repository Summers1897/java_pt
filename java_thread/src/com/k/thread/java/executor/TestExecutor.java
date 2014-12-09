package com.k.thread.java.executor;
import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Test;
public class TestExecutor {
	@Test
	public void test() {
		ThreadPoolExecutor tpe = new ThreadPoolExecutor(0, 0, 0, null, null);
	}
}
