package com.javabrains.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javabrains.web.Dao.AlianDao;
import com.javabrains.web.Model.Alian;
import com.javabrains.web.Util.Utility;

/**
 * Servlet implementation class getAlianController
 */
public class getAlianController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int aid = Integer.parseInt(request.getParameter("aid"));
		String aname= request.getParameter("aname");
		String tech = request.getParameter("tech");
		
		AlianDao aliandao = new AlianDao();
		Alian a = new Alian();
		a.setAid(aid);
		a.setAname(aname);
		a.setTech(tech);
		
		int state = aliandao.saveAlian(a);
		if(state==1)
		{
			System.out.println("data saved successfully");
			
		}
		else
		{
			System.out.println("data not save successfully");
		}
		request.setAttribute("alian", a);
		Utility u = new Utility();
		
		
		RequestDispatcher rd= request.getRequestDispatcher("showAlian.jsp");
		rd.forward(request, response);
	}

	

}
