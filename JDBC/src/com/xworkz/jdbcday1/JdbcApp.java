
package com.xworkz.jdbcday1;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcApp {
	static final String USERNAME="root";
	static final String PASSWORD="root";
	static final String URL="jdbc:mysql://localhost:3306";
public static void main(String[] args) {
}
	public static void CreateJDBC() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(null, null, null);
	
	}catch (Exception e) {
		// TODO: handle exception
	e.printStackTrace();	}

}
}
