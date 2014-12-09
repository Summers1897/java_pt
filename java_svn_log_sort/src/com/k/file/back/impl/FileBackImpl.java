package com.k.file.back.impl;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.k.file.back.FileBack;
public class FileBackImpl implements FileBack {
	@Override
	public void back(List<String> strList, String filter, String startWith) {
		List<String> temp = new ArrayList<String>();
		System.out.println(filter);
		for (String string : strList) {
			if (StringUtils.isBlank(filter)) {
				show(string, filter, startWith);
			} else {
				if (string.contains(filter)) {
					show(string, filter, startWith);
				} else {
					temp.add(string);
				}
			}
		}
		System.out.println(filter);
		strList = temp;
	}
	public void show(String str, String filter, String startWith) {
		if (StringUtils.isBlank(startWith)) {
			System.out.println(str);
		} else {
			System.out.println(str.substring(str.indexOf(startWith) + startWith.length()));
		}
	}
}
