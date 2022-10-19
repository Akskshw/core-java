package com.xworkz.dp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.dp.Mme;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext app=new ClassPathXmlApplicationContext("jobbean.xml");
	Mme me=app.getBean("dr",Mme.class);
	System.out.println("name:"+me.getName());
	System.out.println("Job"+me.getB().getDesign());
	System.out.println("List of Govt Id:"+  me.getListofId());
	
	
	}

	
	
	
	
	
	
	
	
}
