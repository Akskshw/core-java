package emp.demo1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=req.getParameter("id");
		Integer idint=Integer.parseInt(id);
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		String url="jdbc:mysql://localhost:3306/xworkz";
		String username="root";
		String pwd="Xworkzodc123@";
		
		
		try {
			//Class.forName("com.mysql.jdbc.cj.Driver");
		//	Class.forName("com..mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username,pwd );
			PreparedStatement psmt= con.prepareStatement("insert into employee values (?,?,?,?)");
			psmt.setInt(1, idint);
			psmt.setString(2, name);
			psmt.setString(3, email);
			psmt.setString(4, password);
			
			int result=psmt.executeUpdate();

						resp.getWriter().print("employee data inserted");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("ID:"+id);
		System.out.println("Name:" +name);
	//	resp.getWriter().print("<h2 style=\"color:red;\"Welcome">+ name +"to</h2>" );
	}

}
