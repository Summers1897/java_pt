package util.file.path.fileutil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class GbkFileArrdess {
	private static String directName = "file/";
	public static String gbkFileName1 = directName + "gbk1.doc";
	public static String gbkFileName2 = directName + "gbk2.doc";
	public static String gbkFileName3 = directName + "gbk3.doc";
	public static String gbkFileName4 = directName + "gbk4.doc";
	public static String gbkFileName5 = directName + "gbk5.doc";
	public static String gbkFileName6 = directName + "gbk6.doc";
	public static String gbkFileName7 = directName + "gbk7.doc";
	public static String gbkFileName8 = directName + "gbk8.doc";
	public static String gbkFileName9 = directName + "gbk9.doc";
	public static File file1 = null;
	public static File file2 = null;
	public static File file3 = null;
	public static File file4 = null;
	public static File file5 = null;
	public static File file6 = null;
	public static File file7 = null;
	public static File file8 = null;
	public static File file9 = null;
	public static FileInputStream fis = null;
	public static FileOutputStream fos = null;
	public static void ininize(String filename1, String filename2) throws Exception {
		file1 = new File(filename1);
		fis = new FileInputStream(file1);
		file2 = new File(filename2);
		fos = new FileOutputStream(file2);
	}
}
