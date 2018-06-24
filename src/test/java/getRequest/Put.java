package getRequest;


import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put {

	
	
	@Test
	public void test1(){
	 
		 RequestSpecification request = RestAssured.given();
		 request.header("Content-Type","application/json");
		 
		 JSONObject json= new JSONObject();
		 json.put("id", "3");
		 json.put("title", "Title Put");
		 json.put("author", "Anurag");
		 
		 request.body(json.toJSONString());
		 
		  Response response = request.put("http://localhost:3000/posts/3");
		 int code= response.getStatusCode();
		 System.out.println(code);

		 Assert.assertEquals(code, 200);
		
	}
	
	
}
