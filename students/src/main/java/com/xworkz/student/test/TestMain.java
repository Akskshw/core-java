package com.xworkz.student.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.student.Student;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext app= new ClassPathXmlApplicationContext("student.xml");
 Student st= (Student) app.getBean("s");
 System.out.println("ID="+ " " +st.getId());
 System.out.println("Name="+" "+st.getName());
 System.out.println("RollNo="+ " "+ st.getRollNO());
	}

}
