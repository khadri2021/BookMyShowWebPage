package com.khadri.servlet.book;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookMyShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();

		
		pw.println("<style>");
		pw.println("td{padding : 15px}");
		pw.println(".checkbox {background-color: red;}");
		pw.println("input[type='checkbox']{accent-color:red;}");
		pw.println("</style>");
		pw.println("<table  >");
 		for (int j = 1; j <=7; j++) {

			pw.println("<tr>");
			for (int i = 1; i <= 12; i++) {

				if (i == 4 || i == 9) {
					pw.println("<td>");
					pw.println("</td>");

				}else {
					pw.println("<td style={padding: 15px;}>"); 
					pw.println("<input type='checkbox' name="+j+""+i+"/>");
					
					pw.println("</td>");
				}
				
			}
			pw.println("</tr>");
			
		}
 		
		pw.println("</table>");
		
		pw.println("<button type=\"button\" onclick=\"myFunction()\">Submit</button>");
	}
	
}
