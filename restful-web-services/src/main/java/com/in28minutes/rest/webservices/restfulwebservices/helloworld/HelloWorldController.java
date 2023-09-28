package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
//	@RequestMapping(method = RequestMethod.GET , path= "/hello-world" )
//	public String HelloWorldController() {
//		
//		return "Hello World" ;
//	}
	
	
	@GetMapping( path= "/hello-world" )
	public String HelloWorldController() {
		
		return "Hello World" ;
	}
	
	
	/// to send json response
	
	
	@GetMapping( path= "/hello-world-bean" )
	public helloWorldBean HelloWorldBean() {
		
		return new helloWorldBean("Hello world of bean") ;
	}
	
	
	//Path Parameter
	// /users/{id}/todos/{id} => /users/1/todo/100
	// /hello-world/path-variable/{name}
	// /hello-world/path-variable/{Dibya}
	
	@GetMapping(path = "/hello-world/personName/{name}")
	public helloWorldBean HelloName(@PathVariable String name) {
		return new helloWorldBean("Hello " + name);
		
	}

}
