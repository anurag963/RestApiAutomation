/*package rest.service;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import requestPojo.CreateUser;

public class Service1 {

public Response createUserAPI(String userName, int iD, String password ){
		
		CreateUser createUser= new CreateUser();
		createUser.setID(iD);
		createUser.setPassword(password);
		createUser.setUserName(userName);
	
		JSONObject jsonObject= new JSONObject(createUser);
		list= new ArrayList<JSONObject>();
		list.add(jsonObject);
		System.out.println(list);
		System.out.println(jsonObject);
		
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType("application/json");
		requestSpecification.accept("application/json");
		requestSpecification.body(jsonObject);
		//Response responce = requestSpecification.post(ServiceURL.createUsers);
		
		System.out.println(responce);
		return responce;
		
		
	}
	
public Response get( ){
	
	
	RequestSpecification requestSpecification = RestAssured.given();
	requestSpecification.contentType("application/json");
	requestSpecification.accept("application/json");
	
//	Response responce = requestSpecification.post(ServiceURL.createUsers+"/1");
	
	System.out.println(responce);
	return responce;
	
	
}

	@Test
	public void test() {
		Service service = new Service();

		//Response data = service.createUserAPI("str", 1, "str");
		Response data = service.get();
		System.out.println(data.asString());
		System.out.println(data.getStatusCode());

		Gson gson = new Gson();

		String str = data.asString();

		CreateUser createUser = gson.fromJson(str, CreateUser.class);
		int test1 = createUser.getID();
		String test2 = createUser.getUserName();
		System.out.println(test1);
		System.out.println(test2);
	

	}


}
*/