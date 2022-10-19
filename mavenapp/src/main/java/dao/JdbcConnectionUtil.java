package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import mavenapp.Jdbc_Util;

public class JdbcConnectionUtil {

// TODO Auto-generated method stub
private static Connection con;
 private JdbcConnectionUtil() {
 	 
 }
 static {
	  try {
		con = DriverManager.getConnection(Jdbc_Util.URL,Jdbc_Util.USERNAME,Jdbc_Util.PASSWORD);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 
	
public static Connection getConnection() {
	return con;
	
}
}

