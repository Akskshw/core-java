package com.xworkz;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
public static void main(String[] args) {
	/*Application software is a sub interface of beanFactory
	*its create object by reading spring bean xml.(demo.xml) file.
	*Application context will load the xml file and do pre-instantiation
	*
	*/
 ApplicationContext app=new ClassPathXmlApplicationContext("demo.xml");
 //getBean method will take argument as bean id and will return object  created bu applicationcontxt
 //we need downcast asper pojo class.
Demo d=(Demo) app.getBean("d");//pass id form xml.
System.out.println("---------:Message:"+d.getMsg());
}
}
