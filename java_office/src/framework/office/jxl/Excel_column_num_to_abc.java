package framework.office.jxl;
public class Excel_column_num_to_abc {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(int2Column(27));
	}
	public static String int2Column(final int column) {
		int col = column + 1;
		int system = 26;
		char[] digArr = new char[100];
		int ind = 0;
		while (col > 0) {
			int mod = col % system;
			if (mod == 0)
				mod = system;
			digArr[ind++] = dig2Char(mod);
			col = (col - 1) / 26;
		}
		StringBuffer bf = new StringBuffer(ind);
		for (int i = ind - 1; i >= 0; i--) {
			bf.append(digArr[i]);
		}
		return bf.toString();
	}
	private static char dig2Char(final int dig) {
		int acs = dig - 1 + 'A';
		return (char) acs;
	}
}
