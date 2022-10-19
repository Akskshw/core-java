package com.xworkz.jdbcday4;

public class CarFactory  {
	public static Car createCar(String carName) {
		if (carName=="I20") {
			return new I20();
		}
		else if (carName=="Nexon") {
			
		
			return new Nexon();
		}
		else {
			return null;
		}
		}


}
