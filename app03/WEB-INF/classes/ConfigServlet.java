import javax.servlet.*;
import java.io.*;
import java.util.*;

public class ConfigServlet extends GenericServlet{
	
	
	public void  service(ServletRequest req,ServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		ServletConfig config = getServletConfig();
		String lname = config.getServletName();
		
		String driverName = config.getInitParameter("driverClass");
		String driverUrl =config.getInitParameter("url");
		String userName = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		
		Enumeration e = config.getInitParameterNames();
		String paramNames = "";
		while(e.hasMoreElements()){
			paramNames = paramNames+e.nextElement()+"<br>";
		}
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println("Logical Name :"+lname+"<br>");
		out.println("Driver Name :"+driverName+"<br>");
		out.println("Driver URL :"+driverUrl+"<br>");
		out.println("User Name :"+userName+"<br>");
		out.println("Password :"+password+"<br>");
		out.println("Initialization parameters Names <br>");
		out.println(paramNames);
		out.println("</h2></body></html>");
		
	
		
	}

	

}