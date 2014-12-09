package framework.org.apache.log4j;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class test {
	static Logger logger = Logger.getLogger(test.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("debugdsfdsfs");
	}
}
