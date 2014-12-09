package com.k.thread.java.completion;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public class TestCompletion {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ThreadPoolExecutor es = new ThreadPoolExecutor(10, 15, 2000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(10), new ThreadPoolExecutor.AbortPolicy());
		CompletionService<String> cs = new ExecutorCompletionService<String>(es);
		cs.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				Thread.currentThread().sleep(1000);
				return "i am sleeped 1000 milliseconds";
			}
		});
		cs.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				Thread.currentThread().sleep(5000);
				return "i am sleeped 5000 milliseconds";
			}
		});
		cs.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				Thread.currentThread().sleep(4000);
				return "i am sleeped 4000 milliseconds";
			}
		});
		cs.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				Thread.currentThread().sleep(2000);
				return "i am sleeped 2000 milliseconds";
			}
		});
		for (int i = 0; i < 4; i++) {
			Future<String> fu = cs.take();
			System.out.println(fu.get());
		}
	}
}
