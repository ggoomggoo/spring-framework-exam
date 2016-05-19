package a.b.contextname;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionControllerAdvice {
	
	@ExceptionHandler(Exception.class)
	public ModelAndView exception(Exception e) {
		System.out.println("exception");
//		ModelAndView mv = new ModelAndView();
		ModelAndView mv = new ModelAndView("exception");
		mv.addObject("key", "name");
		mv.addObject("value", "hh");
		return mv;
		
	}

}
