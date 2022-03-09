package com.esmee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.esmee.service.KafkaProducerService;

@RestController
public class EsmeeController {
	
	@Autowired
	KafkaProducerService service;
	
	@GetMapping("/producer")
	public String producer(@RequestParam("message") String message) {
		service.send(message);
		return "Message sent to the Kafka Topic esmeeTopic successfully";
	}

}
