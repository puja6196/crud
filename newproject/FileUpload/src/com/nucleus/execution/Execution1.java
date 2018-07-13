package com.nucleus.execution;

import com.nucleus.model.connection.DAO;
import com.nucleus.model.connection.DAOImplementation;
import com.nucleus.model.domain.CustomerMaster;

public class Execution1 
{
	
 public void program(String location,String choice)
 {     
	   DAO dao=new DAOImplementation();
          CustomerMaster customerMaster=new CustomerMaster();
          
	     

	      if(choice.equalsIgnoreCase("RECORD"))
	      {
	    	  System.out.println("Record Level Rejection");
	    	  System.out.println(location);
	    	  dao.readFile1(customerMaster, location);
	    	  
	    	  
	    	  
	   }
	      else
	      {
	    	  System.out.println("You have made the wrong choice ");
	    	  
	    	  
	      }
	   
	      }
 }
	

