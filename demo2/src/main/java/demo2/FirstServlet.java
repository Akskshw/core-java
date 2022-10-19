package demo2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doPost(req, resp);
	//to read ui data we use HttpServletRequest reference
	//getparameter(String) will get value from JSP to .java class
	String firstName=req.getParameter("firstName");//first name is given in index.jsp
	String lastName=req.getParameter("lastName"); //last name is given in index.jsp
	System.out.println("FirstName-------"+ firstName);
	System.out.println("LastName--------"+lastName);
	//
	resp.getWriter().print("<h1 style=\"color:red;\">Welcome Drushya's territory MR"+firstName+" "+lastName+"All the Best</h1>");
}
}
