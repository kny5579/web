package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/info")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InfoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>info</title></head>");
		out.println("<body>");

		String uri = request.getRequestURI();
		StringBuffer url = request.getRequestURL();
		String contentPath = request.getContextPath();
		String remoteAddr = request.getRemoteAddr();
		
		
		out.println("uri : " + uri + "<br>"); //url에서 포트번호를 제외한 정보 =>/boostcamp/info
		out.println("url : " + url + "<br>"); // =>http://localhost:8080/boostcamp/info
		out.println("contentPath : " + contentPath + "<br>"); // =>/boostcamp
		out.println("remoteAddr : " + remoteAddr + "<br>"); // ip주소 =>0:0:0:0:0:0:0:1
		
		out.println("</body>");
		out.println("</html>");
	}


}