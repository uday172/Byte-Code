
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns={"/ServletContextEx","/servletcontext"},initParams= {
		@WebInitParam(name = "name1", value = "Vinay Reddy"),
		@WebInitParam(name = "phno", value = "1234567890")
})
public class ServletContextEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletContextEx() {
        super();
    }

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ServletContext con = req.getServletContext();
		PrintWriter out = res.getWriter();
		out.println("User Name is "+con.getInitParameter("username"));
		out.println("Password is "+con.getInitParameter("password"));
		
		out.println("This is from @WebInitParam annotation for ServletConfig");
		out.println("name : "+getServletConfig().getInitParameter("name1"));
		out.println("phno : "+getServletConfig().getInitParameter("phno"));
	}

}
