package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ���ٿ� ����Ҷ�, ������ ��
// 1. @WebServlet("/HelloServlet") ����
// 2. class �̸� ����
// 3. ������ �̸� ����
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloServlet() {
        super();
        System.out.println("������ ��");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		response.setContentType("text/html; charset=UTF-8"); // �ѱ� ����
		PrintWriter out =  response.getWriter(); // ���� ��ü ���
		out.println(
			"<html>"+
					"<body>"+
						"<h1> ȣ����200 </h1>"+
					"</body>"+
			"</html>"
		);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
