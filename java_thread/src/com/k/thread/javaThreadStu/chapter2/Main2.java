package com.k.thread.javaThreadStu.chapter2;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.Thread.State;
public class Main2 {
	/**
	 * Java并发学习之二——获取和设置线程信息<br>
	 * Thread类的对象中保存了一些属性信息能够帮助我们辨别每一个线程，知道它的一些信息<br>
	 * ID：每个线程的独特标示；<br>
	 * Name：线程的名称；<br>
	 * Priority：线程对象的优先级。优先级别在1-10之间，1是最低级，10是最高级。<br>
	 * Status：线程状态。在java中，线程只有6种状态：new,runnable,blocked,waiting,time waiting 或terminated。<br>
	 */
	public static void main(String[] args) {
		Thread[] threads = new Thread[10];
		Thread.State[] status = new Thread.State[10];
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread(new Calculator2(i));
			if ((i % 2) == 0) {
				threads[i].setPriority(Thread.MAX_PRIORITY);
			} else {
				threads[i].setPriority(Thread.MIN_PRIORITY);
			}
			threads[i].setName("Thread" + i);
		}
		try {
			FileWriter file = new FileWriter(".\\xianchenglog1.txt");
			PrintWriter pw = new PrintWriter(file);
			for (int i = 0; i < 10; i++) {
				pw.println("main: status of thread " + i + ": " + threads[i].getState());
				status[i] = threads[i].getState();
			}
			for (int i = 0; i < 10; i++) {
				threads[i].start();
			}
			boolean finish = false;
			while (!finish) {
				for (int i = 0; i < 10; i++) {
					if (threads[i].getState() != status[i]) {
						writeThreadInfo(pw, threads[i], status[i]);
					}
				}
				finish = true;
			}
			pw.close();
		} catch (Exception e) {
		}
	}
	private static void writeThreadInfo(PrintWriter pw, Thread thread, State state) {
		pw.printf("Main : Id %d - %s\n", thread.getId(), thread.getName());
		pw.printf("Main : Priority: %d\n", thread.getPriority());
		pw.printf("Main : Old State: %s\n", state);
		pw.printf("Main : New State: %s\n", thread.getState());
		pw.printf("Main : ************************************\n");
	}
}
