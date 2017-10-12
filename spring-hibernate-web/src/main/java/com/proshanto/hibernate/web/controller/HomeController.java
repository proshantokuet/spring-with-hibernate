/**
 * 
 */
package com.proshanto.hibernate.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proshanto.hibernate.web.entity.User;
import com.proshanto.hibernate.web.repository.UserRepository;
import com.proshanto.hibernate.web.service.UserService;

/**
 * @author proshanto
 */
@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/")
	public String showview(Model model) {
		User user = new User();
		user.setAddress("address");
		user.setGender("F");
		user.setName("Name");
		userService.save(user);
		model.addAttribute("name", "Tom");
		model.addAttribute("formatted", "<b>blue</b>");
		return "index";
	}
	
	@RequestMapping("/user/add")
	public String addUser(Model model) {
		model.addAttribute("name", "Tom from Home page");
		model.addAttribute("formatted", "<b>Home</b>");
		return "add";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@ModelAttribute("SpringWeb") User user, ModelMap model) {
		System.err.println("" + user.getName());
		return "add";
	}
	
}
