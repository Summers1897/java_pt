package com.k.thread.java.lock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class User {
	public String id;
	public User u;
	private Lock lock = new ReentrantLock();
	public void add(User u) throws Exception {
		lock.lock();
		System.out.println(System.currentTimeMillis());
		Thread.sleep(10000);
		System.out.println(System.currentTimeMillis());
		System.out.println(u + "dfdsl");
		System.out.println("***********************");
		lock.unlock();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
}
