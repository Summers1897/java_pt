package framework.oracle.sun.java.io.RollenHolt.base.stream.PipedStream;
import java.io.IOException;
public class Hello {
	public static void main(String[] args) throws IOException {
		Send s = new Send();
		Recive r = new Recive();
		s.getOut().connect(r.getInput());
		new Thread(s).start();
		new Thread(r).start();
	}
}
