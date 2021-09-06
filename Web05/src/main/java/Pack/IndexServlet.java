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

@WebServlet("/") // root ��θ� �ۼ��ϸ�, index.html ���� �ۼ����� ���� ���α׷����θ� ����Ҷ� ����.
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IndexServlet() {
        super();
        System.out.println("������ ��");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// "������ ���̽� ����"�� �ʿ��ϱ� ������ --> index.html���� ������ ���̽� ������ �� �� ����.
		// ������ �ε��Ѵ�.
		System.out.println("doGet");
//		response.setContentType("text/html; charset=UTF-8"); // �ѱ� ����
//		PrintWriter out =  response.getWriter(); // ���� ��ü ���
//		out.println("<html>"); // ���� �ױ�
//			out.println("<head>");
//			out.println("</head>");
//			
//			out.println("<body>");
//				out.println("<h1> ȣ����300 </h1>");
//			out.println("</body>");
//		out.println("</html>"); // �� �ױ�
//		out.close(); // �ݾ��ִ°� ���� �ڵ�
		ServletContext context = getServletContext();
		// index.html�� �ۼ��ϸ�, ���� root ��θ� �ۼ����־��⿡ ���� ���ο� ����
		RequestDispatcher dispatcher = context.getRequestDispatcher("/test.jsp"); // ���� ������ �ϴ� �������� ������
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
