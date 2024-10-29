package mime;

import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class ImageExample
 */
@WebServlet("/img")
public class ImageExample extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public ImageExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		FileInputStream fil=new FileInputStream("d:/bmw.jpg");//read data from file 
		int n=fil.available();// to get the size of given file
		byte[] b=new byte[n];
		fil.read(b);
		ServletOutputStream sp=response.getOutputStream();// server to browser byte output stream 
		sp.write(b);
	}

}
