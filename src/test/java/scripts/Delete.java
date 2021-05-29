package scripts;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class Delete {
@Test
public void deletepro() {
	when()
	.delete("http://localhost:8084/projects/TY_PROJ_1406")
	.then()
	.log().all();
}
}
