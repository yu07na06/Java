package Pack01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Tiger {
	@RequestMapping("/t1")
	public String method01() {
		System.out.println("�Լ� ��1");
		return null;
	}
	@ResponseBody
	@RequestMapping("/t2")
	public String method03() {
		System.out.println("�Լ� ��2");
		return "TigerCall"; // ���� �� JSP ���ϸ��� �����ָ� ���̴�.
	}
	@RequestMapping("/t3")
	public String method02() {
		System.out.println("�Լ� ��3");
		return "TigerView"; // ���� �� JSP ���ϸ��� �����ָ� ���̴�.
		// �۸��Ҷ�, Tiger Ŭ�����, TigerView��� ���°� �Ϲ����̴�.
		// .jsp�� ���� �ʴ´�. �ֳ��ϸ�, ������ .jsp�� ã�� �����̴�.
	}
	@RequestMapping("/t4")
	public String method04(
			@RequestParam(value="name") String name
			) {
		System.out.println("�Լ� ��4"+name);
		return "TigerView";
	}
	@RequestMapping("/t5")
	public String method05(
			@RequestParam(value="name") String name,
			@RequestParam(value="age") int age			
			) {
		System.out.println("�Լ� ��5"+name+age);
		return "TigerView";
	}
	@RequestMapping("/t6")
	public String method06(
			HttpServletRequest request
			) {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println("�Լ� ��6"+name+age);
		return "TigerView";
	}
	@RequestMapping("/t7")
	public String method07(Model model) {
		model.addAttribute("name", "�޹���"); // name���� �޹��� �޾��ּ���
		model.addAttribute("age", 100); // name���� �޹��� �޾��ּ���
		System.out.println("�Լ� ��7");
		return "TigerView"; // ���� ���� �Ѿ��.
	}
}
