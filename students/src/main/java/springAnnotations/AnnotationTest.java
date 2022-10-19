package springAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext app= new AnnotationConfigApplicationContext(TestConfig.class);
	Car car=app.getBean(Car.class);
	System.out.println(car);
	}

}
