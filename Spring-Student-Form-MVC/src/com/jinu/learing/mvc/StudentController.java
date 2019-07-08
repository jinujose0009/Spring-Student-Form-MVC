package com.jinu.learing.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showform")
	public String showForm(Model model){
		//create student objct
		Student theStudent= new Student();
		//Add student object into model
		model.addAttribute("student",theStudent);
		return "student-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student")Student thestudent){
		//log the input data
		System.out.println("theStudetn "+thestudent.getFirstName()+"  "+thestudent.getLastName()
				+" "+thestudent.getCountry()+" "+thestudent.getLanguage());
		return "student-confirmation";
	}

}

