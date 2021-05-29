package scripts;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Getallproject {
@Test
public void gettheprojectdetails() {
	when()
	.get("http://localhost:8084/projects")
	.then()
	.assertThat().statusCode(200)
	.log().all();
}
	
}
