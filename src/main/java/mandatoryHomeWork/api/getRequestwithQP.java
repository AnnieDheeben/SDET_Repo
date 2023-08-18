package mandatoryHomeWork.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getRequestwithQP {
	
	@Test
	public void sendGetRquestWithQ() {
		RestAssured.baseURI = "https://dev90367.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "d-J+lC2Hk7Aj");
		
		Response response = RestAssured.given()
							.queryParam("category", "software").get();
		response.prettyPrint();
		System.out.println("Status Code: " +response.statusCode());
		
							
							
	}

}
