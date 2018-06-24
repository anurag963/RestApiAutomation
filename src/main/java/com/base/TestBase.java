package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.response.Response;
import rest.service.Service;

public class TestBase {

	public Properties prop;
	public Service service;
	public Response response;
	
	public TestBase(){
		
		 service = new Service();
		
		try{
			prop= new Properties();
			FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/config/config.properties");
			prop.load(fis);
		}catch(FileNotFoundException e1){
			e1.printStackTrace();
		}catch(IOException e2){
			e2.printStackTrace();
		}
		
		
	}
	
	
}
