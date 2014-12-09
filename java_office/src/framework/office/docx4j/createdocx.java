package framework.office.docx4j;
import java.io.File;

import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
public class createdocx {
	public static void main(String[] args) throws Exception {
		WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.createPackage();
		wordMLPackage.save(new File("C:/Users/K/Desktop/1/1.docx"));
	}
}
