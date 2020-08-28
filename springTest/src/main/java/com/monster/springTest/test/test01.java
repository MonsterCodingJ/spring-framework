package com.monster.springTest.test;

import com.monster.springTest.config.AppConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext ac  = new AnnotationConfigApplicationContext(AppConfig.class);
//		System.out.println(ac.getBean(AppConfig.class));
		BeanFactory bf = new XmlBeanFactory("");
	}
}
