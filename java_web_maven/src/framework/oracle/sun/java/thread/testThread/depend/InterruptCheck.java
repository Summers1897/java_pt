package framework.oracle.sun.java.thread.testThread.depend;
public class InterruptCheck extends Thread {
	@Override
	public void run() {
		System.out.println("7" + Thread.currentThread().getName());
		System.out.println("start");
		System.out.println("8" + Thread.currentThread().getName());
		while (true) {
			System.out.println("9" + Thread.currentThread().getName());
			if (Thread.currentThread().isInterrupted())
				break;
			System.out.println("0" + Thread.currentThread().getName());
			System.out.println("while exit" + System.currentTimeMillis());
		}
	}
	public static void main(String[] args) {
		System.out.println("1" + Thread.currentThread().getName());
		Thread thread = new InterruptCheck();
		System.out.println("2" + Thread.currentThread().getName());
		thread.start();
		System.out.println("3" + Thread.currentThread().getName());
		try {
			sleep(1);
			System.out.println("4" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("5" + Thread.currentThread().getName());
		thread.interrupt();
		System.out.println("6" + Thread.currentThread().getName());
	}
}
