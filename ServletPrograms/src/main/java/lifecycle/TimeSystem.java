package lifecycle;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class TimeSystem
 */
@WebServlet("/system")
public class TimeSystem extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public TimeSystem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		LocalTime lt=LocalTime.now();
		
		//Date d=new Date();
		PrintWriter pw=response.getWriter();
		pw.println(lt);
		//pw.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
	}

}
