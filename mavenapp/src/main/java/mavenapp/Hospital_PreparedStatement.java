package mavenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Hospital_PreparedStatement {

public static void main(String[] args) {
		// TODO Auto-generated method stub	
			try {
			
				Connection con = DriverManager.getConnection(Jdbc_Util.URL,Jdbc_Util.USERNAME,Jdbc_Util.PASSWORD);
				
				PreparedStatement psmt = con.prepareStatement("insert into xworkz.hospital values(?,?,?,?,?,?,?,?)");
				
				psmt.setInt(1, 45);
				psmt.setString(2, "Sunil");
				psmt.setString(3, "Mysore");
				psmt.setString(4, "9594726238");
				psmt.setString(5, "Dr.Mukesh");
				psmt.setString(6, "Dr.Raghu");
				psmt.setInt(7, 111);
				psmt.setString(8, "7845987654");
				
	/*			psmt.setInt(1, 12);
				psmt.setString(2, "Pasina");
				psmt.setString(3, "Panaga");
				psmt.setString(4, "+91-9876543277");
				psmt.setString(5, "Dr.Paschi");
				psmt.setString(6, "Dr.Pakri");
				psmt.setInt(7, 102);
				psmt.setString(8, "+91-9876543278");
/*				
				psmt.setInt(1, 13);
				psmt.setString(2, "Gogga");
				psmt.setString(3, "Ganj");
				psmt.setString(4, "+91-8787876556");
				psmt.setString(5, "Dr.Gajni");
				psmt.setString(6, "Dr.Gani");
				psmt.setInt(7, 103);
				psmt.setString(8, "+91-9089786756");
			
	*/			int count = psmt.executeUpdate();
				System.out.println("Count is "+count);
				
				con.close();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}


