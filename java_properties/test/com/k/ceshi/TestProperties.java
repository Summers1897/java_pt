package com.k.ceshi;
import java.util.Set;

import com.k.properties.util.JC;
public class TestProperties extends JC {
	@Override
	public void test() {
		try {
			Set<Object> set = props.getProps().keySet();
			for (Object object : set) {
				System.out.println("key:" + object + " val:" + props.getPropsVal(object.toString()));;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
