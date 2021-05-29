package genericLib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtilies {
	
	public static Connection connection;
	
	public static Connection connectTodatabase() throws SQLException {
		//load the db
		Driver driver =new Driver();
		DriverManager.registerDriver(driver);
		//connect to db
		return connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
		
		
	}
	
	public static String queryexecute(String query,int col,String expdata) throws SQLException {
		String actualdata="";
		//create statement
		Statement statement = connection.createStatement();
		//query execution and process result
		ResultSet result = statement.executeQuery(query);
		while(result.next()) {
			if(result.getString(col).equals(expdata)) {
				actualdata=result.getString(col);
				break;
			}
		}
		return actualdata;
		
	}
	
	
public static void closedbconnection() throws SQLException {
	connection.close();
}
}
