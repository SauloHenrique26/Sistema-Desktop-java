
package control;

import java.sql.*;


public class JdbcConnection{

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public Connection dbConnect() {
		try {
			Class.forName ("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@database-2.cylhto2dfdzd.sa-east-1.rds.amazonaws.com:1521:PAP", "admin", "adminadmin");
			return conn;
		} catch (ClassNotFoundException | SQLException e) {
			return null;
		}
	}

	public void dbDisconnect() {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {

		}
	}

}



