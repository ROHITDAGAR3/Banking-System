package Data;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;

	public Dao(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}

	public void setConnection() {

		Class.forName("com.mysql.cj.jdbc.Driver");
		jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		System.out.println("Success");

	}

	public static void main(String[] args) {
		Dao dao = new Dao("jdbc:mysql://localhost:3306/basic_crud_db", "root", "kamal");
		dao.setConnection();
	}
}
