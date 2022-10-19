package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcInsert {
	    public static void main(String[] args)  { 
			String url="jdbc:mysql://localhost:3306";
			String userName="root";
			String pwd="Xworkzodc123@";
			
	        Connection connection = null; 
	        Statement statement = null; 
	        Scanner scanner = null; 
	 
	       
	           try {
				connection = DriverManager.getConnection(url, userName, pwd);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	           try {
				statement = connection.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
               int studentNo = 0; 
	            String studentName = null; 
	            String studentAddress = null; 
	            int studentAge = 0; 
	            scanner = new Scanner(System.in); 
	            if (scanner != null) { 
	                System.out.println("Enter Student No"); 
	                studentNo = scanner.nextInt(); 
	                System.out.println("Enter Student Name"); 
	                studentName = scanner.next(); 
	                System.out.println("Enter Student Address"); 
	                studentAddress = scanner.next(); 
	                System.out.println("Enter Student Age"); 
	                studentAge = scanner.nextInt(); 
	                String insertQuery = "insert into xworkz.students values('" + studentNo + "','" + studentName +"','"+ studentAddress + "','"+studentAge+"')"; 
	                try {
						int result = statement.executeUpdate(insertQuery);
						
						System.out.println ("Record Inserted :"+result);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            } 
	             
	      
	 
	    } 
	} 

