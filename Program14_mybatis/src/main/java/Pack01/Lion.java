package Pack01;

import java.util.LinkedList;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Pack01.Person;
import Pack01.UserDao;

@Controller
public class Lion {
	@RequestMapping("/t1")
	public String method01(HttpServletRequest request) {
		String name = request.getParameter("fullname");
		String age = request.getParameter("age");
		System.out.println("넘겨받음 : "+name+age);
		
		UserDao dao = new UserDao();
		Person p = new Person();
		p.setName(name);
		p.setAge(age);
		dao.insert(p);
		dao.showAge();
		
		return "registerView";
	}
}
