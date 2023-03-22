package com.api.baseclass;

import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HTTPSMethods {

	public static Response doGetCall(Map<String, String> headers, String endpoints) {

		Response response = RestAssured.given().headers(headers).when().get(endpoints).then().log().all().extract()
				.response();

		return response;
	}

	public static Response doPostCallWithBody(Map<String, String> headers, String payload, String endpoints) {

		Response response = RestAssured.given().headers(headers).body(payload).when().post(endpoints).then().log().all()
				.extract().response();

		return response;
	}

	public static Response doPostCallWithOutBody(Map<String, String> headers, String endpoints) {

		Response response = RestAssured.given().headers(headers).when().post(endpoints).then().log().all().extract()
				.response();

		return response;
	}
	
	private Response doPutCallWithoutBody(Map<String, String> headers, String endpoints) {
    Response response = RestAssured.given().headers(headers).when().put(endpoints).
		then().log().all().extract().response();

      return response;  
		
	}
	
	public static Response doPutCallWithBody(Map<String, String> headers, String payload, String endpoints) {

		Response response = RestAssured.given().headers(headers).body(payload).when().put(endpoints).then().log().all()
				.extract().response();

		return response;
	
	//put patch delete 
	
	
	}
	
	public static Response doPatchCallWithBody(Map<String, String> headers, String payload, String endpoints) {

		Response response = RestAssured.given().headers(headers).body(payload).when().patch(endpoints).then().log().all()
				.extract().response();

		return response;
	
	}	
	private Response doPatchCallWithoutBody(Map<String, String> headers, String endpoints) {
	    Response response = RestAssured.given().headers(headers).when().patch(endpoints).
			then().log().all().extract().response();

	      return response; 
}
	public static Response doDeleteCall(Map<String, String> headers, String endpoints) {

		Response response = RestAssured.given().headers(headers).when().delete(endpoints).then().log().all().extract()
				.response();

		return response;
}	
}	
	
	

