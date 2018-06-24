package com.test.testScripts;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class1 {

	@Test
	public void test() {
	  Gson gson = new Gson();

	  String jsonString = "{"
	      + "'zipcode' : 'Testzipcode',"
	      + "'city' : 'Testcity',"
	      + "'state' : 'Teststate',"
	      + "'landmark' : 'Testlandmark'"
	      + "}";

	  StartResponse response = gson.fromJson(jsonString, StartResponse.class);
	  String test2=response.getCity();
	  System.out.println(test2);


	}
}