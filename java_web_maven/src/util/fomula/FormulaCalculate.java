package util.fomula;
import java.util.Stack;
/*该类实现了对字符串公式的计算，包括     -1-1;1--1;1/-1;科学计数法等*/
public class FormulaCalculate {
	private static boolean nagetive = true;
	public static double formulaCalculate(String formula) {
		nagetive = true;
		Stack<Double> data = new Stack<Double>();
		Stack<String> op = new Stack<String>();
		int i = 0;
		while (i < formula.length() || op.size() != 0) {
			String temp = "";
			while (i < formula.length() && isNumber(formula.substring(i, i + 1), nagetive)) {
				temp += formula.substring(i, i + 1);
				i++;
			}
			if (!"".equals(temp)) {
				data.push(Double.parseDouble(temp));
				nagetive = false;
			} else if (op.size() == 0) {
				op.push(formula.substring(i, i + 1));
				i++;
				nagetive = true;
			} else {
				nagetive = true;
				String exop = op.peek();
				boolean flag = true;
				if (i < formula.length()) {
					flag = compareOp(exop, formula.substring(i, i + 1));
				}
				if (flag) {
					double d = 0;
					if ("-".equals(exop)) {
						d = -data.pop() + data.pop();
					} else if ("+".equals(exop)) {
						d = data.pop() + data.pop();
					} else if ("*".equals(exop)) {
						d = data.pop() * data.pop();
					} else if ("/".equals(exop)) {
						double chushu = data.pop();
						if (chushu != 0) {
							d = 1 / chushu * data.pop();
						} else {
							return 0;
						}
					}
					op.pop();
					if (!"(".equals(exop)) {
						data.push(d);
					}
				}
				if (i < formula.length()) {
					if (!")".equals(formula.substring(i, i + 1))) {
						op.push(formula.substring(i, i + 1));
						i++;
					} else {
						nagetive = false;
						if (op.size() != 0 && "(".equals(op.peek())) {
							op.pop();
							i++;
						}
					}
				}
			}
			// i++;
		}
		return data.pop();
	}
	public static boolean compareOp(String op1, String op2) {
		if ("(".equals(op1) || "(".equals(op2)) {
			return false;// /////表示op2操作符的优先权大
		} else if ("-".equals(op1) || "+".equals(op1)) {
			if ("*".equals(op2) || "/".equals(op2)) {
				return false;
			}
		}
		return true;
	}
	/*
	 * flag用于标示是符号还是减号,true为负号，false为减号
	 */
	public static boolean isNumber(String c, boolean flag) {
		if (flag && "-".equals(c)) {
			return true;
		}
		if ("+".equals(c) || "-".equals(c) || "*".equals(c) || "/".equals(c) || "(".equals(c) || ")".equals(c)) {
			nagetive = true;
			return false;
		} else if ("E".equals(c)) {
			nagetive = true;
			return true;
		} else {
			nagetive = false;
			return true;
		}
	}
	public static void main(String[] args) {
		String formula = "1+(1/0)";
		double result = formulaCalculate(formula);
		System.out.println(result);
	}
}
