package com.xworkz.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="UserRegistration")
@NamedQuery(name="findByEmail",query="select u from UserDTO u where u.email=:email")
public class UserDTO {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
private int id;
@Column (name="name")
private String name;
@Column (name="email",unique=true,length = 15)
private String email;
@Column (name="age")
private int age;
@Column (name="Date_of_Birth")
private Date dob;
@Column (name="password")
private String password;
@Override
public String toString() {
	return "UserDTO [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", dob=" + dob + ", password="
			+ password + "]";
}
public int getId() {
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
