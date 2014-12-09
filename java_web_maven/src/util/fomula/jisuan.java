package util.fomula;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
public class jisuan {
	public static void main(String[] args) throws Exception {
		ScriptEngineManager ma = new ScriptEngineManager();
		ScriptEngine engine = ma.getEngineByExtension("js");
		Object double1 = engine.eval("3/1");
		System.out.println(double1);
	}
}
