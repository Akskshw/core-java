package com.xworkz.Exception.Throws;

public class Throwtester {

	public static void main(String[] args) {
	try {	// TODO Auto-generated method stub
    m1();
	}catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	}
	public static void m1() throws ClassNotFoundException {
		System.out.println("M1 method started");
		m2();
	}
		


	public static void m2() throws ClassNotFoundException  {
		System.out.println("m2 method started");
		m3();
	}
	
	public static void m3() throws ClassNotFoundException{
		Class.forName("com.xworkz.Exception.Throws.Throwteste");
		System.out.println("m3 method ended");
	}
}
