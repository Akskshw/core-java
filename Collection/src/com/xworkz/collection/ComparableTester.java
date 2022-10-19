package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.collection.dto.NameComparator;
import com.xworkz.collection.dto.PatientDTO;

public class ComparableTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatientDTO dto1= new PatientDTO(3,"Brushya",418526352L);
		PatientDTO dto2= new PatientDTO(2,"erus",4174162L);
		PatientDTO dto3= new PatientDTO(1,"Drushyah",46341416L);
List list =new ArrayList();
list.add(dto1);
list.add(dto2);
list.add(dto3);
//use sorting technique
//to filter the data we use collections/
Collections.sort(list,new NameComparator());
//Collections.sort(list);
list.forEach(System.out::println);
	}

}
