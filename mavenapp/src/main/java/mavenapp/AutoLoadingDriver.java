package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AutoLoadingDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306";
		String userName="root";
		String pwd= "Xworkzodc123@";
		try {
			Connection con=DriverManager.getConnection(url, userName, pwd);
		System.out.println("----DB------"+ con.getMetaData().getDatabaseProductName());
		//meta data means information of information 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
