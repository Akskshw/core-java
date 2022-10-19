package com.xworkz.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListTester {
 public static void main(String[] args) {
	//List list= new ArrayList(); //ArrayList
     Set list=new HashSet(); //hides the duplicate
	 list.add("Drushy");
	 list.add("Drushya");
	 list.add("Drushya");
	 list.forEach(System.out::println);
	System.out.println("Get the database on index");
	}
}
