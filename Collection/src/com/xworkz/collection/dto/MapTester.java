package com.xworkz.collection.dto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, PatientDTO> map= new HashMap<Integer, PatientDTO>();
		map.put(1,new PatientDTO(3,"Brushya",418526352L));
	map.put(2,new PatientDTO(2,"erus",4174162L));
     map.put(3, new PatientDTO(1,"Drushyah",46341416L));
     System.out.println(map.get(null));
   System.out.println(map.get(3));
   Set setKey= map.keySet();
   for (Object object : setKey) {
	   System.out.println(map.get(object));
	
}
	
}

	}

