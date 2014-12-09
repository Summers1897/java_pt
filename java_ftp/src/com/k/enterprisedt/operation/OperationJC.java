package com.k.enterprisedt.operation;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.enterprisedt.net.ftp.FTPConnectMode;
import com.enterprisedt.net.ftp.FTPTransferType;
import com.k.enterprisedt.util.jc.JC;
public class OperationJC extends JC {
	@Override
	public void test() {
		client.setConnectMode(FTPConnectMode.PASV);
		try {
			client.setType(FTPTransferType.BINARY);
			client.chdir("k1");
			String[] dirs = client.dir(".");
			for (String string : dirs) {
				System.out.println(string);
			}
			client.put("C:/Users/K/Desktop/txt/org.ow2.util/file0.txt", "f1.txt");
			// client.delete("f1.txt");
			// client.chdir("t1/t2");
			File file = File.createTempFile("temp", ".temp");
			OutputStream os = new FileOutputStream(file);
			client.get(os, "f1.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
