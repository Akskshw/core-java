package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.collection.dto.FoodDTO;
import com.xworkz.collection.dto.NameComparator;
import com.xworkz.collection.dto.NameFoodComparator;
import com.xworkz.collection.dto.PatientDTO;

public class ComparableFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodDTO dto1= new FoodDTO(3,"PaaniPuri",30,"Veg");
		FoodDTO dto2= new FoodDTO(2,"BelPuri",25,"veg");
		FoodDTO dto3= new FoodDTO(1,"Chicken Pizza",80,"NonVeg");
List list =new ArrayList();
list.add(dto1);
list.add(dto2);
list.add(dto3);
//use sorting technique
//to filter the data we use collections/
Collections.sort(list,new NameFoodComparator());
//Collections.sort(list);
list.forEach(System.out::println);
	}

}
