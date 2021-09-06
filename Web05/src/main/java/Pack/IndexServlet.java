package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/") // root 경로만 작성하면, index.html 따로 작성없이 서블릿 프로그램으로만 사용할때 쓴다.
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IndexServlet() {
        super();
        System.out.println("생성자 콜");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// "데이터 베이스 접속"이 필요하기 때문에 --> index.html에는 데이터 베이스 접속을 할 수 없다.
		// 정보를 로딩한다.
		System.out.println("doGet");
//		response.setContentType("text/html; charset=UTF-8"); // 한글 설정
//		PrintWriter out =  response.getWriter(); // 응답 객체 사용
//		out.println("<html>"); // 시작 테그
//			out.println("<head>");
//			out.println("</head>");
//			
//			out.println("<body>");
//				out.println("<h1> 호랑이300 </h1>");
//			out.println("</body>");
//		out.println("</html>"); // 끝 테그
//		out.close(); // 닫아주는게 정석 코드
		ServletContext context = getServletContext();
		// index.html을 작성하면, 위에 root 경로를 작성해주었기에 무한 루핑에 빠짐
		RequestDispatcher dispatcher = context.getRequestDispatcher("/test.jsp"); // 새로 열려고 하는 페이지를 적어줌
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
