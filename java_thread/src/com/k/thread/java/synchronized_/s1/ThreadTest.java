package com.k.thread.java.synchronized_.s1;
/**
 * 　是否在execute()方法前加上synchronized关键字，这个例子程序的执行结果会有很大的不同。<br>
 * 　　如果不加synchronized关键字，则两个线程同时执行execute()方法，输出是两组并发的。<br>
 * 　　如果加上synchronized关键字，则会先输出一组0到9，然后再输出下一组，说明两个线程是顺次执行的。<br>
 */
public class ThreadTest {
	public static void main(String[] args) {
		Example example = new Example();
		Thread t1 = new Thread1(example);
		Thread t2 = new Thread1(example);
		t1.start();
		t2.start();
	}
}
