package framework.sourceforge.json_lib.jsonjava.component.ext;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;
public class jsonconfigValue implements JsonValueProcessor {
	public Object processArrayValue(Object value, JsonConfig jsonConfig) {
		return null;
	}
	/*
	 * 调用的时候返回值 null返回""
	 * 
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.sf.json.processors.JsonValueProcessor#processObjectValue(java.lang
	 * .String, java.lang.Object, net.sf.json.JsonConfig)
	 */
	public Object processObjectValue(String key, Object value, JsonConfig jsonConfig) {
		return null;
	}
}
