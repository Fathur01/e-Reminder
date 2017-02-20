package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="email")
public class EmailController {
	
	@RequestMapping(value="/page", method = RequestMethod.GET)
	public ModelAndView getPage(){
		ModelAndView view=new ModelAndView("Hello");
		return view;
	}

}
