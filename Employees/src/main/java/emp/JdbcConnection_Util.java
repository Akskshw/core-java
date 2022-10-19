package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JdbcConnection_Util {

// TODO Auto-generated method stub
private static Connection con;
 private JdbcConnection_Util() {
 	 
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
