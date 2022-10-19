package com.xworkz.contructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext app=new ClassPathXmlApplicationContext("constructorbean.xml");
Person ps= (Person) app.getBean("drs");
ps.displayPerson();
System.out.println("Person");

Car i20= (Car) app.getBean("i20");
i20.displayCar();
System.out.println("I20");

Car bmw=(Car) app.getBean("BMW");
bmw.displayCar();
System.out.println("BMW");
	}

}
