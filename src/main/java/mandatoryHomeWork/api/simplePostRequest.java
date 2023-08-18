package mandatoryHomeWork.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class simplePostRequest {
	@Test
	public void sendPostRequest() {
		RestAssured.baseURI = "https://dev90367.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "d-J+lC2Hk7Aj");
		
		Response postResponse = RestAssured.given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.queryParam("sysparm_fields" ,"category,description,sys_id,number")
				.when()
				.post();
		
		postResponse.prettyPrint();
		System.out.println("Status Code: " +postResponse.statusCode());
		
		String sys_id = postResponse.jsonPath().get("result.sys_id");
		System.out.println("sys_id:" +sys_id);
	}

}
