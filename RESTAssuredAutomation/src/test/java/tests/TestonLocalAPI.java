package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class TestonLocalAPI
{
//	@Test
//	public void get()//get all users data
//	{
//		baseURI="http://localhost:3000";
//		given()
//		.get("/users")
//		.then()
//		.statusCode(200)
//		.log().all();
//	}
//	
//	@Test
//	public void post()//add new user
//	{
//		baseURI="http://localhost:3000";
//		
//		JSONObject b=new JSONObject();
//		b.put("firstName", "Thomas");
//		b.put("lastName", "Edison");
//		b.put("subjectId", 1);
//		
//		given()
//		.contentType(ContentType.JSON)
//		.body(b.toJSONString())
//		.when()
//		.post("/users")
//		.then()
//		.statusCode(201)
//		.log().all();
//	}
	
//	@Test
//	public void put()//update existing user
//	{
//		baseURI="http://localhost:3000";
//		
//		JSONObject b=new JSONObject();
//		b.put("firstName", "Albert");
//		b.put("lastName", "Einstein");
//		b.put("subjectId", 2);
//		
//		given()
//		.contentType(ContentType.JSON)
//		.body(b.toJSONString())
//		.when()
//		.put("/users/4")
//		.then()
//		.statusCode(200)
//		.log().all();
//	}
	
//	@Test
//	public void patch()//update existing user
//	{
//		baseURI="http://localhost:3000";
//		
//		JSONObject b=new JSONObject();
//		b.put("lastName", "Doe");
//		
//		given()
//		.contentType(ContentType.JSON)
//		.body(b.toJSONString())
//		.when()
//		.patch("/users/4")
//		.then()
//		.statusCode(200)
//		.log().all();
//	}
	
//	@Test
//	public void delete()
//	{
//		baseURI="http://localhost:3000";
//		when()
//		.delete("/users/4")
//		.then()
//		.statusCode(200)
//		.log().all();
//	}
//	
}
