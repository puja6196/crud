package com.nucleus.model.connection;

import com.nucleus.model.domain.CustomerMaster;



public interface DAO 
{
	public void readFile1(CustomerMaster customerMaster,String location);
	public void writeClass(CustomerMaster customerMaster);
	
}
