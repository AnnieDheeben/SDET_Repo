package mandatoryHomeWork.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class simpleGetRequest {
	@Test
	public void sendGetRequest() {
		RestAssured.baseURI = "https://dev90367.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "d-J+lC2Hk7Aj");
		Response response = RestAssured.get();
		System.out.println("Status code: " +response.statusCode());
		response.prettyPrint();
	}

}
