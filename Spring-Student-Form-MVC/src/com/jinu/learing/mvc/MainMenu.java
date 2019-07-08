package com.jinu.learing.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainMenu {
	@RequestMapping("/")
	public String getMainmenu(){
		return "mainMenu";
		
	}

}
