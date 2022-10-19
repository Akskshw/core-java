package studentdatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.JdbcConnectionUtil;

public class StudentDAO {

	public void savestudentInfomation() {
		
		// number of columns equal to number of ?(placeholder)
		String insertQuery = "insert into xworkz.student values(?,?,?,?,?,?,?)";
		Connection connection = JdbcConnectionUtil.getConnection();
//step3:create PrepareStatement
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setInt(1, 01);
			preparedStatement.setString(2, "Raja");
			preparedStatement.setString(3, "Bagalkot");
			preparedStatement.setString(4, "99875643654");
			preparedStatement.setString(5, "Siddalinga institue");
			preparedStatement.setString(6, "Bagalkot");
			preparedStatement.setString(7, "7353649578");
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

 /*	public void getAllstudentData() {

		
		String selectQry = "select * from xworkz.student";
		Connection connection = JdbcConnectionUtil.getConnection();

		try {
			PreparedStatement pstmt = connection.prepareStatement(selectQry);

			ResultSet resultSet = pstmt.executeQuery();
			while (resultSet.next()) {

				StudentDto dto = new StudentDto();
				dto.setId(resultSet.getInt(1));
				dto.setStudentName(resultSet.getString(2));
				dto.setAdress(resultSet.getString(3));
				dto.setStudentPhone(resultSet.getString(4));
				dto.setcollegeName(resultSet.getString(5));
				dto.setcollegeAddress(resultSet.getString(6));
				dto.setclgContact(resultSet.getString(7));
				System.out.println("-------------all data--------------"+dto.toString());

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}*/

	public void updateHospitalDataById(int roomNo, int id) {
		String updateQry = "update hospital set roomno=?  where id=?";
		Connection connection = JdbcConnectionUtil.getConnection();

		try {
			PreparedStatement pstmt = connection.prepareStatement(updateQry);
			pstmt.setInt(1, roomNo);
			pstmt.setInt(2, id);
			int countofrows = pstmt.executeUpdate();
			System.out.println("---------record updated------------------"+countofrows);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteHospitalDataById(int deleteId) {
		String deleteQry = "delete from hospital where id=?";
		Connection connection = JdbcConnectionUtil.getConnection();

		try {
			PreparedStatement pstmt = connection.prepareStatement(deleteQry);
			pstmt.setInt(1, deleteId);

			int countofrows = pstmt.executeUpdate();
			System.out.println("---------record deleted------------------"+countofrows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

public StudentDto getStudentDataById(int id) {
		
	StudentDto dto=new StudentDto();
		String selectQry="select * from hospital where id=?";
		Connection connection=JdbcConnectionUtil.getConnection();
		
		try {
			PreparedStatement pstmt =connection.prepareStatement(selectQry);
			pstmt.setInt(1, id);
		ResultSet resultSet=pstmt.executeQuery();
		while(resultSet.next())
		{
			dto.setId(resultSet.getInt(1));
			dto.setStudentName(resultSet.getString(2));
			dto.setAdress(resultSet.getString(3));
			dto.setStudentPhone(resultSet.getString(4));
			dto.setcollegeName(resultSet.getString(5));
			dto.setcollegeAddress(resultSet.getString(6));
			dto.setclgContact(resultSet.getString(7));
					
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
}
}