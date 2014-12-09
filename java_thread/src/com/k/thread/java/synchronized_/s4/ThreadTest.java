package com.k.thread.java.synchronized_.s4;
/**
 * ﻿4. synchronized块<br>
 * 　　synchronized块写法：<br>
 * <br>
 * 　　synchronized(object)<br>
 * <br>
 * 　　{　 <br>
 * <br>
 * 　　}<br>
 * <br>
 * 　　表示线程在执行的时候会将object对象上锁。（注意这个对象可以是任意类的对象，也可以使用this关键字）。<br>
 * <br>
 * 　　这样就可以自行规定上锁对象。　<br>
 * <br>
 * 　　例子程序4所达到的效果和例子程序2的效果一样，都是使得两个线程的执行顺序进行，而不是并发进行，当一个线程执行时，将object对象锁住，另一个线程就不能执行对应的块。<br>
 * <br>
 * 　　synchronized方法实际上等同于用一个synchronized块包住方法中的所有语句，然后在synchronized块的括号中传入this关键字。当然，如果是静态方法，需要锁定的则是class对象。<br>
 * <br>
 * 　　<br>
 * <br>
 * 　　可能一个方法中只有几行代码会涉及到线程同步问题，所以synchronized块比synchronized方法更加细粒度地控制了多个线程的访问，只有synchronized块中的内容不能同时被多个线程所访问，方法中的其他语句仍然可以同时被多个线程所访问（包括synchronized块之前的和之后的）。<br>
 * <br>
 * 　　注意：被synchronized保护的数据应该是私有的。<br>
 * <br>
 * 　　结论：<br>
 * <br>
 * 　　synchronized方法是一种粗粒度的并发控制，某一时刻，只能有一个线程执行该synchronized方法；<br>
 * <br>
 * 　　synchronized块则是一种细粒度的并发控制，只会将块中的代码同步，位于方法内、synchronized块之外的其他代码是可以被多个线程同时访问到的。<br>
 */
public class ThreadTest {
	public static void main(String[] args) {
		Example example = new Example();
		Thread t1 = new Thread1(example);
		Thread t2 = new Thread2(example);
		t1.start();
		t2.start();
	}
}