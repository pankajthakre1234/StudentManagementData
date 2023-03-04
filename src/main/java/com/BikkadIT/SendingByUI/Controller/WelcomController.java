package com.BikkadIT.SendingByUI.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomController {

	
	
	
	@GetMapping("/Welcome")
	public ModelAndView WelcomMsgController(@RequestParam String name) {
		
		String msg= "Hii" +  name  +   "Wellcome to Bikkad IT";
		System.out.println(msg);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("MASG",msg);
		mav.setViewName("welcome");
		
		return mav;
		
	}
	
}
