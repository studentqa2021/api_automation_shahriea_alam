package com.Api;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

class ApiTesting{

public void Postfuntion() {
	


RequestSpecification rs =RestAssured.given();//step 1

// write JSON data inside the body
JsonObject jsObject = new JsonObject();//step 2
jsObject.addProperty("id", 999);
jsObject.addProperty("employee_name", "Sarower");
jsObject.addProperty("employee_salary", 5000);
jsObject.addProperty("employee_age", 40);
jsObject.addProperty("profile_image", "");

rs.body(jsObject.toString());//***
rs.headers("Content-Type","application/json");

Response response	= rs.post("http://dummy.restapiexample.com/api/v1/create");
response.prettyPrint();
}
}



