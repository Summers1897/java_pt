package framework.oracle.sun.javax.script.javascript;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
public class javascript {
	public static void main(String[] args) throws Exception {
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByMimeType("javascript");
		engine = mgr.getEngineByExtension("js");
		engine = mgr.getEngineByMimeType("application/javascript");
		engine.eval("1+2");
		engine.eval("function test(){return 'this is test js in java'}");
		Invocable inv = (Invocable) engine;
		String value = String.valueOf(inv.invokeFunction("test"));
		System.out.println(value);
	}
}
