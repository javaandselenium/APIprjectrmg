package scripts;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
public class GetaProject {
	@Test
	public void getdetails() {
		given()
		.pathParam("projectId","TY_PROJ_204")
		.when()
		.get("http://localhost:8084/projects/{projectId}")
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
		
	}

}
