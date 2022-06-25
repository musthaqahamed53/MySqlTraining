package dbOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLnew {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/learning");
		
		Statement statement = connection.createStatement();
		
		ResultSet result= statement.executeQuery("select FIRST_NAME, LAST_NAME, START_DATE ,TITLE FROM employee where TITLE='Teller' AND SUPERIOR_EMP_ID=10");
		
		while(result.next()) {
			System.out.println(result.getString("TITLE"));
		}
		
		/*
		 * while(result.next()) { System.out.println("First name " +result.getString(1)
		 * +" \nlastname " +result.getString(2) +" \nstartdate " +result.getString(3)
		 * +" \ntitle " +result.getString(4)); }
		 */
		
	}

}
