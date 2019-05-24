package Httpsession;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class S1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname=request.getParameter("fname");
		String lastname=request.getParameter("lname");
		HttpSession httpSession=request.getSession();
		httpSession.setAttribute("firstname",firstname);
		httpSession.setAttribute("lastname",lastname);
	PrintWriter Pw;
	Pw=response.getWriter();
	Pw.print("<form action='S2'/>");
	Pw.print("username<input type='text'name='username'/>");
	Pw.print("password<input type='password'name='pwd'/>");
	Pw.print("<input type='submit'value='register'/>");
	
	
	
	}

}
