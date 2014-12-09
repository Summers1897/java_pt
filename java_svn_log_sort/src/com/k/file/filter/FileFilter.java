package com.k.file.filter;
import java.util.List;

import com.k.file.back.impl.FileBackImpl;
import com.k.file.read.FileReadUtil;
import com.k.file.util.JC;
public class FileFilter extends JC {
	@Override
	public void test() {
		List<String> strList = FileReadUtil.fileRead("changeLog.txt", "linux_pt");
		new FileBackImpl().back(strList, "mongodb", "/linux_pt/shell_pt/linux_shell");
		new FileBackImpl().back(strList, "spring_mongodb", "/linux_pt/shell_pt/linux_shell");
		new FileBackImpl().back(strList, " ", "");
	}
}
