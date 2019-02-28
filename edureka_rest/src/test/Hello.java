package test;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.*; //Path;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/hello")
public class Hello {

	@GET
	
	//@Produces(MediaType.TEXT_XML)
	/*
	public String sayHello() {
		String str = "<? xml version='1.0' ?> +"
				+ "<hello>Hello from xml </hello>";
		return str;
	}
	
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJason() {
		String str = null;
		return str;
	}
	*/
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML(@QueryParam("name") String name, @QueryParam("card_no") String cardNo, @QueryParam("amount") int amount ) {
		System.out.println("name = "+name);
		System.out.println("card NO ="+cardNo);
		String response = null;
		
		if (amount > 10000){
			
			System.out.println("amount > 10000;  "+amount);
			response = "Card not approved";
		} else{
			
			System.out.println("amount < 10000;  "+amount);
			response = "Card  approved";
			
		}
			
		String str = "<html>  <title> Credit card autorization "+ name+" </title> <body><h1>"+response+"</h1> </body></html>";
		
		return str;
	}
	
	// create restTest.war
	// http://localhost:8080/restTest/hello
	
}
