package com.esmee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

	@Autowired
	private KafkaTemplate<String,String> template;
	
	public void send(String message) {
		String topic="esmeeTopic";
		template.send(topic, message);
	}
	
}
