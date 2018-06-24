package rest.service;

import java.util.List;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import requestPojo.Address;
import requestPojo.Company;
import requestPojo.CreateUser;
import requestPojo.Geo;
import responsePojo.CreateUserResponse;

public class Service {

	List<JSONObject> list;

	public Response getPersonAPI() {

		RequestSpecification requestSpecification = RestAssured.given();
		Response responce = requestSpecification.get(ServiceURL.createUserURL);
		return responce;

	}

	public Response createPersonAPI(int id, String name, String username, String email, String phone, String website,
			String lat, String lng, String street, String suite, String city, String zipcode, String compname,
			String catchPhrase, String bs) {

		CreateUser createUser = new CreateUser();
		createUser.setId(id);
		createUser.setName(name);
		createUser.setUsername(username);
		createUser.setEmail(email);
		createUser.setPhone(phone);
		createUser.setWebsite(website);

		Address address = new Address();
		Geo geo = new Geo();
		geo.setLat(lat);
		geo.setLng(lng);
		address.setGeo(geo);

		address.setStreet(street);
		address.setSuite(suite);
		address.setCity(city);
		address.setZipcode(zipcode);
		address.setGeo(geo);
		createUser.setAddress(address);

		Company company = new Company();
		company.setName(compname);
		company.setBs(bs);
		company.setCatchPhrase(catchPhrase);
		createUser.setCompany(company);

		JSONObject jsonObject = new JSONObject(createUser);
		/*
		 * list= new ArrayList<JSONObject>(); list.add(jsonObject);
		 * System.out.println(list);
		 */
		System.out.println(jsonObject);

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType("application/json");
		requestSpecification.accept("application/json");
		requestSpecification.body(jsonObject.toString());
		Response responce = requestSpecification.post(ServiceURL.createUserURL);

		return responce;

	}

	@Test
	public void test() {
		Service service = new Service();

		
		  Response data= service.createPersonAPI(101, "teatname",
		  "testUsername", "testEmail", "tesPhone", "testWebsite", "testLat",
		  "testLong", "testStreet", "testSuite", "testCity", "testZipcode",
		  "testComename", "testBs", "testCatchPhrase");
		 
		/*Response data = service.createPersonAPI(101, "Leanne Graham", "Bret", "Sincere@april.biz",
				"1-770-736-8031 x56442", "hildegard.org", "-37.3159", "81.1496", "Kulas Light", "Apt. 556",
				"Gwenborough", "92998-3874", "Romaguera-Crona", "Multi-layered", "harness rea");*/

		System.out.println(data.asString());

		
		  Gson gson= new Gson();
		  
		  String str=data.asString();
		  
		  CreateUserResponse createUserResponse= gson.fromJson(str, CreateUserResponse.class); 
		  System.out.println(data.getStatusCode());
		  System.out.println(createUserResponse.getName());
		  System.out.println(createUserResponse.getAddress().getCity());
		 

	}

}
