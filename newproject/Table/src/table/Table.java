package table;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Table
 */
@WebServlet("/Table")
public class Table extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Table()
    {
        super();
        // TODO Auto-generated constructor stub
    }

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
		int str1=Integer.parseInt(request.getParameter("starting number"));
		int str2=Integer.parseInt(request.getParameter("ending number"));
		Number n=new Number();
	    n.setStartingNumber(str1);
		n.setEndingNumber(str2);
		/*int a=n.getStartingNumber();
		int b=n.getEndingNumber();*/
		Calculation calculation=new Calculation();
		int c=calculation.cal(str1,str2);
		PrintWriter out=response.getWriter();
	      out.println(c);
		
		
		

	}

}
