package com.k.properties.util;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public abstract class JC {
	protected PropsUtil props;
	@Before
	public void setUp() throws Exception {
		props = new PropsUtil("mongo.properties");
	}
	@After
	public void tearDown() throws Exception {
	}
	@Test
	public abstract void test();
}
