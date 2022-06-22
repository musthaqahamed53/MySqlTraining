package dbOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLconnectionExamples {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		//1.MENTION THE TYPE OF db TO BE USED -> mySQL
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2.create connection withDB by giving the DB details
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/selenium_learning");
		
		//3.create a statement
		Statement statement = connection.createStatement();
		
		//4.execute the query 
		//5.store the result in result set
		ResultSet result= statement.executeQuery("SELECT * FROM learn_table");
		
		//6. get the results from result set
		while(result.next()) {
			System.out.println("Name " +result.getString(1)+" Nickname " +result.getString(2));
		}
		
	}

}
