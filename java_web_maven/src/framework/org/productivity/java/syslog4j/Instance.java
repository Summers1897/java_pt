package framework.org.productivity.java.syslog4j;
import org.productivity.java.syslog4j.Syslog;
import org.productivity.java.syslog4j.SyslogIF;
public class Instance {
	public static void main(String[] args) {
		SyslogIF syslogIF = Syslog.getInstance("tcp");
		syslogIF.warn("log message");
	}
}
