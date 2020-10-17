import javax.servlet.*;
import java.io.*;
public class FirstServlet extends GenericServlet{
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		res.setContentType("html/text");
		PrintWriter out = res.getWriter();
		ServletConfig config = getServletConfig();
		ServletContext context = getServletContext();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println("a-->"+context.getInitParameter("a")+"<br>");
		out.println("b-->"+config.getInitParameter("b")+"<br>");
		out.println("c-->"+config.getInitParameter("c")+"<br>");
		out.println("d-->"+config.getInitParameter("d")+"<br>");
		out.println("e-->"+config.getInitParameter("e")+"<br>");
		out.println("f-->"+config.getInitParameter("f")+"<br>");
		out.println("<h2><body><html>");

	} 
} 

