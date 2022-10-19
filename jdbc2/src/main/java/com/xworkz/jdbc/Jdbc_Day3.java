package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc_Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//url to connect to my sql database
		//jdbc - main protocol
		//my sql -sub protocol
		//://localhost --system name
		//if we are connecting remote system then we have  ip address
		//in place 
		String url="jdbc:mysql://localhost:3306";
		String username="root";
		String password="Xworkzodc@123";
		//jdbc steps 
		//step 1:load driver and register driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//step 2:create connection
			Connection con=DriverManager.getConnection(url, username, password);
			//step3 :create statement
			//
			Statement st=con.createStatement();
			st.execute("insert into"+ " xworkz.employee values(101,'Baba')");
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
