package com.nucleus.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nucleus.Domain.DAO;
import com.nucleus.Domain.DAOImpl;
import com.nucleus.execution.CRUDExecution;


@WebServlet("/CS")
public class CRUDServlet extends HttpServlet 
{   
	
	private static final long serialVersionUID = 1L;
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{   DAO daoImpl=new DAOImpl();
     	NewEntry newEntry=new NewEntry();
		PrintWriter out=response.getWriter();
		out.println("book deleted");
		String BookId=request.getParameter("BookId");		
		newEntry.setBookId(BookId);
		daoImpl.delete(newEntry);
		
		
		
		
	}
	protected void doview(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{   NewEntry newEntry=new NewEntry();	
	    DAO daoImpl=new DAOImpl();
		PrintWriter out=response.getWriter();
		String BookId=request.getParameter("BookId");
		newEntry.setBookId(BookId);
		daoImpl.readBook( newEntry);
		
	
		
		
		
	}

	protected void doNewEntry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{  
		
		NewEntry newEntry=new NewEntry();
		PrintWriter out=response.getWriter();
		DAO daoImpl=new DAOImpl();
		String BookId=request.getParameter("BookId");
	    String BookName=request.getParameter("BookName");
	    String Author=request.getParameter("Author");	    
	    String Book=request.getParameter("Book");
	    String Price=request.getParameter("Price");
	   
	    out.println(BookId);
	  	out.println(BookName);	  	 
	  	out.println(Author);	
		out.println(Book);
		out.println(Price);
	  
		
		
	    newEntry.setBookId(BookId);
	    newEntry.setBookName(BookName);
	    newEntry.setAuthorName(Author);
	    newEntry.setBook(Book);
	    newEntry.setPrice(Price);
	   
	    
	    
	    daoImpl.saveBook(newEntry);
	    
        out.println("new book entry");
	   
	    
	  	
	  	
		
	}
    public CRUDServlet() 
    {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{   PrintWriter out=response.getWriter();
	  
		if(request.getParameter("NEWENTRY") != null)
		   {     
			response.sendRedirect("NEW.html");	
		   }		         
	       if(request.getParameter("Save")!=null)
		      {		
		        doNewEntry(request,response);
		      }
	    if(request.getParameter("READBOOK") != null)
	       {
	    	response.sendRedirect("VIEW.html");	
	       }
	       if(request.getParameter("view")!=null)
		      {		
		       doview(request,response);		       
		      }
	   /* if(request.getParameter("UPDATE") != null)
	       {
	    	response.sendRedirect("update.html");	
	       }
	       if(request.getParameter("Save")!=null)
		      {		
		       doNewEntry(request,response);		       
		      }*/
	    if(request.getParameter("DELETEBOOK") != null)
	       {out.println("deleteeeeeee");
	    	response.sendRedirect("delete.html");	
	       }
	       if(request.getParameter("delete")!=null)
		      {		
	    	   doDelete(request,response);		       
		      }
	}
		 			
			 		
            		
	
		/*else if(request.getParameter("READBOOK") != null)
		{
			doNewEntry(request,response);
			
		}*/
	/*	else if(request.getParameter("UPDATE") != null)
		{
			doUpdate(request,response);
			
		}
		else if(request.getParameter("DELETEBOOK") != null)
		{
			doDelete(request,response);
			
		}
		*/
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
