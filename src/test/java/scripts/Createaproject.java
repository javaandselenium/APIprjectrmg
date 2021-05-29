package scripts;
import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import org.testng.annotations.Test;
import org.testng.mustache.BaseChunk;

import genericLib.BaseClass;
import genericLib.DataBaseUtilies;
import genericLib.ProjectPojo;
import io.restassured.http.ContentType;
import junit.framework.Assert;

public class Createaproject extends BaseClass{
	@Test
	public void createaproject() throws SQLException {
		String projectName="LatestWeekendAPI1";
		ProjectPojo p=new ProjectPojo("LatestWeekendAPI1","Ram","Completed");
		
		given()
		.contentType(ContentType.JSON)
		.body(p)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(201)
		.and()
		.log().all();
		
		String dbvalue = DataBaseUtilies.queryexecute("select * from project;",4,projectName);
		Assert.assertEquals(projectName,dbvalue);
	}

}
