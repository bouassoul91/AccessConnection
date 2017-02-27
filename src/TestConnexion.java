import java.sql.*;

public class TestConnexion {

	public static void main(String[] args) {
		try {

			Connection con = DriverManager
					.getConnection("jdbc:ucanaccess://C:\\Users\\bouassoul\\DataBases\\dataBase.accdb");
			
			System.out.println("Connection Succesfull");
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e);

		}

	}

}
