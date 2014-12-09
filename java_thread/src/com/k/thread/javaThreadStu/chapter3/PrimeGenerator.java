package com.k.thread.javaThreadStu.chapter3;
/**
 * http://blog.csdn.net/junshuaizhang/article/details/38492509<br>
 * 线程的中断 <br>
 * 1、一个多个线程在执行的Java程序，只有当其全部的线程执行结束时（更具体的说，是所有非守护线程结束或者某个线程调用System.exit()方法的时候），它才会结束运行。有时，你需要为了终止程序而结束一个线程，或者当程序的用户想要取消某个Thread对象正在做的任务。 <br>
 * 2、Java提供中断机制来通知线程表明我们想要结束它。中断机制的特性是线程需要检查是否被中断，而且还可以决定是否相应结束的请求。所以，线程可以忽略中断请求并且继续运行。 <br>
 * 3、Thread类还有其他的可以检查线程是否被中断的方法。例如，静态方法interrupted()能检查正在运行的线程是否被中断。isInterrupted()和interrupted()方法有着很重要的区别。第一个不会改变interrupted属性值，但是第二个会设置成false。Interrupted()方法是一个静态方法，建议使用isInterrupted()方法。
 * 
 */
public class PrimeGenerator extends Thread {
	@Override
	public void run() {
		long number = 1L;
		while (true) {
			if (isPrime(number)) {
				System.out.printf("Number %d is Prime\n", number);
			}
			if (isInterrupted()) {
				System.out.printf("The Prime Generator has been Interrupted");
				return;
			}
			number++;
		}
	}
	/**
	 * <p>
	 * </p>
	 * 
	 * @author zhangjunshuai
	 * @date 2014-8-11 下午2:48:31
	 * @param number
	 * @return
	 */
	private boolean isPrime(long number) {
		if (number <= 2) {
			return true;
		}
		for (long i = 2; i < number; i++) {
			if ((number % i) == 0) {
				return false;
			}
		}
		return true;
	}
}
