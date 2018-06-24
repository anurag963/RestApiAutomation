package com.test.testScripts;

import org.testng.annotations.Test;

import com.base.TestBase;
import com.client.RestClient;


public class TestCaseGet extends TestBase {

	@Test
	public void test(){
		RestClient restClient= new RestClient();
		response= restClient.getSingleUserAPI("1");
		System.out.println(response.getStatusCode());
		
	}
	
}
