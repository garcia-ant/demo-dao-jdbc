package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {

	private static Connection conn = null;

	public static Connection getConnection() {
		if (conn == null) {
			try {

				Properties props = loadProoerties();
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url, props);

			} catch (SQLException e) {

				throw new DbException(e.getMessage());
			}

		}
		return conn;
	}

	public static void ClosseConncetion() {
		try {
			if (conn != null) {
				conn.close();

			}
		} catch (SQLException e) {

			throw new DbException(e.getMessage());
		}
	}

	private static Properties loadProoerties() {

		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties pros = new Properties();
			pros.load(fs);

			return pros;

		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}

	}

	public static void ClosseStatement(Statement st) {
		if (st != null)
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
	}

	public static void ClosseResultSet(ResultSet rs) {
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
	}
}
