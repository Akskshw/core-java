package emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Employee {
public void saveEmpInfomation() {
		
		// number of columns equal to number of ?(placeholder)
		String insertQuery = "insert into drushya.emp values(?,?,?,?,?)";
		Connection connection = JdbcConnection_Util.getConnection();
//step3:create PrepareStatement
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setInt(1, 11);
			preparedStatement.setString(2, "Raju");
			preparedStatement.setString(3, "40000");
			preparedStatement.setString(4, "20-11-2015");
			preparedStatement.setString(5, "Bangalore");
			
//step4 execute query
			int count = preparedStatement.executeUpdate();
			System.out.println("--------record inserted-------------" + count);
//step5 close connection object
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end of exception

	}//end method


}
