package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableAutoConfiguration
@SpringBootApplication
public class EnergyAustraliaBackendConsumeRestApiApplication {
	
	
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EnergyAustraliaBackendConsumeRestApiApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(EnergyAustraliaBackendConsumeRestApiApplication.class, args);
	}
	}


