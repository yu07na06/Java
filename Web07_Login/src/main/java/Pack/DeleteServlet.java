package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteServlet() {
        super();
        System.out.println("������ ��");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Delete doGet");
		response.setContentType("text/html; charset=UTF-8"); // �ѱ� ����
		
		String id = request.getParameter("id");
		System.out.println(id); // �̰� �ٽ� --> Ȯ���� ���� �ϵ���
		PrintWriter out = response.getWriter();
		out.println("<html>");
			out.println("<body>");
				out.println( "<h1>"+id + "������!</h1>.<br/>");
			out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Delete doPost");
	}
}