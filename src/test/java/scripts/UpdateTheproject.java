package scripts;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import genericLib.ProjectPojo;
import io.restassured.http.ContentType;

public class UpdateTheproject {
	@Test
	public void update() {
		ProjectPojo p=new ProjectPojo("LatestWeekendAPI134","Dev","ongoing");
		given()
		.contentType(ContentType.JSON)
		.body(p)
		.when()
		.pathParam("projectId","TY_PROJ_1406")
		.put("http://localhost:8084/projects/{projectId}")
		.then().assertThat().statusCode(200).log().all();
		
	}

}
