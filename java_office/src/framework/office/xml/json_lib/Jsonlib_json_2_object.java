package framework.office.xml.json_lib;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.xml.XMLSerializer;

import org.apache.commons.beanutils.PropertyUtils;
public class Jsonlib_json_2_object {
	private String json = "{\"address\":\"chian\",\"birthday\":{\"birthday\":\"2010-11-22\"}," + "\"email\":\"email@123.com\",\"id\":22,\"name\":\"tom\"}";
	private JSONArray jsonArray = null;
	private JSONObject jsonObject = null;
	private Student bean = null;
	public final void fail(String string) {
		System.out.println(string);
	}
	public final void failRed(String string) {
		System.err.println(string);
	}
	/**
	 * 将json字符串转成Java对象
	 */
	public void readJSON2Bean() {
		fail("==============JSON Object String >>> Java Bean ==================");
		jsonObject = JSONObject.fromObject(json);
		Student stu = (Student) JSONObject.toBean(jsonObject, Student.class);
		fail(stu.toString());
	}
	/**
	 * 将json字符串转换成动态Java对象(MorphDynaBean)
	 */
	public void readJSON2DynaBean() {
		try {
			fail("==============JSON Object String >>> Java MorphDynaBean ==================");
			JSON jo = JSONSerializer.toJSON(json);
			Object o = JSONSerializer.toJava(jo);// MorphDynaBean
			fail(PropertyUtils.getProperty(o, "address").toString());
			jsonObject = JSONObject.fromObject(json);
			fail(jsonObject.getString("email"));
			o = JSONSerializer.toJava(jsonObject);// MorphDynaBean
			fail(PropertyUtils.getProperty(o, "name").toString());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 将json字符串转成Java的Array数组
	 */
	public void readJSON2Array() {
		try {
			fail("==============JSON Arry String >>> Java Array ==================");
			json = "[" + json + "]";
			jsonArray = JSONArray.fromObject(json);
			fail("#%%%" + jsonArray.get(0).toString());
			Object[] os = jsonArray.toArray();
			System.out.println(os.length);
			fail(JSONArray.fromObject(json).join(""));
			fail(os[0].toString());
			Student[] stus = (Student[]) JSONArray.toArray(jsonArray, Student.class);
			System.out.println(stus.length);
			System.out.println(stus[0]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 将JSON字符串转成Java的List集合
	 */
	public void readJSON2List() {
		try {
			fail("==============JSON Arry String >>> Java List ==================");
			json = "[" + json + "]";
			jsonArray = JSONArray.fromObject(json);
			List<Student> list = JSONArray.toList(jsonArray, Student.class);
			System.out.println(list.size());
			System.out.println(list.get(0));
			list = JSONArray.toList(jsonArray);
			System.out.println(list.size());
			System.out.println(list.get(0));// MorphDynaBean
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 将json字符串转换成Collection接口
	 */
	public void readJSON2Collection() {
		try {
			/*
			 * fail(
			 * "==============JSON Arry String >>> Java Collection =================="
			 * ); json = "[" + json + "]"; jsonArray =
			 * JSONArray.fromObject(json);
			 * 
			 * 
			 * Collection<Student> con = JSONArray.toCollection(jsonArray,
			 * Student.class); System.out.println(con.size()); Object[] stt =
			 * con.toArray(); System.out.println(stt.length);
			 * fail(stt[0].toString());
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 将json字符串转换成Map集合
	 */
	public void readJSON2Map() {
		try {
			fail("==============JSON Arry String >>> Java Map ==================");
			jsonObject = JSONObject.fromObject(json);
			Map<String, Class<?>> clazzMap = new HashMap<String, Class<?>>();
			clazzMap.put("arr", String[].class);
			clazzMap.put("A", Student.class);
			clazzMap.put("B", Student.class);
			Map<String, ?> mapBean = (Map) JSONObject.toBean(jsonObject, Map.class, clazzMap);
			System.out.println(mapBean);
			Set<String> set = mapBean.keySet();
			Iterator<String> iter = set.iterator();
			while (iter.hasNext()) {
				String key = iter.next();
				fail(key + ":" + mapBean.get(key).toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}/*
	 * ============================Java Object >>>>> XML
	 * ==========================
	 */
	/**
	 * <b>function:</b> 转换Java对象到XML 需要额外的jar包：xom.jar
	 * 
	 * @author hoojo
	 * @createDate Nov 28, 2010 2:39:55 PM
	 */
	public void writeObject2XML() {
		XMLSerializer xmlSerializer = new XMLSerializer();
		fail("==============Java String Array >>> XML ==================");
		// xmlSerializer.setElementName("bean");
		fail(xmlSerializer.write(JSONArray.fromObject(bean)));
		String[] sa = {"a", "b", "c"};
		fail("==============Java String Array >>> XML ==================");
		fail(xmlSerializer.write(JSONArray.fromObject(sa)));
		fail("==============Java boolean Array >>> XML ==================");
		boolean[] bo = {true, false, true};
		fail(xmlSerializer.write(JSONArray.fromObject(bo)));
		fail(xmlSerializer.write(JSONSerializer.toJSON(bo)));
		Object[] o = {1, "a", true, 'A', sa, bo};
		fail("==============Java Object Array >>> JSON Array ==================");
		fail(xmlSerializer.write(JSONArray.fromObject(o)));
		fail(xmlSerializer.write(JSONSerializer.toJSON(o)));
		fail("==============Java String >>> JSON ==================");
		fail(xmlSerializer.write(JSONArray.fromObject("['json','is','easy']")).toString());
		fail(xmlSerializer.write(JSONObject.fromObject("{'json':'is easy'}")).toString());
		fail(xmlSerializer.write(JSONSerializer.toJSON("['json','is','easy']")).toString());
	}/*
	 * ============================XML String >>>>> Java Object
	 * ==========================
	 */
	/**
	 * <b>function:</b>转换xml文档到java对象
	 * 
	 * @author hoojo
	 * @createDate Nov 28, 2010 3:00:27 PM
	 */
	public void readXML2Object() {
		XMLSerializer xmlSerializer = new XMLSerializer();
		fail("============== XML >>>> Java String Array ==================");
		String[] sa = {"a", "b", "c"};
		jsonArray = (JSONArray) xmlSerializer.read(xmlSerializer.write(JSONArray.fromObject(sa)));
		fail(jsonArray.toString());
		String[] s = (String[]) JSONArray.toArray(jsonArray, String.class);
		fail(s[0].toString());
		fail("============== XML >>>> Java boolean Array ==================");
		boolean[] bo = {true, false, true};
		// jsonArray = (JSONArray)
		// xmlSerializer.read(xmlSerializer.write(JSONArray.fromObject(bo)));
		// bo = (boolean[]) JSONArray.toArray(jsonArray, boolean.class);
		// fail(bo.toString());
		// System.out.println(bo[0]);
		// jsonArray = (JSONArray)
		// xmlSerializer.read(xmlSerializer.write(JSONSerializer.toJSON(bo)));
		// bo = (boolean[]) JSONArray.toArray(jsonArray, boolean.class);
		// fail(bo.toString());
		// System.out.println(bo[0]);
		fail("==============Java Object Array >>> JSON Array ==================");
		Object[] o = {1, "a", true, 'A', sa, bo};
		jsonArray = (JSONArray) xmlSerializer.read(xmlSerializer.write(JSONArray.fromObject(o)));
		System.out.println(jsonArray.getInt(0));
		System.out.println(jsonArray.get(1));
		System.out.println(jsonArray.getBoolean(2));
		jsonArray = (JSONArray) xmlSerializer.read(xmlSerializer.write(JSONSerializer.toJSON(o)));
		System.out.println(jsonArray.get(4));
		System.out.println(jsonArray.getJSONArray(5).get(0));
		System.out.println(jsonArray.get(5));
		fail("==============Java String >>> JSON ==================");
		jsonArray = (JSONArray) xmlSerializer.read(xmlSerializer.write(JSONArray.fromObject("['json','is','easy']")).toString());
		s = (String[]) JSONArray.toArray(jsonArray, String.class);
		fail(s[0].toString());
		jsonObject = (JSONObject) xmlSerializer.read(xmlSerializer.write(JSONObject.fromObject("{'json':'is easy'}")).toString());
		Object obj = JSONObject.toBean(jsonObject);
		System.out.println(obj);
		jsonArray = (JSONArray) xmlSerializer.read(xmlSerializer.write(JSONSerializer.toJSON("['json','is','easy']")).toString());
		s = (String[]) JSONArray.toArray(jsonArray, String.class);
		fail(s[1].toString());
	}
	public static void main(String[] args) {
		Jsonlib_json_2_object json_2_object = new Jsonlib_json_2_object();
		json_2_object.readXML2Object();
	}
}
