package com.xworkz.contructorInjection;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Person {
private int id;
private String name;
private List<Car> listOfCar;
public Person(int id, String name, List<Car> listOfCar) {
	super();
	this.id = id;
	this.name = name;
	this.listOfCar = listOfCar;
}
	public void displayPerson()
 {
	 System.out.println("ID"+ " "+this.id);
	 System.out.println("Name"+ " "+this.name);
	 System.out.println("ListOfCar"+ " "+this.listOfCar );
	 
 }
}

