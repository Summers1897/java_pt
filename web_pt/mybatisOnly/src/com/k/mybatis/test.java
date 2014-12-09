package com.k.mybatis;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class test {
	public static void main(String[] args) throws Exception {
		String basepath = Class.class.getClass().getResource("/").getPath();
		String res = "mybatis.xml";
		Reader reader = Resources.getResourceAsReader(res);
		Properties pro = new Properties();
		InputStream is = new FileInputStream(basepath + "mybatis.properties");
		pro.load(is);
		System.out.println(pro.get("url"));
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(reader, pro);
		SqlSession session = fac.openSession();
		// List<Blog> bg =
		// session.selectList("com.k.mybatis.BlogMapper.selectBlog", 1);
		List bg12 = session.selectList("com.k.mybatis.BlogMapper.selectBlog12", 1);
		// System.out.println(bg);
	}
}
