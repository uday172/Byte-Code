package JDBC;

import java.sql.*;

public class DataRetrivalJDBC {
	static Connection con = null;
	
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","7893307440");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void getData() throws SQLException {
		String query = "select * from student";
		PreparedStatement st = con.prepareStatement(query);
		ResultSet rt = st.executeQuery();
		while(rt.next()) {
			System.out.println(rt.getInt(1)+" "+rt.getString(2)+" "+rt.getInt(3));
			System.out.println("--------------------------------------------");
		}
	}
	
	public static void main(String[] args) throws SQLException{
		getData();
	}

}
