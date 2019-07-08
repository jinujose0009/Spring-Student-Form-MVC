package com.jinu.learing.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
	}
	@RequestMapping("/customerform")
	public String getcutomerForm(Model model){
		model.addAttribute("cutomer",new Customer());
		
		return "customer-form";
	}
	@RequestMapping("ProcessCustomerData")
	public String ProcessForm(@Valid @ModelAttribute("cutomer")Customer customer,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "customer-form";
		}
		else{
		return "customer-confirmation";
		}
	}

}
