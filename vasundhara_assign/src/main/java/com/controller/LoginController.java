package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String showLoginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {
		
		if (username.equals("vinayak") && password.equals("123")) {
			return "redirect:/welcome";
		}  else if (username.equals("indrajeet") && password.equals("345")) {
            return "redirect:/welcome";
        } else if (username.equals("shubham") && password.equals("654")) {
            return "redirect:/welcome";
        } else {
            model.addAttribute("Incorrect username or password!");
            return "login";	
		}
	}

	@RequestMapping("/welcome")
	public String showWelcomePage() {
		return "welcome";
	}

}

