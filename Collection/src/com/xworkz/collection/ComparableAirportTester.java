package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.collection.dto.AirportDTO;
import com.xworkz.collection.dto.NameFoodComparator;

public class ComparableAirportTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirportDTO dto1= new AirportDTO(3,"Bangalore",5,4,2);
		AirportDTO dto2= new AirportDTO(2,"Mangalore",4,4,8);
		AirportDTO dto3= new AirportDTO(7,"Mysore",8,7,1);
List list =new ArrayList();
list.add(dto1);
list.add(dto2);
list.add(dto3);
//use sorting technique
//to filter the data we use collections/
Collections.sort(list,new IntAirportComparator());
//Collections.sort(list);
list.forEach(System.out::println);
	}


	}


