package table;

import java.util.ArrayList;
import java.util.List;

public class Calculation
{      int k;
   List l1=new ArrayList();
	public int cal(int str1,int str2)
	{
		for(int i=str1;i<=str2;i++)
		{
			for(int j=1;j<=10;j++)
			{
				 k=i*j;
				 
				 l1.add(k);
				
			}
			 
			 
			
		}
		return k;
		
		
	}


}
