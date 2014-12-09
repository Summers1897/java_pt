package com.k.util.core.spring;
public class BeanUtil  {
	 public static Object getBean(final String beanName){
		return  SpringContextListener.getApplicationContext().getBean(beanName);
	 }
}
