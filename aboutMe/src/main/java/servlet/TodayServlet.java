package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TodayServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>time</title></head>");
		out.println("<body>");
		
		out.println("<a href='index.html'> 메인화면 </a>");
		
		String time=LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm"));
		out.println("<h1 class='timenow'> 현재시간 : "+time+"</h1>");	
		
		out.println("</body>");
		out.println("</html>");
	}

}
