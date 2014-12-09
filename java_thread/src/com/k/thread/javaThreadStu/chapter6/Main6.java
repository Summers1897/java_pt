package com.k.thread.javaThreadStu.chapter6;
import java.util.Date;
public class Main6 {
	/**
	 * <br>
	 * 1、在某些情况下，我们需要等待线程的终结。例如，我们可能会遇到程序在执行前需要初始化资源。在执行剩下的代码之前，我们需要等待线程完成初始化任务。为了达到此目的，我们使用Thread类的join()方法。当前线程调用某个线程的这个方法时，它会暂停当前线程，直到被调用线程执行完成。 <br>
	 * 2、Java提供2种形式的join（）方法： <br>
	 * Join(longmilliseconds) <br>
	 * Join(long milliseconds,long nanos) <br>
	 * 第一种join方法，让调用线程等待特定的毫秒数。例如，如果thread1对象使用代码thread2.join(1000),那么线程thread1暂停运行，直到 以下其中一个条件发生： <br>
	 * Thread2结束运行 <br>
	 * 1000毫秒过去了 <br>
	 * 当其中一个条件为真时，join()方法返回。 <br>
	 * 第二个版本的join方法和第一个很像，只不过它接收一个毫秒数和一个纳秒数作为参数。
	 */
	public static void main(String[] args) throws InterruptedException {
		DataSourcesLoader dsLoader = new DataSourcesLoader();
		Thread thread1 = new Thread(dsLoader, "DataSourcesLoader" + "");
		NetwworkConnectionsLoader ncLoader = new NetwworkConnectionsLoader();
		Thread thread2 = new Thread(ncLoader, "NetwworkConnectionsLoader");
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.out.printf("Main: Configuration has been loaded: %s\n", new Date());
	}
}