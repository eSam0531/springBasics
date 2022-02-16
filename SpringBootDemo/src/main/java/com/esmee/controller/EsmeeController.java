package com.esmee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EsmeeController {

	@GetMapping("/1")
	public String myBusinessLogic() {
		return "<h1 style=color:blue>Welcome to my BusinessLogic1</h1>";
	}
	
	@GetMapping("/2")
	public String myBusinessLogic2() {
		return "<h1 style=color:green>Welcome to my BusinessLogic2</h1>";
	}
}
