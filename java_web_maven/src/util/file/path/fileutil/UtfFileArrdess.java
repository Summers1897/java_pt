package util.file.path.fileutil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class UtfFileArrdess {
	public static String directName = "file/";
	public static String utf8FileName1 = directName + "utf81.doc";
	public static String utf8FileName2 = directName + "utf82.doc";
	public static String utf8FileName3 = directName + "utf83.doc";
	public static String utf8FileName4 = directName + "utf84.doc";
	public static String utf8FileName5 = directName + "utf85.doc";
	public static String utf8FileName6 = directName + "utf86.doc";
	public static String utf8FileName7 = directName + "utf87.doc";
	public static String utf8FileName8 = directName + "utf88.doc";
	public static String utf8FileName9 = directName + "utf89.doc";
	public static File file1 = new File(utf8FileName1);
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
