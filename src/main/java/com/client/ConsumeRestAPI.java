package com.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class ConsumeRestAPI implements CommandLineRunner{
private static final Logger log = LoggerFactory.getLogger(ConsumeRestAPI.class);
	
	
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	

	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return args -> {
			 LabelCollection collection = restTemplate.getForObject("http://eacodingtest.digital.energyaustralia.com.au/api/v1/festivals", LabelCollection.class);
			
			log.info(collection.toString());
		};
	}

	@Override
	public void run(String... args) throws Exception {
		SpringApplication.run(ConsumeRestAPI.class, args);
		
	}

}
