package Pack01;

import java.util.LinkedList;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Lion {
	@RequestMapping("/t8")
	public String method01(
			Model model,
			HttpServletRequest request
			) {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println("�Լ�"+name+age);
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "LionView";
	}
	@RequestMapping("/t9")
	public ModelAndView method02() {
		ModelAndView mv = new ModelAndView("LionView"); // �� ����Ʈ�� �����ش�.
		mv.addObject("name", "�����");
		mv.addObject("age", 19);
		return mv; // �ƿ� �Ѱ��������.
	}
	@RequestMapping("/t10")
	public ModelAndView method03() {
		ModelAndView mv = new ModelAndView(3>2?"TigerView":"LionView");
		mv.addObject("name", "�����");
		mv.addObject("age", 19);
		return mv; // �ƿ� �Ѱ��������.
	}
	@RequestMapping("/t12")
	public String method04(Model model, Person p) {
		model.addAttribute("ppp", p);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		LinkedList<String> s = new LinkedList<String>();
		s.add("�޹���");
		s.add("�ʱ���");
		model.addAttribute("mmm", s);
		
		return "LionView"; // �ƿ� �Ѱ��������.
	}

}
