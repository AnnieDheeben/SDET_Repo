package mandatoryHomeWork.api;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class sendRequestwithMultipleQP {
	
	@Test
	public void sendRequestwithMultipleQP() {
		
		RestAssured.baseURI = "https://dev90367.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "d-J+lC2Hk7Aj");
		
		Map<String, String> allQueryParams = new HashMap<String, String>();
		allQueryParams.put("Category", "Software");
		allQueryParams.put("sysparm_fields" ,"category,description,sys_id,number");
		
		Response response = RestAssured.given()
							.queryParams(allQueryParams)
							.accept(ContentType.XML)
							.when()
							.get();
							
							
							
		response.prettyPrint();
		System.out.println("Status Code: " +response.statusCode());
		
	}

}
