import javax.servlet.*;
import java.io.*;

public class WelcomeServlet extends GenericServlet{
	
	
	public void  service(ServletRequest req,ServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<b>");
		out.println("<font color = 'red' size = '6'>");
		out.println("Welcome Aryan");
		out.println("<font color = 'blue' size = '5'>");
		out.println("How are you");
		out.println("</b></hr></font></body></html>");
	}

	

}