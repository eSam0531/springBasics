package com.esmee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esmee.model.LoginBean;

@Controller
@RequestMapping("/api")
public class MCVController {

//	@GetMapping("/")
//	public ModelAndView display() {
//		return new ModelAndView("welcome");
//	}

//	@GetMapping("/bl")
//	public String accessBL(Model model) {
//		model.addAttribute("msg", "Welcome to my accessBL method.");
//		return "welcome";
//	}

	@GetMapping("/login")
	public String startUp(Model model) {
		model.addAttribute("msg", "Please enter your login details");
		return "login";
	}
	
	//@RequestMapping(value = {"/login"}, method = RequestMethod.POST)
	@PostMapping("/login")
	public String login(Model model, @ModelAttribute("loginBean") LoginBean bean) {
		if (bean != null && bean.getUserName() != "" & bean.getPassword() != "") {
			if (bean.getUserName().equals("esmee") && bean.getPassword().equals("123")) {
				model.addAttribute("msg", bean.getUserName());
				return "success";
			} else {
				model.addAttribute("error", "Invalid UserName/Password");
				return "login";
			}
		} else {
			model.addAttribute("error", "Please Enter Login Details");
			return "login";
		}

	}
}
