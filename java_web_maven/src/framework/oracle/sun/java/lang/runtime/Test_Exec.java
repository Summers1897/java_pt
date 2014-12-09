package framework.oracle.sun.java.lang.runtime;
public class Test_Exec {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Runtime runt = Runtime.getRuntime();
		Process p = runt.exec("java thread.manyThread Test");
		System.out.println("ok");
	}
}
