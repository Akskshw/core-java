package com.xworkz.collection.dto;

import lombok.*;

@Data
@AllArgsConstructor
public class AirportDTO implements Comparable<AirportDTO>{
	private int id;
	 private String name;
	 private int noOfLoadingBridges;
	 private int noOfDepartureGates;
	 private int noOfCheckIncounters;
	@Override
	public int compareTo(AirportDTO o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}

}
