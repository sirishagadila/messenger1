package org.sirisha.javabrains.messenger2.resources;

import java.util.List;

import org.sirisha.javabrains.messenger2.service.Messageservice;
import org.sirisha.javabrains.messenger2.model.Messsage;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/messages")
public class MessageResource {
     Messageservice messageService = new Messageservice();
	
      @GET
      @Produces(MediaType.TEXT_PLAIN)
      public List<Messsage> getMessages() 
      {
	    return messageService.getAllMessages();
	  }
	
}