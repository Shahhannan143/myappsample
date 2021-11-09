package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyHomePageController {
	//old approach
 @GetMapping("/home")
public ModelAndView welcome (ModelAndView andview) {
	 andview.setViewName("NewFile");
	 return andview;
 }
 //new approach
	 @GetMapping("/home1")
	 public String welcome1() {
		 return "NewFile";
	 } 
	 
 }
	
	

