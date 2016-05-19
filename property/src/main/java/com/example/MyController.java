package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@Value("${url}")
	String url;
	
	@RequestMapping("index")
	@ResponseBody
	public void index() {
		System.out.println(url);
	}
	
	@RequestMapping("index2")
	@ResponseBody
	public String index2() {
		return url;
	}

}
