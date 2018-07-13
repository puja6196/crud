package com.nucleus.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/login2")
public class Login2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login2() 
    {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{


		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		out.println("<center>WELCOME</center><br>");
		String emailid=(String) session.getAttribute("emailid");
		String password=(String) session.getAttribute("password");
		out.println("EMAILID"+emailid);
		out.println("PASSWORD"+password);
	    session.invalidate();
	    response.sendRedirect("login.html");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
	}    

}
