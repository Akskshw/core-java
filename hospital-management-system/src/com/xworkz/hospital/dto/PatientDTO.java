package com.xworkz.hospital.dto;

import com.xworkz.hospital.constant.Gender;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class PatientDTO {
	private int id;
	private String name;
	private String address;
	private Gender gender;
	private long contactNo;

	/* public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public PatientDTO() {
		System.out.println("The PatientDTO constructor is created");
	}

	@Override
	public String toString() {
		return "PatientDTO [id=" + id + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ ", contactNo=" + contactNo + "]";
	}
	
*/
	
}
