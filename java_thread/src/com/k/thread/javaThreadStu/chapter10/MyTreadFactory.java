package com.k.thread.javaThreadStu.chapter10;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadFactory;
/**
 * <br>
 * 1、工厂模式是最有用的设计模式。它是一个创造模式，还有他的目的是创建一个 或者几个类对象的对象。有了这个工厂，我们有这些优势集中创建对象： <br>
 * <br>
 * 更简单的改变了类的对象创建或者说创建这些对象的方式； <br>
 * 更简单的为了限制的资源限制了对象的创建。 <br>
 * 更简单的生成创建对象的统计数据。 <br>
 * 2、Java提供一个接口，ThreadFactory接口实现一个线程对象工厂
 * 
 */
public class MyTreadFactory implements ThreadFactory {
	private int counter;
	private String name;
	private List<String> stats;
	public MyTreadFactory(String name) {
		counter = 0;
		this.name = name;
		stats = new ArrayList<String>();
	}
	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r, name + "_Thread_" + counter);
		counter++;
		stats.add(String.format("Created thread %d with name %s on %s\n", t.getId(), t.getName(), new Date()));
		return t;
	}
	public String getStatuts() {
		StringBuffer buffer = new StringBuffer();
		Iterator<String> it = stats.iterator();
		while (it.hasNext()) {
			buffer.append(it.next());
			buffer.append("\n");
		}
		return buffer.toString();
	}
}