package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class sqrServlet extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
//		//int r=(int)req.getAttribute("result");
////		int r=Integer.parseInt(req.getParameter("result"));
////		r=r*r;
////		
//		HttpSession session=req.getSession();
//		int r= (int)session.getAttribute("result");
		int r=0;
		Cookie cookies[]=req.getCookies();
		for(Cookie c:cookies) {
			if(c.getName().equals("result"))
				r=Integer.parseInt(c.getValue());
		}
		
		r*=r;
		PrintWriter out=res.getWriter();
		out.println("<html><body bgcolor='yellow'>");
		out.println("From squre servlet "+r);
		out.println("</body></html>");
		
		
	}
}
