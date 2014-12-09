package framework.oracle.sun.java.io.RollenHolt.base.stream.PipedStream;
import java.io.IOException;
import java.io.PipedOutputStream;
public class Send implements Runnable {
	private PipedOutputStream out;
	public Send() {
		out = new PipedOutputStream();
	}
	@Override
	public void run() {
		String message = "sdfjdsljfdk";
		try {
			out.write(message.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public PipedOutputStream getOut() {
		return out;
	}
	public void setOut(PipedOutputStream out) {
		this.out = out;
	}
}
