package ioc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMobile {
	public static void main(String []args) {
/*Sim ar=new Airtel();
ar.calling();
ar.data();*/
		ApplicationContext app=new ClassPathXmlApplicationContext("simbean.xml");
		Airtel airtel= app.getBean("sim",Airtel.class);
	airtel.calling();
	airtel.data();
	}}
