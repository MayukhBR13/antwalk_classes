package com.springmvcValidationDemo;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class EmployeeController {
	
	@RequestMapping("/welcome")
	public String displayForm(Model m){
		
		System.out.println("welcome");
		m.addAttribute("emp",new Employee());
		String a=null;
//		if(a==null)
//			throw new NullPointerException();
		a.length();
		return "viewform";
	}
	
	@RequestMapping("/submit")
	public String submitform(@Valid @ModelAttribute("emp") Employee emp,BindingResult br,
			Model m) {
		System.out.println(emp);
		if(br.hasErrors()) 
			return "viewform";
		else {
			m.addAttribute("emp",emp);
			return "display";
		}
	}
//
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value=NullPointerException.class)
//	public String exceptionHandle(Model m) {
//		m.addAttribute("msg","NULL Pointer Exception has occured");
//		return "error";
//	}
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value=Exception.class)
//	public String exceptionHandleClass(Model m) {
//		m.addAttribute("msg","Some Exception has occured");
//		return "error";
//	}
}
