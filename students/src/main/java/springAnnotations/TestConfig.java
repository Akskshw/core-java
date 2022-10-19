package springAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

	
@Bean("BmwEngine")		// TODO Auto-generated method stub
 public Engine getEngine() {
	return new Engine();
 
}
@Bean("Bmw")
public Car getCar() {
	return new Car();
}
 }

