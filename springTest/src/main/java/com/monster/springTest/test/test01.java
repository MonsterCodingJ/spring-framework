package com.monster.springTest.test;

import com.monster.springTest.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test01 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac  = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(ac.getBean(AppConfig.class));
	}
}
