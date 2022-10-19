package com.xworkz.collection;

import java.util.Comparator;

import com.xworkz.collection.dto.AirportDTO;

public class IntAirportComparator implements Comparator<AirportDTO>{

	@Override
	public int compare(AirportDTO o1, AirportDTO o2) {
		// TODO Auto-generated method stub
		return o1.getNoOfCheckIncounters()-o2.getNoOfCheckIncounters();
	}

}
