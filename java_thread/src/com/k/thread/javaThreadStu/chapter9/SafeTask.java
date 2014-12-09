package com.k.thread.javaThreadStu.chapter9;
import java.util.Date;
import java.util.concurrent.TimeUnit;
/**
 * 
 * <br>
 * 1、如果创建一个类对象，实现Runnable接口，然后多个Thread对象使用同样的Runnable对象，全部的线程都共享同样的属性。这意味着，如果你在一个线程里改变一个属性，全部的线程都会受到这个改变的影响。如果希望程序里的哥哥线程的属性不会被共享，Java并发API提供了一个很清楚的机制叫本地线程变量。 <br>
 * 2、Java并发API包括Inheritable ThreadLocal类提供线程创建线程的值的遗传性。如果线程A有一个本地线程变量，然后它创建了另一个线程B，那么线程B将有与A相同的本地线程变量值。你可以覆盖childValue方法来初始子线程的本地线程变量的值。它接收付线程的本地线程变量作为参数。
 * 
 */
public class SafeTask implements Runnable {
	private static ThreadLocal<Date> startDate = new ThreadLocal<Date>() {
		@Override
		protected Date initialValue() {
			return new Date();
		}
	};
	@Override
	public void run() {
		System.out.printf("Starting Thread:%s:%s\n", Thread.currentThread().getId(), startDate.get());
		try {
			TimeUnit.SECONDS.sleep((int) Math.rint(Math.random() * 10));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("Thread Finished:%s:%s\n", Thread.currentThread().getId(), startDate.get());
	}
}
