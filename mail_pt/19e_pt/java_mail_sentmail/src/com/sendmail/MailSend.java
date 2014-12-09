package com.sendmail;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sendmailnofile.MailSenderInfo;
import com.sendmailnofile.SimpleMailSender;
public class MailSend {
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		// 这个类主要是设置邮件
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("mail.19e.com.cn");
		mailInfo.setMailServerPort("25");
		mailInfo.setValidate(true);
		mailInfo.setUserName("wangqy@19e.com.cn");
		mailInfo.setPassword("Wqy1234567");// 您的邮箱密码
		mailInfo.setFromAddress("wangqy@19e.com.cn");
		mailInfo.setSubject(args[0]);
		mailInfo.setContent(args[1] + "[邮件生成日期:" + df.format(new Date()) + "]");
		// 这个类主要来发送邮件
		SimpleMailSender sms = new SimpleMailSender();
		mailInfo.setToAddress(args[2]);
		sms.sendTextMail(mailInfo);// 发送文体格式
		// sms.sendHtmlMail(mailInfo);// 发送html格式
		// 命令 java -jar mailSend.jar test1124 testcontent wangqy@19e.com.cn,wangqy@19e.com.cn
	}
}
