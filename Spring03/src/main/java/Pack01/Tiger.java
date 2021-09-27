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
		System.out.println("함수 콜1");
		return null;
	}
	@ResponseBody
	@RequestMapping("/t2")
	public String method03() {
		System.out.println("함수 콜2");
		return "TigerCall"; // 내가 갈 JSP 파일명을 적어주면 끝이다.
	}
	@RequestMapping("/t3")
	public String method02() {
		System.out.println("함수 콜3");
		return "TigerView"; // 내가 갈 JSP 파일명을 적어주면 끝이다.
		// 작명할때, Tiger 클래드면, TigerView라고 적는게 일반적이다.
		// .jsp를 적지 않는다. 왜냐하면, 무조건 .jsp를 찾기 때문이다.
	}
	@RequestMapping("/t4")
	public String method04(
			@RequestParam(value="name") String name
			) {
		System.out.println("함수 콜4"+name);
		return "TigerView";
	}
	@RequestMapping("/t5")
	public String method05(
			@RequestParam(value="name") String name,
			@RequestParam(value="age") int age			
			) {
		System.out.println("함수 콜5"+name+age);
		return "TigerView";
	}
	@RequestMapping("/t6")
	public String method06(
			HttpServletRequest request
			) {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println("함수 콜6"+name+age);
		return "TigerView";
	}
	@RequestMapping("/t7")
	public String method07(Model model) {
		model.addAttribute("name", "앵무새"); // name으로 앵무새 받아주세요
		model.addAttribute("age", 100); // name으로 앵무새 받아주세요
		System.out.println("함수 콜7");
		return "TigerView"; // 모델이 같이 넘어간다.
	}
}
