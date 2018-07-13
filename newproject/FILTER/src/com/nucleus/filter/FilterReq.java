package com.nucleus.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FilterReq
 */
//@WebFilter("/FilterReq")
public class FilterReq implements Filter {

    /**
     * Default constructor. 
     */
    public FilterReq() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{   String name=request.getParameter("name");
		PrintWriter out=response.getWriter();
		out.println(name);
		if(name.contains("@"))
		{
			 name=name.replaceAll("@"," ");
			out.println(name);
		
			out.println("working");
			
		}
		else
		{
			chain.doFilter(request, response);
			
			out.println("not working");
			
			
		}
			
		out.println("out");	
			
			
			
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
