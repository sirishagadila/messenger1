package org.sirisha.javabrains.messenger2.model;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Messsage
{
	private long id;
	private String message;
	private Date created;
    private String author;
    
    public Messsage() {
    	
    }
    
	public Messsage(long id, String message, String author)
	{
	 this.id=id;
	 this.message=message;
	 this.author=author;
	 this.created=new Date();
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
    
    
}
