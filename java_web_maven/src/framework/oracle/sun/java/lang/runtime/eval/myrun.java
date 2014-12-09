package framework.oracle.sun.java.lang.runtime.eval;
public class myrun {
	public static void main(String[] args) throws Exception {
		Runtime rt = Runtime.getRuntime();
		Process p = rt.exec("exp dbpt/111111@orcl file=d:\\db.dmp log=d:\\log.log tables=(t1) query= 'where t1.id=1' ");
	}
}
