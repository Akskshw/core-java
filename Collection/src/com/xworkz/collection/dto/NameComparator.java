package com.xworkz.collection.dto;

import java.util.Comparator;

public class NameComparator implements Comparator<PatientDTO> {

	@Override
	public int compare(PatientDTO o1, PatientDTO o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
