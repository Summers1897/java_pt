package com.k.thread.javaThreadStu.chapter5;
import java.util.Date;
import java.util.concurrent.TimeUnit;
/**
 * <br>
 * 1、Thread类的sleep方法，可以使线程睡眠。此方法接收一个整数作为参数，表示线程暂停运行的毫秒数。在调用sleep方法后，当时间结束时，JVM会安排他们CPU时间，线程会继续按指令执行。 <br>
 * 另一种可能是使用一个有TimeUnit列举元素的sleep方法，使用线程类的sleep方法让当前线程睡眠，但是它接收的参数单位后会转成毫秒的。 <br>
 * 2、当你调用sleep()方法，Thread离开CPU并在一段时间内停止运行。在这段时间内，他是不消耗CPU时间的，使用可以执行其他任务， <br>
 * 但它并不释放对象锁。 <br>
 * 当Thread是睡眠和中断的时候，那方法会立刻抛出InterruptedException异常并不会一直等到睡眠时间过去。 <br>
 * 3、Java并发API有另一种方法能让线程对象离开CPU，它是yield()方法，它向JVM表示线程对象可以让CPU执行其他任务。JVM不保证遵守请求，通常它只是用来调试。只是不能由用户指定暂停多长时间，并且yield（）方法只能让同优先级的线程有执行的机会。
 * 
 */
public class FileClock implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%s\n", new Date());
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				System.out.printf("The FileClock has been interrupted");
			}
		}
	}
}
