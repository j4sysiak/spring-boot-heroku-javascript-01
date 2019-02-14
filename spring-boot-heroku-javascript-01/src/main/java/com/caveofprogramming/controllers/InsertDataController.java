package com.caveofprogramming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InsertDataController {
 
 
	@RequestMapping(value = "/insertdata", method=RequestMethod.GET)
    ModelAndView insertdata(ModelAndView modelAndView) {
		  
		modelAndView.setViewName("app.insertdata");
		
		return modelAndView;
	} 

}
