package com.BikkadIT.SendingByUI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {

	@GetMapping("/Course")
	public ModelAndView GetCourseDetail(@RequestParam String cname, @RequestParam String tname) {
		
		String msg= cname +" new Batch Is Starting from 1 feb 2023 by "+tname;
		System.out.println(msg);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("COURSE", msg);
		mav.setViewName("course");
		
		return mav;
		
	}
}
