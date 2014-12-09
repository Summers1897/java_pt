package util.file.path.fileutil;
public class printAddress {
	public static void main(String[] args) {
		printFileName("utf8");
	}
	public static void printFileName(String pre) {
		String directName = "directName";
		int num = 10;
		for (int i = 1; i < num; i++) {
			// public static String fileNameutf1 =directName+ "utf1.doc";
			System.out.println("public static String " + pre + "FileName" + i + " = " + directName + "+\"" + pre + i + ".doc\";");
		}
	}
	public static void printFile() {
		int num = 10;
		for (int i = 1; i < num; i++) {
			System.out.println("public static File file" + i + " = null;");
		}
	}
}
