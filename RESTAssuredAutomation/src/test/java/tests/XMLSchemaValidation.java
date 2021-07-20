package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.matcher.RestAssuredMatchers.matchesXsdInClasspath;

public class XMLSchemaValidation
{
	@Test
	public void schemaValidation() throws IOException
	{
		baseURI="http://www.dneonline.com";
		File file=new File("./SOAPRequest/Add.xml");
		FileInputStream fileis=new FileInputStream(file);
		String requestBody=IOUtils.toString(fileis,"UTF-8");
		given()
		.contentType("text/xml")
		.accept(ContentType.XML)
		.body(requestBody)
		.when()
		.post("/calculator.asmx")
		.then()
		.statusCode(200)
		.log().all()
		.and()
		.body("//*:AddResult.text()", equalTo("5"))
		.and()
		.assertThat().body(matchesXsdInClasspath("Calculator.xsd"));
	}
	
}
