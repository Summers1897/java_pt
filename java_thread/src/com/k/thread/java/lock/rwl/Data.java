package com.k.thread.java.lock.rwl;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
public class Data {
	private double data;// 共享数据
	private ReadWriteLock rwl = new ReentrantReadWriteLock();
	public void set(double data) {
		rwl.writeLock().lock();// 取到写锁
		try {
			System.out.println(Thread.currentThread().getName() + "准备写入数据");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.data = data;
			System.out.println(Thread.currentThread().getName() + "写入" + this.data);
		} finally {
			rwl.writeLock().unlock();// 释放写锁
		}
	}
	public void get() {
		rwl.readLock().lock();// 取到读锁
		try {
			System.out.println(Thread.currentThread().getName() + "准备读取数据");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "读取" + data);
		} finally {
			rwl.readLock().unlock();// 释放读锁
		}
	}
}