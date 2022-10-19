package com.xworkz.contructorInjection;

import lombok.ToString;

@ToString
public class Car {
private int id;
private String name;
private String model;
private double price;
public Car(int id, String name, String model, double price) {
	super();
	this.id = id;
	this.name = name;
	this.model = model;
	this.price = price;
}
public void displayCar()
{
	 System.out.println("ID"+ " "+this.id);
	 System.out.println("Name"+ " "+this.name);
	 System.out.println("Model"+ " "+this.model );
	 System.out.println("Price"+ " "+this.price );
}
}
