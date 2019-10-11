package assignment5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","pass@word1");
		System.out.println("Connection successfull");
		System.out.println("Connection Successfully done");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Customer");
		if(rs.next())
			System.out.println("We have data in customer table"+rs.getInt("CustomerID"));
	}

}
