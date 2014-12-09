package framework.sourceforge.json_lib.jsonjava.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import framework.sourceforge.json_lib.jsonjava.component.InputCT;
import framework.sourceforge.json_lib.jsonjava.component.table.TableCT;
import framework.sourceforge.json_lib.jsonjava.component.table.TdCT;
import framework.sourceforge.json_lib.jsonjava.component.table.TrCT;
public class TableUtil {
	public static void main(String[] args) {
		TableCT table = new TableCT();
		TrCT trCT = new TrCT();
		List<TrCT> trlist = new ArrayList<TrCT>();
		List<TdCT> hdList = new ArrayList<TdCT>();
		TdCT tdCT = new TdCT();
		InputCT inputCT = new InputCT();
		inputCT.setId("123");
		tdCT.setInputCT(inputCT);
		hdList.add(tdCT);
		trCT.setTds(hdList);
		trlist.add(trCT);
		table.setTrs(trlist);
		JSONObject objtable = JSONObject.fromObject(table);
		// JSONObject objtr = JSONObject.fromObject(trCT);
		System.out.println(objtable);
		// System.out.println(objtr);
		Map<String, Class> map = new HashMap<String, Class>();
		map.put("tds", TdCT.class);
		map.put("trs", TrCT.class);
		TableCT ct = (TableCT) JSONObject.toBean(objtable, TableCT.class, map);
		System.out.println(ct);
	}
}
