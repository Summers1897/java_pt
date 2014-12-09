package com.k.enterprisedt.util.jc;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.enterprisedt.net.ftp.FTPClient;
public abstract class JC {
	protected FTPClient client;
	@Before
	public void setUp() throws Exception {
		try {
			client = new FTPClient();
			client.setRemoteHost("192.168.2.71");
			client.setRemotePort(21);
			client.connect();
			client.login("k1", "k1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@After
	public void tearDown() throws Exception {
		client.quit();
	}
	@Test
	public abstract void test();
}
