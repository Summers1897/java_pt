package com.k.thread.javaThreadStu.chapter7;
import java.awt.Event;
import java.util.Deque;
public class WriterTask implements Runnable {
	private Deque<Event> deque;
	public WriterTask(Deque<Event> deque) {
		this.deque = deque;
	}
	// @Override
	// public void run() {
	// for (int i = 0; i < 100; i++) {
	// Event event = new Event();
	// event.setDate(new Date());
	// event.setEvent(String.format("The thread %s has generated an event ", Thread.currentThread().getId()));
	// deque.addFirst(event);
	// try {
	// TimeUnit.SECONDS.sleep(1);
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// }
	// }
	@Override
	public void run() {
	}
}