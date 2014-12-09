package com.k.properties.util;
import java.io.FileInputStream;
import java.util.Properties;
public class PropsUtil {
	private static Properties props = new Properties();
	private String propsFile;
	public PropsUtil(String propsFile) {
		this.propsFile = propsFile;
		getProps();
	}
	public String getPropsVal(String key) throws Exception {
		return new String(props.getProperty(key).getBytes("iso8859-1"), "utf-8");
	}
	public String getPropsVal(String key, String keyDefault) throws Exception {
		return new String(props.getProperty(key, keyDefault).getBytes("iso8859-1"), "utf-8");
	}
	public Properties getProps() {
		String base = Thread.currentThread().getContextClassLoader().getSystemResource("").getPath();
		String file = propsFile;
		try {
			props.load(new FileInputStream(base + file));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return props;
	}
}
