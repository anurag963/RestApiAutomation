package com.test.webservice.methods;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WebService {

	public static Response Get(String URI){
		
		RequestSpecification requestSpec = RestAssured.given();
		requestSpec.contentType(ContentType.JSON);
		Response response = requestSpec.get(URI);
		return response;	
	}
	
	public static Response Post(String URI, String stringJSON){
			
			RequestSpecification requestSpec = RestAssured.given().body(stringJSON);
			requestSpec.contentType(ContentType.JSON);
			Response response = requestSpec.get(URI);
			return response;	
		}
	
	public static Response Put(String URI, String stringJSON){
		
		RequestSpecification requestSpec = RestAssured.given().body(stringJSON);
		requestSpec.contentType(ContentType.JSON);
		Response response = requestSpec.get(URI);
		return response;	
	}
	
	
	
}
