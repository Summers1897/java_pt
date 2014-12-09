package framework.oracle.sun.java.io.RollenHolt.base.stream;
import java.io.File;
import java.io.RandomAccessFile;

import framework.oracle.sun.java.io.RollenHolt.FileAddress;
public class RandomAccessFileWriteFile extends FileAddress {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		File f = new File(root + "h.txt");
		RandomAccessFile demo = new RandomAccessFile(f, "rw");
		demo.writeBytes("asdsad");
		demo.writeInt(12);
		demo.writeBoolean(true);
		demo.writeChar('A');
		demo.writeFloat(1.21f);
		demo.writeDouble(12.123);
		demo.close();
	}
}
