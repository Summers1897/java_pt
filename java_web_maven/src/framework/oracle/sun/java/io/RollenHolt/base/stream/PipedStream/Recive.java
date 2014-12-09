package framework.oracle.sun.java.io.RollenHolt.base.stream.PipedStream;
import java.io.IOException;
import java.io.PipedInputStream;
/**
 * @author K 消息发送类
 */
public class Recive implements Runnable {
	private PipedInputStream input = null;
	public Recive() {
		input = new PipedInputStream();
	}
	@Override
	public void run() {
		byte[] b = new byte[1000];
		int len = 0;
		try {
			len = input.read(b);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("接受消息:" + new String(b, 0, len));
	}
	public PipedInputStream getInput() {
		return input;
	}
	public void setInput(PipedInputStream input) {
		this.input = input;
	}
}
