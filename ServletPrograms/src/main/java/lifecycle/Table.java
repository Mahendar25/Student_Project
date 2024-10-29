package lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Table
 */
@WebServlet("/table")
public class Table extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Table() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=pink text=brown>");
		pw.println("<center><table border=10>");
		for(int i=1;i<=10;i++)
		{
			pw.println("<tr><td>10</td>");
			pw.print("<td> x </td>");
			pw.print("<td>"+i+"</td>");
			pw.print("<td> = </td>");
			pw.print("<td>"+10*i+"</td></tr>");
			
		}
		pw.println("</table></body></html>");
		
	}

}
