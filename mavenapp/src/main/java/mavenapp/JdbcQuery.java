 package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcQuery {

	public static void main(String[] args)  {
				String selectSQL="SELECT * FROM xworkz.studentz";
				String url="jdbc:mysql://localhost:3306";
				String userName="root";
				String pwd="Xworkzodc123@";
				
				//Step2 
				Connection con=null;
				try {
					con = DriverManager.getConnection(url, userName, pwd);
		            //step3
					Statement st =con.createStatement();
				/* 	//step 4 always better to use executequery for 
					//non-dml query (ie select query)
					//executequery will return resultset interface
					//resultset interface holds table data
					//to check whether table has records or not
					//we use resultset.next() will if records are present
					//then resultset.next() will return true else flase
					// to get column data then we should 
					//resultSet.get(index number); X represent datatype */
					ResultSet resultSet= st.executeQuery(selectSQL);
					while(resultSet.next()) {
						System.out.println("ID"+resultSet.getInt(1));
						System.out.println("--Name:"+ resultSet.getString("name"));
						System.out.println("Address"+resultSet.getString("address"));
						System.out.println("--Name:"+ resultSet.getString("rollno"));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		

	}


