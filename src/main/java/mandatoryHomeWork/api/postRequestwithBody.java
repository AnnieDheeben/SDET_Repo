package mandatoryHomeWork.api;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class postRequestwithBody {
	@Test
	public void sendPostRequestWithBody() {
		RestAssured.baseURI = "https://dev90367.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "d-J+lC2Hk7Aj");
		//File jsonInputFile = new File("./src/main/resources/CreateIncident.JSON");
		Response postResponse = RestAssured.given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.queryParam("sysparm_fields" ,"category,description,sys_id,number,short_description")
				.body("{\"description\":\"my system is down\","
						+ "\"short_description\":\"testing blocked\",\""
						+ "category\":\"software\"}")
				.when()
				.post();
		
		postResponse.prettyPrint();
		System.out.println("Status Code: " +postResponse.statusCode());
		
		String sys_id = postResponse.jsonPath().get("result.sys_id");
		System.out.println("sys_id:" +sys_id);
	}


}
