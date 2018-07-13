package com.nucleus.model.validations;

import com.nucleus.model.domain.CustomerMaster;


public class Validation1 
{
	
		
		public boolean isValidate(CustomerMaster customerMaster)
		{
			if( (isValidCustomerCode(customerMaster)==true)&& (isValidCustomerName(customerMaster)==true )&&(isValidCustomerAddress1(customerMaster)==true )&& (isValidCustomerPinCode(customerMaster)==true )&& (isValidEmailaddress(customerMaster)==true) && (isValidPrimaryContactPerson(customerMaster)==true )&&(isValidRecordStatus(customerMaster)==true) && (isValidActiveInactiveFlag(customerMaster)==true) && (isValidCreateDate( customerMaster)==true) && (isValidCreateBy(customerMaster)==true ))
			{	
				
				return true;
			}
			else
			{
				return false;
			}
		}
		public boolean isValidCustomerCode(CustomerMaster customerMaster )
		{
			if(customerMaster.getCustomerCode().length()<=10 &&!(customerMaster.getCustomerCode()).isEmpty())
			{
				System.out.println(customerMaster.getCustomerCode()+"true");
				return true; 
			}
			else
			{
				System.out.println(customerMaster.getCustomerCode()+"false");
				return false;
			}
		}
	//public boolean isValidCustomerName(CustomerMaster customerMaster )
//		{
//			if((customerMaster.getCustomerName().length()<=30) && !(customerMaster.getCustomerName().isEmpty()) && (customerMaster.getCustomerName().matches("[a-zA-Z0-9]+")) &&  (customerMaster.getCustomerName().contains(" ") ))
//			{System.out.println(customerMaster.getCustomerName()+"true");
//				return true; 
//			}
//			else
//			{
//				System.out.println(customerMaster.getCustomerName()+"false");
//				return false;
//			}
//		}
		////////////////////////////////////////
		
		public boolean isValidCustomerName(CustomerMaster customerMaster )
		{
			String string=customerMaster.getCustomerName();
			char[] c = string.toCharArray();
			int l = c.length;
			if(l<=30)
				{
					for(char ch :c)
					{
						if(!Character.isLetterOrDigit(ch))
						{
							String c1 = Character.toString(ch);
							if(!c1.equals(" "))
							return false;
						}
					}
					return true;
				}
				return false;
			
			
		}
		
		
		/////////////////////////////////////////////
		
		public boolean isValidCustomerAddress1(CustomerMaster  customerMaster )
		{
			if((customerMaster.getCustomerAddress1().length()<=100) && (!(customerMaster.getCustomerAddress1().equals(""))) && (customerMaster.getCustomerAddress1() !=null))
			{
				System.out.println(customerMaster.getCustomerAddress1()+"true");
				return true;
			}
			else
			{
				System.out.println(customerMaster.getCustomerAddress1()+"false");
				return false;
			}
		}
		public boolean isValidCustomerPinCode(CustomerMaster customerMaster )
		{
			if((customerMaster.getCustomerPinCode().length()==6) && (!(customerMaster.getCustomerPinCode().equals(""))) && (customerMaster.getCustomerPinCode()!=null))
			{
				System.out.println(customerMaster.getCustomerPinCode()+"true");
				return true;
			}
			else
			{
				System.out.println(customerMaster.getCustomerPinCode()+"false");
				return false;
			}
		}
		public boolean isValidEmailaddress(CustomerMaster customerMaster )
		{
		String email = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" +"(?:[a-zA-Z0-9-]+\\.)+[a-z" +"A-Z]{2,7}$";
			if((customerMaster.getEmailaddress().matches(email)) && (!(customerMaster.getEmailaddress().equals(""))) && (customerMaster.getEmailaddress()!=null) )
			{   
				System.out.println(customerMaster.getEmailaddress()+"true");
				return true;
			}
			else
			{ 
				System.out.println(customerMaster.getEmailaddress()+"false");
				return false;
			}
		}
		public boolean isValidPrimaryContactPerson(CustomerMaster customerMaster )
		{
			if((customerMaster.getPrimaryContactPerson().length()<=100) && (!(customerMaster.getPrimaryContactPerson().equals(""))) && (customerMaster.getPrimaryContactPerson()!=null))
			{
				System.out.println(customerMaster.getPrimaryContactPerson()+"true");
				return true;
			}
			else
			{
				System.out.println(customerMaster.getPrimaryContactPerson()+"false");
				return false;
			}
		}
		public boolean isValidRecordStatus( CustomerMaster customerMaster )
		{
			if((customerMaster.getRecordStatus().length()<=1) && ((customerMaster.getRecordStatus().equals("N")) ||(customerMaster.getRecordStatus().equals("M"))|| (customerMaster.getRecordStatus().equals("D")) || (customerMaster.getRecordStatus().equals("A")) || (customerMaster.getRecordStatus().equals("R"))) && (customerMaster.getRecordStatus()!=null))
			{
				System.out.println(customerMaster.getRecordStatus()+"true");
				return true;
			}
			else
			{
				System.out.println(customerMaster.getRecordStatus()+"false");
				return false;
			}
		}
		public boolean isValidActiveInactiveFlag(CustomerMaster customerMaster )
		{
			if((customerMaster.getActiveInactiveFlag().length()<=1) && ((customerMaster.getActiveInactiveFlag().equals("A")) ||(customerMaster.getActiveInactiveFlag().equals("I"))) && (customerMaster.getActiveInactiveFlag()!=null))
			{
				System.out.println(customerMaster.getActiveInactiveFlag()+"true");
				return true;
			}
			else
			{
				System.out.println(customerMaster.getActiveInactiveFlag()+"false");
				return false;
			}
		}
		public boolean isValidCreateDate(CustomerMaster customerMaster)
		{
			if((!(customerMaster.getCreateDate().equals(""))) && (customerMaster.getCreateDate()!=null))
			{
				System.out.println(customerMaster.getCreateDate()+"true");
				return true;
			}
			else
			{
				System.out.println(customerMaster.getCreateDate()+"false");
				return false;
			}
		}
		public boolean isValidCreateBy(CustomerMaster customerMaster)
		{
			if((!(customerMaster.getCreatedBy().equals(""))) && (customerMaster.getCreatedBy()!=null))
			{System.out.println(customerMaster.getCreatedBy()+"true");
				return true;
			}
			else
			{
				System.out.println(customerMaster.getCreatedBy()+"false");
				return false;
			}
		}
		
}
