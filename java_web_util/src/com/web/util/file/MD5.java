package com.web.util.file;
/**
 * 本类用于对一个字符串进行MD5加密, 返回加密后的串
 * <p>
 * Company: 中科软科技股份有限公司
 * </p>
 * 
 * @author 吴剑
 * @version 1.0
 */
public class MD5 {
	/**
	 * 对一个给定的串进行MD5计算,返回结果串.
	 * 
	 * @param str
	 * @return
	 */
	public static String digest(String ss) throws Exception {
		// try {
		// MessageDigest md = MessageDigest.getInstance("MD5");
		// byte[] result = md.digest(str.getBytes());
		// ByteToCharConverter converter =
		// ByteToCharConverter.getConverter("gb2312");
		// char[] resultArray = converter.convertAll(result);
		// //将其转成一个字符串返回
		// StringBuffer buffer = new StringBuffer();
		// for (int i = 0; i < resultArray.length; i++) {
		// //byte区间为[-128,127],要将其转为[0,255]
		// int x = resultArray[i] + 128;
		// //转成16进制字符串
		// buffer.append(Integer.toHexString(x));
		// buffer.append(':');
		// // buffer.append(resultArray[i]);
		// }
		// return buffer.toString().trim().toLowerCase();
		// }
		// catch (NoSuchAlgorithmException ex) {
		// throw new Exception("本JDK版本不支持MD5算法!");
		// }
		String s = null;
		// 用来将字节转换成 16 进制表示的字符
		char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
		try {
			java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
			md.update(ss.getBytes());
			byte tmp[] = md.digest(); // MD5 的计算结果是一个 128 位的长整数， // 用字节表示就是 16
										// 个字节
			char str[] = new char[24 * 2]; // 每个字节用 16 进制表示的话，使用两个字符， // 所以表示成
											// 16 进制需要 32 个字符
			int k = 0; // 表示转换结果中对应的字符位置
			for (int i = 0; i < 16; i++) { // 从第一个字节开始，对 MD5 的每一个字节 // 转换成 16
											// 进制字符的转换
				byte byte0 = tmp[i]; // 取第 i 个字节
				str[k++] = hexDigits[byte0 >>> 4 & 0xf]; // 取字节中高 4 位的数字转换,
															// // >>>
															// 为逻辑右移，将符号位一起右移
				str[k++] = hexDigits[byte0 & 0xf]; // 取字节中低 4 位的数字转换
				str[k++] = ':';
			}
			s = new String(str); // 换后的结果转换为字符串
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
}