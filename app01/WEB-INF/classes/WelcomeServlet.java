import javax.servlet.*;
import java.io.*;

public class WelcomeServlet implements Servlet{
	
	public void init(ServletConfig config) throws ServletException{
		
	}
	public void  service(ServletRequest req,ServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println("<font color = 'red'>");
		out.println("Welcome Aryan");
		out.println("</font></h2></body></html>");
	}

	public ServletConfig getServletConfig(){
		return null;
	}
	public String getServletInfo(){
		return "";
	} 

	public void destroy(){
	}

}