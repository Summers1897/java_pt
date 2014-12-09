package framework.org.apache.commons.json;
import java.util.Date;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;
import net.sf.json.util.PropertyFilter;
public class JsonlibTest {
	public static JSONArray jsonArray = new JSONArray();
	public static JSONObject jsonObject = new JSONObject();
	public static Student student;
	public static void main(String[] args) {
		init();
		entity2json();
		// t();
	}
	public static void init() {
		student = new Student();
		student.setAddress("address");
		student.setEmail("1@com");
		student.setId(1);
		Birthday birthday = new Birthday();
		birthday.setBirthday("birtesdfsd");
		birthday.setDate(new Date());
		student.setBirthday(birthday);
	}
	public static void entity2json() {
		fail("==============Java Bean >>> JSON Object==================");
		fail(JSONObject.fromObject(student).toString());
		fail("==============Java Bean >>> JSON Array==================");
		fail(JSONArray.fromObject(student).toString());// array会在最外层套上[]
		fail("==============Java Bean >>> JSON Object ==================");
		fail(JSONSerializer.toJSON(student).toString());
		fail("========================JsonConfig========================");
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Birthday.class, new JsonValueProcessor() {
			@Override
			public Object processArrayValue(Object value, JsonConfig config) {
				if (value == null) {
					return new Date();
				}
				return value;
			}
			@Override
			public Object processObjectValue(String key, Object value, JsonConfig config) {
				fail("key" + key);
				Birthday birthday = (Birthday) value;
				String str = "{'birthday':" + birthday.getBirthday() + ",'date':" + birthday.getDate() + "}";
				return str;
			}
		});
		jsonObject = JSONObject.fromObject(student, jsonConfig);
		fail(jsonObject.toString());
		Student student = (Student) JSONObject.toBean(jsonObject, Student.class);
		fail(jsonObject.getString("birthday"));
		fail(student.toString());
		fail("#####################JsonPropertyFilter############################");
		jsonConfig.setJsonPropertyFilter(new PropertyFilter() {
			@Override
			public boolean apply(Object source, String name, Object value) {
				fail(source + "%%%" + name + "--" + value);
				// 忽略birthday属性
				if (value != null && Birthday.class.isAssignableFrom(value.getClass())) {
					return true;
				}
				return false;
			}
		});
		fail(JSONObject.fromObject(student, jsonConfig).toString());
	}
	public static void t() {
		JSONArray jsonArray = null;
		JSONObject jsonObject = null;
		Student bean = null;
		jsonArray = new JSONArray();
		jsonObject = new JSONObject();
		bean = new Student();
		bean.setAddress("address");
		bean.setEmail("email");
		bean.setId(1);
		bean.setName("haha");
		Birthday day = new Birthday();
		day.setBirthday("2010-11-22");
		bean.setBirthday(day);
		fail("==============Java Bean >>> JSON Object==================");
		fail(JSONObject.fromObject(bean).toString());
		fail("==============Java Bean >>> JSON Array==================");
		fail(JSONArray.fromObject(bean).toString());// array会在最外层套上[]
		fail("==============Java Bean >>> JSON Object ==================");
		fail(JSONSerializer.toJSON(bean).toString());
		fail("========================JsonConfig========================");
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Birthday.class, new JsonValueProcessor() {
			public Object processArrayValue(Object value, JsonConfig jsonConfig) {
				if (value == null) {
					return new Date();
				}
				return value;
			}
			public Object processObjectValue(String key, Object value, JsonConfig jsonConfig) {
				fail("key:" + key);
				return value + "##修改过的日期";
			}
		});
		jsonObject = JSONObject.fromObject(bean, jsonConfig);
		fail(jsonObject.toString());
		Student student = (Student) JSONObject.toBean(jsonObject, Student.class);
		fail(jsonObject.getString("birthday"));
		fail(student.toString());
		fail("#################JavaPropertyFilter##################");
		jsonConfig.setRootClass(Student.class);
		jsonConfig.setJavaPropertyFilter(new PropertyFilter() {
			public boolean apply(Object source, String name, Object value) {
				fail(name + "@" + value + "#" + source);
				if ("id".equals(name) || "email".equals(name)) {
					value = name + "@@";
					return true;
				}
				return false;
			}
		});
		student = (Student) JSONObject.toBean(jsonObject, jsonConfig);
		fail("Student:" + student.toString());
	}
	public final static void fail(String string) {
		System.out.println(string);
	}
	public final void failRed(String string) {
		System.err.println(string);
	}
	public static void testmain() {
	}
}
