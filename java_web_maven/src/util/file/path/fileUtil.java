package util.file.path;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class fileUtil {
	public static String utiladdress = fileUtil.class.getClassLoader().getSystemResource("").toString() + "utilfile/";
	public static String file1 = utiladdress + "u1.doc";
	public static String file2 = utiladdress + "u2.doc";
	public static String file3 = utiladdress + "u3.doc";
	public static String file4 = utiladdress + "u4.doc";
	public static String file5 = utiladdress + "u5.doc";
	public static String file6 = utiladdress + "u6.doc";
	public static String file7 = utiladdress + "u7.doc";
	public static String file8 = utiladdress + "u8.doc";
	public static String file9 = utiladdress + "u9.doc";
	public static String file10 = utiladdress + "u10.doc";
	public static FileInputStream fis = null;
	public static FileOutputStream fos = null;
	public static void initialize(String is, String os) throws Exception {
		fis = new FileInputStream(is);
		fos = new FileOutputStream(os);
	}
}
