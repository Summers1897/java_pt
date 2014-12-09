package com.k.io.file;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class WriteFile {
	public static void main(String[] args) {
		File file = new File("D:/temp/020KF20140711.txt");
		String str = "2014071180718042|18669080357|800|尊敬的用户，为避免余额不足影响您的使用，现诚邀您参与联通缤纷充值送活动。即日起至7月31日，您可参与一次“充50送30(每月到账10元)或充100送80(每月到账16元)优惠”，充值后用本机省内免费拨02010131010按1登记。赠款从次月起到账，到账有短信通知，限抵扣当月国内语音通话费及点对点短信费。以上优惠转发无效。广州联通||0|||2014071106525965|16||0020|2014-07-11 04:03:58|3|1|0|20140701093000|0\r\n";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
			for (int i = 0; i < 1000000; i++) {
				bw.write(str);
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
