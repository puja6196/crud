package com.nucleus.Domain;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;








import com.nucleus.Connection.ConnectionSetup;
import com.nucleus.controller.NewEntry;

public class DAOImpl implements DAO
{  
	String BookId;
	String BookName;
	String Book;
	String Author;
	String Price;

	
	ConnectionSetup connectionSetup=new  ConnectionSetup();
    Connection con= connectionSetup.getConnection();	

	
	public void saveBook(NewEntry newEntry)
	{  
		
		  PreparedStatement pstmt=null;
			try {
				 pstmt = con.prepareStatement("insert into pujabook3 values(?,?,?,?,?)");
				 pstmt.setString(1,newEntry.getBookId());
				 pstmt.setString(2,newEntry.getBookName() );
				 pstmt.setString(3,newEntry.getAuthor());
				 pstmt.setString(4,newEntry.getBook() );
				 pstmt.setString(5,newEntry.getPrice() );
				
				 pstmt.executeUpdate();
		         System.out.println(newEntry.getBook());
			}
			catch (SQLException e) 
			{
	           
				e.printStackTrace();
			}
			finally
			{
				try {
					connectionSetup.closeConnection(); 
					pstmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
				
	
		
	}

}
	public void delete(NewEntry newEntry)
	{   System.out.println("deleteeeee");
		 PreparedStatement pstmt=null;
			try {
				 pstmt = con.prepareStatement("delete from pujabook3 where  BookId=?");
				 pstmt.setString(1,newEntry.getBookId());
				 pstmt.executeUpdate();
		         System.out.println("hellllllllllllooooooo");
			}
			catch (SQLException e) 
			{
	           
				e.printStackTrace();
			}
			finally
			{
				try {
					connectionSetup.closeConnection(); 
					pstmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
				
	
		
	}
		
	}
	
	public void update(NewEntry newEntry) 
	{
		PreparedStatement pstmt=null;
		try {
			 pstmt = con.prepareStatement("update table pujabook3 where bookid=?" );
			 pstmt.setString(1,newEntry.getBookId());
			 pstmt.setString(2,newEntry.getBookName() );
			 pstmt.setString(3,newEntry.getAuthor());
			 pstmt.setString(4,newEntry.getBook() );
			 pstmt.setString(5,newEntry.getPrice() );
			 pstmt.executeUpdate();
			 
			 
		}
		catch (SQLException e) 
		{
           
			e.printStackTrace();
		}
		finally
		{
			try {
				connectionSetup.closeConnection(); 
				pstmt.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			

	
}
	
		
	}
	@Override
	public void readBook(NewEntry newEntry)
	{

		  PreparedStatement pstmt=null;
			try {
				 pstmt = con.prepareStatement("select * from pujabook3 where bookid=?");
				 pstmt.setString(1,newEntry.getBookId());
				 pstmt.setString(2,newEntry.getBookName() );
				 pstmt.setString(3,newEntry.getAuthor());
				 pstmt.setString(4,newEntry.getBook() );
				 pstmt.setString(5,newEntry.getPrice() );				
			     pstmt.executeUpdate();
		         
			}
			catch (SQLException e) 
			{
	           
				e.printStackTrace();
			}
			finally
			{
				try 
				{
					connectionSetup.closeConnection(); 
					pstmt.close();
				} catch (SQLException e) 
				{

					e.printStackTrace();
				}	
		
	        }
}
}