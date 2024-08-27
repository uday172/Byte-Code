package JDBC;
import java.sql.*;

public class DeletePreparedStatement {
	static Connection con = null;
	static {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","7893307440");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteData() throws SQLException{
		String query = "delete from student where id = ?";
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, 6);
		int i = st.executeUpdate();
		System.out.println(i+" rows deleted");
	}
	
	public static void main(String[] args) throws SQLException{
		deleteData();
	}

}
