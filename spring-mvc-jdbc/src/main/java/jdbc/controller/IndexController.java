package jdbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/index")
public class IndexController {
	
//	@RequestMapping(value="/index", method=RequestMethod.GET)
	@RequestMapping(method=RequestMethod.GET)
	public String index(Model model) {
		System.out.println("start index method");
		model.addAttribute("emps", "emps value");
		return "index";
	}
	
}