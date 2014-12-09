package framework.oracle.sun.javax.script.javascript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
public class sub {
	public static void main(String[] args) throws Exception {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		Double d = (Double) engine.eval("1/0");
		System.out.println(d);
		if ("Infinity".equals(d.toString())) {
			System.out.println(d);
		}
	}
}
