package com.k.io.permission;
import java.io.File;

import com.k.io.util.JC;
public class Remove extends JC {
	@Override
	public void test() {
		File r = new File("resource/r.txt");
		File r1 = new File("resource/r1.txt");
		r.renameTo(r1);
	}
}
