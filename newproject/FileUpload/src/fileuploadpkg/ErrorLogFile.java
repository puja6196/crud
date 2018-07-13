package fileuploadpkg;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.nucleus.model.domain.CustomerMaster;



public class ErrorLogFile
{

	 FileWriter fileWriter =null;
 PrintWriter  printWriter=null;
	public void saveToFile(CustomerMaster customerMaster)
	{
		
	  try 
	  {
		fileWriter=new  FileWriter ("C:\\Users\\temp\\Desktop\\errorlogfile\\errorlogfile.txt",true);
		PrintWriter  printWriter=new PrintWriter(fileWriter);
		printWriter.format("%s\n",customerMaster);
		printWriter.flush();		
	  } 
	  catch (IOException e) 
	  {
	
		e.printStackTrace();
	  }
	    
		
	}
}
