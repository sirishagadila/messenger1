package org.sirisha.javabrains.messenger2.service;

import java.util.ArrayList;
import java.util.List;

import org.sirisha.javabrains.messenger2.model.Messsage;

public class Messageservice {

	
	  public List<Messsage> getAllMessages()
		  
		  {
		     Messsage m1=new Messsage(1L, "Hello World!", "sirisha");
		     Messsage m2=new Messsage(1L, "Hello Jersey!", "sirisha");
		     List<Messsage> list =new ArrayList<>();
		     list.add(m1);
	   	     list.add(m2);
             return list;

          }

}