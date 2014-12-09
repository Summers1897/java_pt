package com.k.thread.javaThreadStu.chapter8;
public class Main8 {
	/**
	 * <br>
	 * 1、Java里有2种异常： <br>
	 * 检查异常：这些异常必须强制捕获她们或在一个方法里的throws子句中。 <br>
	 * 未检查异常：这些异常不用强制捕获它们。 <br>
	 * 2、在一个线程对象的run()方法里抛出一个检查异常，我们必须捕获并处理她们。因为run（）方法不接受throws子句。当一个非检查异常抛出，默认的的行为是在控制台写下stack trace并退出程序。
	 */
	public static void main(String[] args) {
		Task task = new Task();
		Thread thread = new Thread(task);
		thread.setUncaughtExceptionHandler(new ExceptionHandler());
		thread.start();
	}
}
