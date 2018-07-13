package com.nucleus.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nucleus.DAO.StudentDAO;
import com.nucleus.DAO.StudentDaoImpl;
import com.nucleus.domain.StudentRegistration;

/**
 * Servlet implementation class Student
 */
@WebServlet("/St")
public class Student extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
      String str1=request.getParameter("first name");
      String str2=request.getParameter("last name");
      String str3=request.getParameter("age");
      String str4=request.getParameter("gender");
      String str5=request.getParameter("city");
      String str6=request.getParameter("stream");
      StudentRegistration sR=new StudentRegistration();
      sR.setFirstName(str1);
      sR.setLastName(str2);
	  sR.setAge(str3);
	  sR.setGender(str4);
	  sR.setCity(str5);
	  sR.setStream(str6);
	
	  StudentDAO studentDao=new StudentDaoImpl();
	  studentDao.save(sR);
      PrintWriter out=response.getWriter();
      out.println(str1);
      out.println(str2);
      out.println(str3);
      out.println(str4);
      out.println(str5);
      out.println(str6);
	  
	}

}
