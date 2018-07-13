package com.nucleus.model.connection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nucleus.model.connection.DAO;
import com.nucleus.model.domain.CustomerMaster;
import com.nucleus.model.validations.Validation1;

import fileuploadpkg.ConnectionSetup;
import fileuploadpkg.ErrorLogFile;



public class DAOImplementation implements DAO
{
	ConnectionSetup connectionSetup=new  ConnectionSetup();
    Connection con= connectionSetup.getConnection();	
	Validation1 validation1=new  Validation1 ();	
	//FileReader fileReader=null;
    //BufferedReader bufferedReader=null;
    
	public void readFile1(CustomerMaster customerMaster,String location)
	{
		 System.out.println("welcome1");
		try
		{      
			 System.out.println("welcome2"+location);
			
			  //  FileReader  fileReader=new FileReader("C://Users//temp//Desktop//teastcase1//testCase1.txt");
			 FileReader  fileReader=new FileReader(location);
			    
			      BufferedReader bufferedReader=new BufferedReader(fileReader);
			     		      
			      String line= bufferedReader.readLine();
			      System.out.println("welcome3");
			      while(line!=null)
			         {
			    	  System.out.println("welcome4");
				      String []sp1=line.split("~",-1);
				      
				      customerMaster.setCustomerCode(sp1[0]); 
		    		  customerMaster.setCustomerName(sp1[1]);
		    		  customerMaster.setCustomerAddress1(sp1[2]);
		    		  customerMaster.setCustomerAddress2(sp1[3]);
		    		  customerMaster.setCustomerPinCode(sp1[4]);
		    		  customerMaster.setEmailaddress(sp1[5]);
		    		  customerMaster.setContactNumber(sp1[6]);
		    		  customerMaster.setPrimaryContactPerson(sp1[7]);
		    		  customerMaster.setRecordStatus(sp1[8]);
		    		  customerMaster.setActiveInactiveFlag(sp1[9]);
		    		  customerMaster.setCreateDate(sp1[10]);
		    		  customerMaster.setCreatedBy(sp1[11]);
				      customerMaster.setModifiedDate(sp1[12]);
				      customerMaster.setModifiedBy(sp1[13]);
				      customerMaster.setAuthorizedDate(sp1[14]);
				      customerMaster.setAuthorizedBy(sp1[15]);
				     
				      System.out.println(customerMaster);

				      System.out.println("finally"+validation1.isValidate( customerMaster));
				      
				      
				      
				      
				    	 if(validation1.isValidate( customerMaster)==true)
				    	  {   System.out.println(customerMaster);
				    		
				    	  DAO dao=new DAOImplementation();
				    	  dao.writeClass(customerMaster);
				    	  
				          }
				    	 else
				    	 {
				    		 ErrorLogFile errorLogFile=new ErrorLogFile();
				    		 errorLogFile.saveToFile(customerMaster);
				    
				    	 }
				     
				    	 
		          
				      line= bufferedReader.readLine();   

			   }
			      
        }
			  
		           catch (IOException e) 
		         {
		        	   System.out.println("helllloo");
			         e.printStackTrace();
		         }
	               finally
	             { 
		  
		  
	             }
	}
	   public void writeClass(CustomerMaster customerMaster)
	   {
		
	       PreparedStatement pstmt = null;
		try {
			 pstmt = con.prepareStatement("insert into puja_customer_master0 values(pujacid10.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			 pstmt.setString(1,customerMaster.getCustomerCode());
			 pstmt.setString(2,customerMaster.getCustomerName());
			 pstmt.setString(3,customerMaster.getCustomerAddress1());
			 pstmt.setString(4,customerMaster.getCustomerAddress2());
			 pstmt.setString(5,customerMaster.getCustomerPinCode());
			 pstmt.setString(6,customerMaster.getEmailaddress());
			 pstmt.setString(7,customerMaster.getContactNumber());
			 pstmt.setString(8,customerMaster.getPrimaryContactPerson());
			 pstmt.setString(9,customerMaster.getRecordStatus());
			 pstmt.setString(10,customerMaster.getActiveInactiveFlag());
			 pstmt.setString(11,customerMaster.getCreateDate());
			 pstmt.setString(12,customerMaster.getCreatedBy());
			 pstmt.setString(13,customerMaster.getModifiedDate());
			 pstmt.setString(14,customerMaster.getModifiedBy());
			 pstmt.setString(15,customerMaster.getAuthorizedDate());
			 pstmt.setString(16,customerMaster.getAuthorizedBy());
			 pstmt.executeUpdate();
	         System.out.println("abc");
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

	}
	
	

	



