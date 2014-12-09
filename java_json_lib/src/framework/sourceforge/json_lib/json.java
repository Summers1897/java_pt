package framework.sourceforge.json_lib;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
public class json {
	private String jsonstr = "[{'id':'0.6985479397243928','name':'0.9736108669065116'},{'id':'0.6344939398838876','name':'0.7896360755486874'}]";
	private static String jsonobj = "{'id':'0.6985479397243928','name':'0.9736108669065116'}";
	public static void main(String[] args) {
		JSONObject obj = JSONObject.fromObject(jsonobj);
		System.out.println(obj.get("name"));
	}
	static void getjsonstr() {
		JSONArray objs = new JSONArray();
		JSONObject obj = null;
		for (int i = 0; i < 2; i++) {
			JSONVO vo = new JSONVO();
			vo.setId(Math.random() + "");
			obj = new JSONObject();
			obj.put("id", vo.getId());
			objs.add(obj);
		}
		System.out.println(objs);
	}
}
