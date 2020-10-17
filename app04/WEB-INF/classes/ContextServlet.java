import javax.servlet.*;
import java.io.*;
import java.util.*;
public class ContextServlet extends GenericServlet{
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		ServletContext context = getServletContext();
		String lname = context.getServletContextName();

		String driverName = context.getInitParameter("driverClass");
		String url = context.getInitParameter("url");
		String username = context.getInitParameter("username");
		String password = context.getInitParameter("password");

		String paramNames = "";
		Enumeration e = context.getInitParameterNames();
		while(e.hasMoreElements()){
			paramNames = paramNames + e.nextElement()+"<br>";
		}

		context.setAttribute("cid","C-111");
		context.setAttribute("cname","aryan");
		context.setAttribute("ccostr",10000);

		String cid = (String) context.getAttribute("cid");
		String cname = (String) context.getAttribute("cname");
		int ccostr = (Integer) context.getAttribute("ccostr");

		e = context.getAttributeNames();
		String attrName = "";
		while(e.hasMoreElements()){
			attrName = attrName+e.nextElement()+"<br>";
		}

		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println("Logical Name : "+lname+"<br>");
		out.println("Driver Name : "+driverName+"<br>");
		out.println("Driver URL : "+url+"<br>");
		out.println("User Name : "+username+"<br>");
		out.println("Password : "+password+"<br>");
		out.println("Parameters Names : ");
		out.println(paramNames);
		out.println("Course Id : "+cid+"<br>");
		out.println("Customer Name : "+cname+"<br>");
		out.println("Course Cost : "+ccostr+"<br>");
		out.println(attrName);

	}
}  
