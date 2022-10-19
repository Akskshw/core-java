package com.xworkz.users;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.xworkz.dto.UserDTO;
import com.xworkz.service.UserService;

public class UserDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
UserDTO raju= new UserDTO ();
raju.setAge(32);
raju.setEmail("rajma@gmail.com");
raju.setName("Rajma");
//yy-mm-dd
SimpleDateFormat dateFormat= new SimpleDateFormat("YYYY-MM-DD");
Date dob;
try {
	dob=(Date)dateFormat.parse("1996-05-14");
	raju.setDob(dob);
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//password encoding
BCryptPasswordEncoder  encoder =new BCryptPasswordEncoder();
raju.setPassword(encoder.encode("raja@123"));

UserService user =new UserService();
//user.saveUser(raju);
UserDTO user1=user.findByUserEmail("raju@gmail.com");

System.out.println(user1.toString());

}
}   