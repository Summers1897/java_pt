package com.k.thread.javaThreadStu.chapter7;
/**
 * <br>
 * 1、Java有两种Thread：“守护线程Daemon”与“用户线程User”。用户线程：Java虚拟机在它所有非守护线程已经离开后自动离开；守护线程：则是用来服务用户线程的，如果没有其他用户线程在运行，那么就没有可服务对象，也就没有理由继续下去。 <br>
 * 2、setDaemon（boolean on）方法可以方便的设置线程的Daemon模式，true为Daemon模式，此方法必须在线程启动之前调用，当线程正在运行时调用会产生异常。 <br>
 * 3、当一个守护线程中产生了其他线程，那么这些新产生的线程不用设置Daemon属性，都将是守护线程。 <br>
 * 4、Java垃圾回收线程就是一个典型的守护线程，当我们的程序中不在有任何运行中的Thread，程序就不会再产生垃圾，垃圾回收器也就无事可做，所以当垃圾回收线程是Java虚拟机上仅剩的线程时，Java虚拟机会自动离开。
 * 
 */
public class Main7 {
	/**
	 * <p>
	 * </p>
	 * 
	 * @author zhangjunshuai
	 * @date 2014-8-18 上午11:21:30
	 * @param args
	 */
	public static void main(String[] args) {
		// Deque<Event> deque = new ArrayDeque<Event>();
		// WriterTask writer = new WriterTask(deque);
		// for (int i = 0; i < 3; i++) {
		// Thread thread = new Thread(writer);
		// thread.start();
		// }
		// CleanerTask cleaner = new CleanerTask(deque);
		// cleaner.start();
	}
}