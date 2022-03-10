package com.generic;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Operation {
	public static  void getTest() {
	Response response = RestAssured.get("https://httpbin.org/get");
	response.prettyPrint();
	//System.out.println(response.StatusCode());
	
	Assert.assertEquals(response.statusCode(), 200);

}
}