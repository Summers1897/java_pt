package com.k.thread.java.jc;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public abstract class JC {
	protected Logger log = LoggerFactory.getLogger(JC.class);
	@Before
	public void setUp() throws Exception {
	}
	@After
	public void tearDown() throws Exception {
	}
	@Test
	public abstract void test();
}
