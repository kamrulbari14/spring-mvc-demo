package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//need a controller method to read form data
	//add form data to the model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutOut(HttpServletRequest request, Model model) {
		
		//get the data
		String theName = request.getParameter("studentName");
		
		//converting to the uppercase
		theName = theName.toUpperCase();
		
		//sending a message
		String result ="Yo! " +theName;
		
		//getting data to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String theName, 
			Model model) {
		
		//converting to the uppercase
		theName = theName.toUpperCase();
		
		//sending a message
		String result ="Yo! friend " +theName;
		
		//getting data to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	}


}
