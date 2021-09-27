package Pack01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWordController {
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/t1")
	public String Next() {
		return "Tiger";
	}
}