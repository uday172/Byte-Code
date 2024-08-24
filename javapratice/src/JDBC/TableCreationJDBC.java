package JDBC;

import java.sql.*;

public class TableCreationJDBC {
	
	static Connection con = null;

	public static void getConnection() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","7893307440");
			System.out.println("Connected to the oracle successfully");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void createTable() throws SQLException{
		getConnection();
		if(con!=null) {
			Statement st = con.createStatement();
			String query = "create table student(id number,name varchar2(50),age number)";
			st.execute(query);
			System.out.println("table created successfully");
		}
	}
	
	public static void main(String[] args) throws SQLException{
		createTable();
	}

}
