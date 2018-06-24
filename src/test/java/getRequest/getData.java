package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import  static io.restassured.RestAssured.*;

public class getData {
	String url="http://jsonplaceholder.typicode.com/users/1";

	@Test
	public void testResponsecode(){
	 
	 int code= get(url).getStatusCode();
	 System.out.println(code);
	 
	 //Assert.assertEquals(code, 200);
		
	}
	
	@Test
	public void testBody(){
		
	
		 String data= get(url).asString();
		 System.out.println(data);

			
		}
	
}
