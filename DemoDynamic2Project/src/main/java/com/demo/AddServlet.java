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


@WebServlet("/add")
public class AddServlet extends HttpServlet{

	//
	//public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
//	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		
//		int i=Integer.parseInt(req.getParameter("num1"));
//		int j=Integer.parseInt(req.getParameter("num2"));
//		int result=i+j;
//		System.out.println("result is: "+result);
//		
//		PrintWriter out=res.getWriter();
//		out.println("Result is:"+result);
//	
//	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
					
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int result=i+j;
//////		System.out.println("result is: "+result);
//////		
//////		PrintWriter out=res.getWriter();
//////		out.println("Result is:"+result);
////		
////		//request dispatcher
////		req.setAttribute("result", result);
////		
////		RequestDispatcher reqDis= req.getRequestDispatcher("sq");
////		reqDis.forward(req, res);
////		res.sendRedirect("sq?result="+result);//url rewriting
//	//		
//		HttpSession session=req.getSession();
//		session.setAttribute("result", result);
//		res.sendRedirect("sq");
		Cookie cookie=new Cookie("result",result+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
		//session management
		
		
		
	}
}
