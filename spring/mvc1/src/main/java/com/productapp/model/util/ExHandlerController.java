package com.productapp.model.util;

import com.productapp.exceptions.ProductNotFoundExcption;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice	//under the hood use AOP : Throws Advice
public class ExHandlerController {

	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handle404() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("404");
		mv.addObject("error", "page not found");
		
		return mv;
	}
	
	@ExceptionHandler(ProductNotFoundExcption.class)
	public ModelAndView handleProductNotFoundExcption(ProductNotFoundExcption ex) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("404");
		mv.addObject("error", "page not found");
		return mv;
	}
}