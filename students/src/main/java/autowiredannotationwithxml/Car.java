package autowiredannotationwithxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	private String name;
	@Autowired
	@Qualifier ("bmw")
	private Engine e;
public void carInfo() {
	System.out.println("-------Car info----------"+ e.toString());
	
}
}