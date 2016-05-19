package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController // 스프링 4.0
public class HomeController {
	
	@RequestMapping
//	@ResponseBody
	public String hello() {
		return "Hello World";
	}

}
