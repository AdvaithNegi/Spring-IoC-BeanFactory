package com.jsp.setter_injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class PenDriver {

	public static void main(String[] args) {

		System.out.println("==================Using Bean Factory==================");
		ClassPathResource classPathResource = new ClassPathResource("myspring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		Pen pen = (Pen) beanFactory.getBean("myPen");
		pen.wite();
		System.out.println("Pen Name is     : " + pen.getName());
		System.out.println("Pen Brand is    : " + pen.getBrand());
		System.out.println("Price of Pen is : " + pen.getPrice());

		System.out.println("==================Using Application Context==================");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
		Pen pen1 = (Pen) applicationContext.getBean("myPen");
		pen.wite();
		System.out.println("Pen Name is     : " + pen1.getName());
		System.out.println("Pen Brand is    : " + pen1.getBrand());
		System.out.println("Price of Pen is : " + pen1.getPrice());
	}
}
