package com.xworkz.collection.dto;

import java.util.Comparator;

public class NameFoodComparator implements Comparator<FoodDTO> {

	@Override
	public int compare(FoodDTO o1, FoodDTO o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
