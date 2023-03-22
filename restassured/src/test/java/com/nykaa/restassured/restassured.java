package com.nykaa.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class restassured {

	public static void listuser() {
     
		RestAssured.baseURI ="https://reqres.in/";
		Response response = RestAssured.given().when().get("api/users?page=2").then().log().all().extract().response();
		
		int statusCode = response.getStatusCode();
		
		System.out.println("the statuscode is"+ statusCode);
		 String s = response.asPrettyString();
		 System.out.println("the pretty response is"+ s);
		 
	}
	
	public static void singleuser() {

		RestAssured.baseURI ="https://reqres.in/";
		Response response = RestAssured.given().when().get("/api/users/2").then().log().all().extract().response();
		
		int statusCode = response.getStatusCode();
		
		System.out.println("the statuscode is"+ statusCode);
		 String s = response.asPrettyString();
		 System.out.println("the pretty response is"+ s);
		 
	}
	
	public static void singleusernotfound() {

		RestAssured.baseURI ="https://reqres.in/";
		Response response = RestAssured.given().when().get("/api/users/23").then().log().all().extract().response();
		
		int statusCode = response.getStatusCode();
		System.out.println("the statuscode is"+ statusCode);
		
		String s = response.asPrettyString();
	
		System.out.println("the pretty response is"+ s);
		
	}
	
	public static void listofresources() {

		RestAssured.baseURI ="https://reqres.in/";
		Response response = RestAssured.given().when().get("/api/unknown").then().log().all().extract().response();
		
		int statusCode = response.getStatusCode();
		System.out.println("the statuscode is"+ statusCode);
		
		String s = response.asPrettyString();
	
		System.out.println("the pretty response is"+ s);
		
	}
	
	public static void singleuserresources() {

		RestAssured.baseURI ="https://reqres.in/";
		Response response = RestAssured.given().when().get("/api/unknown/2").then().log().all().extract().response();
		
		int statusCode = response.getStatusCode();
		System.out.println("the statuscode is"+ statusCode);
		
		String s = response.asPrettyString();
	
		System.out.println("the pretty response is"+ s);
		
	}
	
	public static void singleuserresoucenotfound() {

		RestAssured.baseURI ="https://reqres.in/";
		Response response = RestAssured.given().when().get("/api/unknown/23").then().log().all().extract().response();
		
		int statusCode = response.getStatusCode();
		System.out.println("the statuscode is"+ statusCode);
		
		String s = response.asPrettyString();
	
		System.out.println("the pretty response is"+ s);
		
	}
	
	public static void create() {

		RestAssured.baseURI ="https://reqres.in/";
		Response response = RestAssured.given().body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}\r\n"
				+ "").post("/api/users").then().log().all().extract().response();
		
		int statusCode = response.getStatusCode();
		System.out.println("the statuscode is"+ statusCode);
		
		String s = response.asPrettyString();
	
		System.out.println("the pretty response is"+ s);
		
	}
	
	public static void update() {

		RestAssured.baseURI ="https://reqres.in/";
		Response response = RestAssured.given().body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}").put("/api/users/2").then().log().all().extract().response();
		
		int statusCode = response.getStatusCode();
		System.out.println("the statuscode is"+ statusCode);
		
		String s = response.asPrettyString();
	
		System.out.println("the pretty response is"+ s);
		
	}
	
	public static void update1() {

		RestAssured.baseURI ="https://reqres.in/";
		Response response = RestAssured.given().body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}\r\n"
				+ "").patch("/api/users/2").then().log().all().extract().response();
		
		int statusCode = response.getStatusCode();
		System.out.println("the statuscode is"+ statusCode);
		
		String s = response.asPrettyString();
	
		System.out.println("the pretty response is"+ s);
		
	}
	
	public static void delete() {

		RestAssured.baseURI ="https://reqres.in/";
		Response response = RestAssured.given().when().delete("/api/users/2").then().log().all().extract().response();
		
		int statusCode = response.getStatusCode();
		System.out.println("the statuscode is"+ statusCode);
		
		String s = response.asPrettyString();
	
		System.out.println("the pretty response is"+ s);
		
	}
	
	public static void registersuccesfully() {

		RestAssured.baseURI ="https://reqres.in/";
		Response response = RestAssured.given().body("{\r\n"
				+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
				+ "    \"password\": \"pistol\"\r\n"
				+ "}\r\n"
				+ "").post("/api/register").then().log().all().extract().response();
		
		int statusCode = response.getStatusCode();
		System.out.println("the statuscode is"+ statusCode);
		
		String s = response.asPrettyString();
	
		System.out.println("the pretty response is"+ s);
		
	}
	
	public static void registerunsuccessfully() {

		RestAssured.baseURI ="https://reqres.in/";
		Response response = RestAssured.given().body("{\r\n"
				+ "    \"email\": \"sydney@fife\"\r\n"
				+ "}\r\n"
				+ "").post("/api/register").then().log().all().extract().response();
		
		int statusCode = response.getStatusCode();
		System.out.println("the statuscode is"+ statusCode);
		
		String s = response.asPrettyString();
	
		System.out.println("the pretty response is"+ s);
		
	}
	
	public static void loginsuccessful() {

		RestAssured.baseURI ="https://reqres.in/";
		Response response = RestAssured.given().body("{\r\n"
				+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
				+ "    \"password\": \"cityslicka\"\r\n"
				+ "}\r\n"
				+ "").post("/api/login").then().log().all().extract().response();
		
		int statusCode = response.getStatusCode();
		System.out.println("the statuscode is"+ statusCode);
		
		String s = response.asPrettyString();
	
		System.out.println("the pretty response is"+ s);
		
	}
	
	public static void loginunsuccessfull() {

		RestAssured.baseURI ="https://reqres.in/";
		Response response = RestAssured.given().body("{\r\n"
				+ "    \"email\": \"peter@klaven\"\r\n"
				+ "}\r\n"
				+ "").post("/api/login").then().log().all().extract().response();
		
		int statusCode = response.getStatusCode();
		System.out.println("the statuscode is"+ statusCode);
		
		String s = response.asPrettyString();
	
		System.out.println("the pretty response is"+ s);
		
	}
	
	public static void delayedresponses() {

		RestAssured.baseURI ="https://reqres.in/";
		Response response = RestAssured.given().when().get("/api/users?delay=3").then().log().all().extract().response();
		
		int statusCode = response.getStatusCode();
		System.out.println("the statuscode is"+ statusCode);
		
		String s = response.asPrettyString();
	
		System.out.println("the pretty response is"+ s);
		
	}
	public static void main(String[] args) {

		restassured rs = new restassured();
		listuser();
		singleuser();
		singleusernotfound();
		listofresources();
		singleuserresources();
		singleuserresoucenotfound();
		create();
		update();
		update1();
		delete();
		registersuccesfully();
		registerunsuccessfully();
		loginsuccessful();
		loginunsuccessfull();
		delayedresponses();
		
		
		
	}

}
