package a.b.contextname;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index() throws IOException {
		return "index";
	}
	
	@RequestMapping(value="/test")
	public String testException() throws IOException {
		{
			throw new IOException("occured IOException..");
		}
	}
	
	

}
