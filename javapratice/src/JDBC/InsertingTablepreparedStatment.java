package JDBC;
import java.sql.*;
import java.util.Scanner;
class DatabaseOperations{
	static Connection con = null;
	static {
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
	public void insertData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of records to be added to the database : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter id :");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name :");
			String name = sc.nextLine();
			System.out.println("Enter age :");
			int age = sc.nextInt();
			String query = "insert into student values"+"(?,?,?)";
			try {
				PreparedStatement pst = con.prepareStatement(query);
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setInt(3, age);
				int k = pst.executeUpdate();
				System.out.println(k+" no of rows inserted");
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		sc.close();
	}
}

public class InsertingTablepreparedStatment {
	public static void main(String[] args) {
		DatabaseOperations obj = new DatabaseOperations();
		obj.insertData();
	}

}
