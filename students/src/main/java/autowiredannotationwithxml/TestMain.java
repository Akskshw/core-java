package autowiredannotationwithxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext app= new ClassPathXmlApplicationContext("autowiredannotationwithxml.xml");
	Car car=app.getBean("car",Car.class);
	car.carInfo();
	}

}
