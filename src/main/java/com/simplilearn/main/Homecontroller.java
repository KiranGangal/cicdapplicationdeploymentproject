package com.simplilearn.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller
{   
	@RequestMapping("home")
    public String home()
    {
    	System.out.println("Hi");
    	return "home.jsp";
    }

	
}
