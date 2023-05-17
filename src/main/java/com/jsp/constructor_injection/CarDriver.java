package com.jsp.constructor_injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class CarDriver {

	public static void main(String[] args) {

		System.out.println("==================Using Bean Factory==================");
		ClassPathResource classPathResource = new ClassPathResource("myspring1.xml");
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		Car car = (Car) beanFactory.getBean("myCar");
		car.print();

		System.out.println("==================Using Application Context==================");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring1.xml");
		Car car2 = (Car) applicationContext.getBean("myCar");
		car2.print();
	}
}
