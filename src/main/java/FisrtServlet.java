
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FisrtServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FisrtServlet() {
        super();
    }
    
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
    	PrintWriter pw = res.getWriter();
    	pw.println("This is Uday and This is my first Dynamic web page");
    }
	
}
