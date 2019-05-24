package Httpsession;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class S2 extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs=request.getSession();
		String firstname=(String)hs.getAttribute("firstname");
		String lastname=(String)hs.getAttribute("lastname");
		String username=request.getParameter("username");
		String password=request.getParameter("pwd");
		PrintWriter Pw;
		Pw=response.getWriter();
		Pw.println("first name is"+firstname);
		Pw.println("last name is"+lastname);
		Pw.println("user name is"+username);
		Pw.println("password is"+password);
		
		}
}