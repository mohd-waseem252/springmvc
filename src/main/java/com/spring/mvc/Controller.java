package com.spring.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
@RequestMapping("/control")
public class Controller {
    
	@RequestMapping("/home")
	public String home() {
		System.out.println("this is home page");
		return "index";
	}
	
	@RequestMapping("/loan")
	public String loan() {
		
		return "loan";
		
	}
	
	@ResponseBody
	@RequestMapping("/insurance")
	public String insurance() {
		return "you are required to submit following documents :"+"1.Aadhar card \n2.PanCard \n3.Passbook";
	}
}
