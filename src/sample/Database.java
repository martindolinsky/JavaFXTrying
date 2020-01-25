package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Martin Dolinsky
 */
public class Database {
	private final String JDBC = "com.mysql.cj.jdbc.Driver";
	private final String URL = "jdbc:mysql://itsovy.sk:3306/world_x?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private Connection connection;


	public Connection getConnection() throws Exception {
		Class.forName(JDBC);
		connection = DriverManager.getConnection(URL, "student", "kosice2019");
		return connection;
	}

	public String getCapitalCity(String country) throws Exception {
		String capitalCity = "select city.name from country join city on country.Capital=city.id where country.name like ?";

		PreparedStatement statement = getConnection().prepareStatement(capitalCity);
		statement.setString(1, country);
		ResultSet rs = statement.executeQuery();
		if (rs.next()) {
			return rs.getString(1);
		}
		connection.close();
		return null;
	}

}
