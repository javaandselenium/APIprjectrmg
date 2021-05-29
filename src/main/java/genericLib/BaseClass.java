package genericLib;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	@BeforeSuite
	public void setup() throws SQLException {
		DataBaseUtilies.connectTodatabase();
	}
	
	
	@AfterSuite
	public void tearDown() throws SQLException {
		DataBaseUtilies.closedbconnection();
	}

}
