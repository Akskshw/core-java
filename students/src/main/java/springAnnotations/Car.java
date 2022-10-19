package springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import lombok.ToString;
@ToString
public class Car {
	@Value("Bmw")
	private String name;
	@Value("500000.9")
	private double price;
	@Autowired
	//@Qualifier ("bmw")
	private Engine e;
public void carInfo() {
	System.out.println("-------Car info----------"+ e.toString());
	
}
}