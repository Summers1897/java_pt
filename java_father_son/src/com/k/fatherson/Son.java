package com.k.fatherson;
public class Son extends Father {
	public static String staticStr_son;
	public String noStaticStr_son;
	{
		System.out.println("noStaticStr_son_befer" + noStaticStr_son);
		noStaticStr_son = "noStaticStr_son";
		System.out.println(noStaticStr_son);
		System.out.println("代码快_son{}");
	}
	static {
		staticStr_son = "staticStr_son";
		System.out.println("静态代码快_son{}");
	}
	public Son(String noStaticStr_son) {
		this.noStaticStr_son = noStaticStr_son;
	}
}
