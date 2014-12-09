package com.k.thread.javaThreadStu.chapter9;
import java.util.concurrent.TimeUnit;
public class Main9 {
	/**
	 * <p>
	 * </p>
	 * 
	 * @author zhangjunshuai
	 * @date 2014-8-22 下午4:30:20
	 * @param args
	 */
	public static void main(String[] args) {
		SafeTask task = new SafeTask();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(task);
			thread.start();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}