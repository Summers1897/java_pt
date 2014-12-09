package com.k.webshop.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jxls.exception.ParsePropertyException;
import net.sf.jxls.transformer.XLSTransformer;


public class Excel {
	public static String writeMarketUnit(List list) {
		String fileName = "elecUnit" + System.currentTimeMillis();
		Map beans = new HashMap();
		beans.put("elecUnit", list);
		XLSTransformer transformer = new XLSTransformer();
		String path = Excel.class.getResource("/").getPath();
		path = path.substring(1, path.indexOf("/WEB-INF") + 1) + "Excel/";
		path = path.replaceAll("%20", " ");
		try {
			transformer.transformXLS(path + "/elecUnitTemplate.xls",
					beans, path + fileName + ".xls");
		} catch (ParsePropertyException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileName;
	}
}
