package assignment5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC1 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection con;
		Class.forName("com.mysql.jdbc.Driver");
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","pass@word1");
			System.out.println("Connection successfull");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Connection Successfully done");
	}

}
