package com.xworkz.jdbcday4;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car I20= CarFactory.createCar("I20");
		I20.start();
		I20.run();
I20.stop();
		Car  Nexon=CarFactory.createCar("Nexon");
		Nexon.start();
		Nexon.run();
		Nexon.start();

	}

}
