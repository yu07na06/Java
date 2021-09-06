package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloServlet() {
        super();
        System.out.println("생성자 콜");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		PrintWriter out =  response.getWriter(); // 응답 객체 사용
		out.println("<html>"); // 시작 테그
			out.println("<head>");
			out.println("</head>");
			
			out.println("<body>");
				out.println("<h1> tiger </h1>");
			out.println("</body>");
		out.println("</html>"); // 끝 테그
		out.close(); // 닫아주는게 정석 코드
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
