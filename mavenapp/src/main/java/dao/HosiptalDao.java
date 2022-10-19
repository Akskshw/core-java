package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HosiptalDao {

	public void saveHosiptalInfomation() {
		
		// number of columns equal to number of ?(placeholder)
		String insertQuery = "insert into xworkz.hospital values(?,?,?,?,?,?,?,?)";
		Connection connection = JdbcConnectionUtil.getConnection();
//step3:create PrepareStatement
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setInt(1, 402);
			preparedStatement.setString(2, "Raja");
			preparedStatement.setString(3, "Bagalkot");
			preparedStatement.setString(4, "99875643654");
			preparedStatement.setString(5, "Ashwini");
			preparedStatement.setString(6, "Raju");
			preparedStatement.setString(7, "55");
			preparedStatement.setString(8, "9597878796");
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

	public void getHosiptalInfomation() {

	}

	public void updateHosiptalInfomation() {

	}

	public void deleteHosiptalInfomation() {

	}
}