package com.sendmailwithfile;
import java.util.Date;
public class t {
	public static void main(String[] args) {
		// 这个类主要是设置邮件
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("smtp.qq.com");
		mailInfo.setMailServerPort("25");
		mailInfo.setValidate(true);
		mailInfo.setUserName("906451283@qq.com");
		mailInfo.setPassword("tkkuang");// 您的邮箱密码
		mailInfo.setFromAddress("906451283@qq.com");
		mailInfo.setToAddress("906451283@qq.com");
		mailInfo.setSubject("设置邮箱标题 如http://www.guihua.org 中国桂花网" + new Date());
		mailInfo.setContent("设置邮箱内容 如</br>http://www.guihua.org </br>中国桂花网 是中国最大桂花网站==");
		String[] files = new String[1];
		String fileAddr = "C:/Users/K/Desktop/framework/1.jar";
		files[0] = fileAddr;
		mailInfo.setAttachFileNames(files);
		// 这个类主要来发送邮件
		SimpleMailSender sms = new SimpleMailSender();
		sms.sendTextMail(mailInfo);// 发送文体格式
		// sms.sendHtmlMail(mailInfo);// 发送html格式
	}
}
