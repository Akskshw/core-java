package com.xworkz.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Controller
public class HelloController {
	@RequestMapping(value="/helloworld")
	// @PostMapping("/helloworld")
public ModelAndView m1(@ModelAttribute HelloWorld hello) {
 System.out.println("----------message:--------------" +hello.getMessage());
 String msg=hello.getMessage()+"to xworkz";
 //ModelAndView holds information of view and data
 //1st parameter is viewname
 //2nd parameter is modelname which we have define in jsp page with $ symbol {}
 //3rd parametr is actual value or a object
return new ModelAndView("success", "msgkey", msg);
}}
