package com.k.fatherson;
public class Father {
	public static String staticStr_father;
	public String noStaticStr_father;
	{
		noStaticStr_father = "noStaticStr_father";
		System.out.println(noStaticStr_father);
		System.out.println("代码快_father{}");
	}
	static {
		staticStr_father = "staticStr_father";
		System.out.println("静态代码快_father{}");
	}
}
