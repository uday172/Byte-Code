package JDBC;
import java.sql.*;
import java.util.Scanner;
public class UpadatingTableJDBC {
	private static Connection con = null;
	public static void getConnection() {
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
	
	public static void insertSql(int id , String name , int age) {
		try {
			Statement st = con.createStatement();
			String query = "insert into student values("+id+",'"+name+"',"+age+")";
			st.executeUpdate(query);
			System.out.println("Details Entered Successfully");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id;
		System.out.print("Enter id :");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name :");
		String name = sc.nextLine();
		System.out.println("Enter age :");
		int age = sc.nextInt();
		getConnection();
		insertSql(id,name,age);
		sc.close();
	}

}
