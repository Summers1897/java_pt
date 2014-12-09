package framework.org.productivity.java.syslog4j;
import org.productivity.java.syslog4j.Syslog;
public class Direct {
	public static void main(String[] args) {
		Syslog.getInstance("udp").alert("123");
	}
}
