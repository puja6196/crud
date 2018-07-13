package com.nucleus.Domain;

import com.nucleus.controller.NewEntry;

public interface DAO 
{
public void saveBook(NewEntry newEntry);
public void readBook(NewEntry newEntry);
public void delete(NewEntry newEntry);
public void update(NewEntry newEntry);


}
