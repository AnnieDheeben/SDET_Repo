package mandatoryHomeWork.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class simplePutRequest {
	
	@Test
	public void sendPutRequest() {
		
		RestAssured.baseURI = "https://dev90367.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "d-J+lC2Hk7Aj");
		
		Response response = RestAssured.given()
							.contentType(ContentType.JSON)
							.accept(ContentType.JSON)
							.queryParam("sysparm_fields" ,"category,description,sys_id,number,short_description")
							.body("{\"short_description\":\"updated through Put Request\",\"category\":\"software\"}")
							.when()
							.put("6330be892fe8b11081e256f62799b6fb");
		
		System.out.println("Status code: " +response.statusCode());
		response.prettyPrint();
		
	}

}

