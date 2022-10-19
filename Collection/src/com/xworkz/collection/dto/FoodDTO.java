package com.xworkz.collection.dto;


	import lombok.AllArgsConstructor;
	import lombok.Data;

	@Data
	@AllArgsConstructor
	public class FoodDTO  implements Comparable<FoodDTO>
	{
		private int id;
		 private String name;
		 private int price;
		 private String type;
		@Override
		public int compareTo(FoodDTO o) {
			// TODO Auto-generated method stub
			return this.id - o.id ;
		}
		

	}
