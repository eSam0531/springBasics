package com.esmee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
	
	@GetMapping("/default")
	public String defaultPage() {
		return "default";
	}
	
	@GetMapping("/welcome")
	public String welcom() {
		return "welcome";
	}
	
	@GetMapping("/user")
	public String user() {
		return "user";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	@GetMapping("/accessDenied")
	public String accessDenied() {
		return "accessDenied";
	}
}
