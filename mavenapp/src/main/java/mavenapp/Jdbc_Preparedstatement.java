package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc_Preparedstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Connection connection=DriverManager.getConnection(Jdbc_Util.URL,Jdbc_Util.USERNAME,Jdbc_Util.PASSWORD);
	PreparedStatement pst= connection.prepareStatement("insert into xworkz.studentz values(?,?,?,?)");
	pst.setInt(1, 4);
	pst.setString(2, "Darshan");
	pst.setString(3, "Bhatkal");
	pst.setInt(4, 46);
	pst.executeUpdate();
	connection.close();
	
}  
catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
