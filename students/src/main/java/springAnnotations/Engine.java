package springAnnotations;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Engine {
	@Value("2021")
private String model;
	@Value("2000")
private String hP;



}
