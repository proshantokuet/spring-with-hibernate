/**
 * 
 */
package com.proshanto.hibernate.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author proshanto
 */
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showview(Model model) {
		model.addAttribute("name", "Tom");
		model.addAttribute("formatted", "<b>blue</b>");
		return "index";
	}
	
	@RequestMapping("/example")
	public String showHome(Model model) {
		model.addAttribute("name", "Tom from Home page");
		model.addAttribute("formatted", "<b>Home</b>");
		return "index";
	}
	
}
