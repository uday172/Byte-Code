package JDBC;
import java.sql.*;
public class JdbcConnection
{
	public static void getConnection() throws SQLException {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","7893307440");
			System.out.println("Connection Created "+con);
			
		}
		catch(ClassNotFoundException ie) {
			ie.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws SQLException{
			getConnection();
	}

}
