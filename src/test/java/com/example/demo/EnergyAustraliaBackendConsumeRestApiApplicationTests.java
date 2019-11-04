package com.example.demo;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.client.LabelCollection;

import io.restassured.RestAssured;

@SpringBootTest
class EnergyAustraliaBackendConsumeRestApiApplicationTests {

	@BeforeClass
	public static void init() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port= 8082;
	}
	
	@Test
	void contextLoads() {
	LabelCollection collection =new LabelCollection();
	collection.setBands("Winter Primates");
	collection.setRecordLabel("ACR");
	}
}
