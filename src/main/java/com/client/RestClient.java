package com.client;

import com.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RestClient extends TestBase{

	// Get method
	public Response getSingleUserAPI(String userId) {

		RequestSpecification requestSpecification = RestAssured.given();
		String url=prop.getProperty("URL")+prop.getProperty("users")+"/"+userId;
		Response responce = requestSpecification.get(url);
		return responce;

	}
	
	
}
