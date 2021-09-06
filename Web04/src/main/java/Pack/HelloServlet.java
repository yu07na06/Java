package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 복붙용 사용할때, 주의할 것
// 1. @WebServlet("/HelloServlet") 수정
// 2. class 이름 변경
// 3. 생성자 이름 변경
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloServlet() {
        super();
        System.out.println("생성자 콜");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		response.setContentType("text/html; charset=UTF-8"); // 한글 설정
		PrintWriter out =  response.getWriter(); // 응답 객체 사용
		out.println(
			"<html>"+
					"<body>"+
						"<h1> 호랑이200 </h1>"+
					"</body>"+
			"</html>"
		);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
