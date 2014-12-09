package com.k.io.permission;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.k.io.util.JC;
public class RW extends JC {
	@Override
	public void test() {
		File r = new File("resource/r.txt");
		r.setReadOnly();
		File rw = new File("resource/rw.txt");
		rw.setExecutable(false);
		File rwx = new File("resource/rwx.txt");
		List<File> fs = new ArrayList<File>();
		fs.add(r);
		fs.add(rw);
		fs.add(rwx);
		create(fs);
	}
	public void create(List<File> fs) {
		try {
			for (File file : fs) {
				if (!file.exists()) {
					file.createNewFile();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
