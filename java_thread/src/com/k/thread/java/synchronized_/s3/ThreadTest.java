package com.k.thread.java.synchronized_.s3;
/**
 * ﻿3.考虑静态的同步方法<br>
 * 　　当一个synchronized关键字修饰的方法同时又被static修饰，之前说过，非静态的同步方法会将对象上锁，但是静态方法不属于对象，而是属于类，它会将这个方法所在的类的Class对象上锁。<br>
 * <br>
 * 　　一个类不管生成多少个对象，它们所对应的是同一个Class对象。<br>
 * <br>
 * 　　所以如果是静态方法的情况（execute()和execute2()都加上static关键字），即便是向两个线程传入不同的Example对象，这两个线程仍然是互相制约的，必须先执行完一个，再执行下一个。<br>
 * <br>
 * <br>
 * <br>
 * 　　结论：<br>
 * <br>
 * 　　如果某个synchronized方法是static的，那么当线程访问该方法时，它锁的并不是synchronized方法所在的对象，而是synchronized方法所在的类所对应的Class对象。Java中，无论一个类有多少个对象，这些对象会对应唯一一个Class对象，因此当线程分别访问同一个类的两个对象的两个static，synchronized方法时，它们的执行顺序也是顺序的，也就是说一个线程先去执行方法，执行完毕后另一个线程才开始。<br>
 */
public class ThreadTest {
	public static void main(String[] args) {
		Example example = new Example();
		Thread t1 = new Thread1(example);
		// 此处即便传入不同的对象，静态方法同步仍然不允许多个线程同时执行
		example = new Example();
		Thread t2 = new Thread2(example);
		t1.start();
		t2.start();
	}
}