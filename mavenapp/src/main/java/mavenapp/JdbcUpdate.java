package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {
	
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306";
		String userName="root";
		String pwd="Xworkzodc123@";
		Connection connection=null;
		
		try {
			//Step1
			//load and register driver
			//its not required,its loads 
	          //automatically from 
			// vendor DB jar(mysql jar)
			//Class.forName("com.mysql.jdbc.Driver");
			//step:2 create connection
			 connection=DriverManager.getConnection(url, 
					 userName, pwd);
			//Step3:create Statement
			Statement statement=connection.createStatement();
			
			//step4:execute sql query
			//statement.execute("update xworkz.employee set name='babu reddy' where id=101");
		statement.execute("delete from xworkz.employee where id=101");
		System.out.println("---------record deleted -------------");
		} catch (Exception e) {
			// TODO Auto-generated catch block
//		.../	e.printStackTrace();
		}
		
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//all below operation done by database engine
			//divide sql query into chunks
			// compile sql query
			//execute sql query
			
//			update --- t1
//			xworkz.employee  --t2
//			set   ---- t3
//			name='babu reddy' -- t4
//			where            --t5
//			id=101   --t6
			
			
			
		/*	PreparedStatement pst=connection.prepareStatement
					("insert into xworkz.employee values (?,?)");
					//first parameter is index of column
					//second parameter value
					pst.setInt(1,109);
					pst.setString(2,"Rani kumari USA");
					pst.execute();  */
		}
		
		
	}

}
