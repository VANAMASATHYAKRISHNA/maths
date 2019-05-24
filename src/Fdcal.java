

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Fdcal extends HttpServlet {
	
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String a=request.getParameter("tenure");
		String b=request.getParameter("principale");
		ServletConfig config=getServletConfig();
		String j=config.getInitParameter("roi");
		int i=Integer.parseInt(j);
		int t=Integer.parseInt(a);
		int p=Integer.parseInt(b);
		int result=((p*t*i)/100)+p;
		PrintWriter Pw;
		Pw=response.getWriter();
		Pw.print("sum of the money="+result);
		
	}
}
