package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BasicCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List coll=new ArrayList();
		coll.add(1);  
		coll.add("Drushya");
		coll.add(true);
		coll.add(123L);
		coll.add(10.5);
		//coll.clear();
	System.out.println(coll.size());
		System.out.println(coll);
		coll.forEach(System.out::println);
		coll.contains(123L);
		System.out.println(coll.contains(123L));
		List coll1=new ArrayList();
		coll1.addAll(coll);
		coll1.add("banglore");
		coll1.add("manglore");
	boolean	check = coll1.removeAll(coll1);
	System.out.println("this check" +coll);
		System.out.println(coll1.containsAll(coll));
		
	}

}
