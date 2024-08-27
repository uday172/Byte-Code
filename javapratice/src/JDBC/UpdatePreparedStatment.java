package JDBC;
import java.sql.*;
public class UpdatePreparedStatment {
	static Connection con = null;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","7893307440");
			System.out.println(con);
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void updateData() throws SQLException{
		String query = "update student set age = ? where id = ?";
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, 84);
		st.setInt(2, 2);
		int i = st.executeUpdate();
		System.out.println(i+" rows updated");
	}
	public static void main(String[] args) throws SQLException{
		updateData();
	}

}