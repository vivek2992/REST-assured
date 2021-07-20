package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class GetAndPostExamples
{
//	@Test
//	public void testGet()
//	{
//		baseURI="https://reqres.in/";
//		given()
//		.get("/api/users?page=2")
//		.then()
//		.statusCode(200)
//		.body("data[4].first_name",equalTo("George"))
//		.body("data.first_name",hasItems("Rachel","Byron"));
//	}
//	
	@Test
	public void testPost()
	{
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("name", "vivek");
//		map.put("job","engineer");
//		System.out.println(map);
		
		JSONObject request = new JSONObject();
		request.put("name", "vivek");
		request.put("job","engineer");
		System.out.println(request.toJSONString());
		
		baseURI="https://reqres.in/";
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("/api/users")
		.then()
		.statusCode(201)
		.log().all();
		
	}
	
}
