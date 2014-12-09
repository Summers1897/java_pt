package framework.sourceforge.json_lib;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import net.sf.ezmorph.object.DateMorpher;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;
public class jsonutil {
	private String jsonstr = "[{'id':'0.6'},{'id':'0.3'}]";
	private static String jsonobj = "{'id':'1',date:'2012-02-09','list':[{'id':'0.6'},{'id':'0.3'}]}";
	public static void main(String[] args) {
		Map map = getMap();
		Object o = getDTO(jsonobj, JSONVO.class, map);
		System.out.println(o);
	}
	static Map getMap() {
		Map<String, Class> map = new HashMap<String, Class>();
		map.put("date", Date.class);
		map.put("list", JSONVO.class);
		return map;
	}
	private static void setDataFormat2JAVA() {
		// 设定日期转换格式
		JSONUtils.getMorpherRegistry().registerMorpher(new DateMorpher(new String[]{"yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss"}));
	}
	/**
	 * 从一个JSON 对象字符格式中得到一个java对象，形如： {"id" : idValue, "name" : nameValue,
	 * "aBean" : {"aBeanId" : aBeanIdValue, ...}}
	 * 
	 * @param object
	 * @param clazz
	 * @return
	 */
	public static Object getDTO(String jsonString, Class clazz) {
		JSONObject obj = null;
		setDataFormat2JAVA();
		obj = JSONObject.fromObject(jsonString);
		return JSONObject.toBean(obj, clazz);
	}
	/**
	 * 从一个JSON 对象字符格式中得到一个java对象，其中beansList是一类的集合，形如： {"id" : idValue, "name" :
	 * nameValue, "aBean" : {"aBeanId" : aBeanIdValue, ...}, beansList:[{}, {},
	 * ...]}
	 * 
	 * @param jsonString
	 * @param clazz
	 * @param map
	 *            集合属性的类型 (key : 集合属性名, value : 集合属性类型class) eg: ("beansList" :
	 *            Bean.class)
	 * @return
	 */
	public static Object getDTO(String jsonString, Class clazz, Map map) {
		JSONObject jsonObject = null;
		try {
			setDataFormat2JAVA();
			jsonObject = JSONObject.fromObject(jsonString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return JSONObject.toBean(jsonObject, clazz, map);
	}
}
