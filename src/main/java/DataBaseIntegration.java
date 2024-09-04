
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/DataBaseIntegration")
public class DataBaseIntegration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DataBaseIntegration() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		Connection con = null;
		PrintWriter out = res.getWriter();
		ServletConfig config = getServletConfig();
		String value = config.getInitParameter("username");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",value,"7893307440");
			out.println("connected successfully to the database");
			
			String query1 = "insert into student values (?,?,?)";
			PreparedStatement pst = con.prepareStatement(query1);
			int id = Integer.parseInt(req.getParameter("id"));
			pst.setInt(1,id );
			String name = req.getParameter("name");
			pst.setString(2, name);
			int age = Integer.parseInt(req.getParameter("age"));
			pst.setInt(3, age);
			pst.executeUpdate();
			
			Statement st = con.createStatement();
			String query = "select * from student";
			ResultSet rs = st.executeQuery(query);
			out.println("Id "+"Name "+"Age");
			while(rs.next()) {
				out.print(rs.getInt(1)+" ");
				out.print(rs.getString(2)+" ");
				out.println(rs.getInt(3));
			}
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
