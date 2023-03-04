package com.BikkadIT.SendingByUI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {

	
	@GetMapping("/GetValue/{a}")
	public String PrintValue( @PathVariable int a, Model model) {
		
		String msg="The value of a is: "+ a;
		System.out.println(a);
		model.addAttribute("VALUE", msg);
		
		return "print";
		
	}
	
	@GetMapping("AdditionVariable/{a}/{b}")
	public ModelAndView Additon(@PathVariable int a, @PathVariable int b ) {
	
		int c = a + b;
		String msg="The Total Value of Two Variable a and b is:"+ c;
		ModelAndView mav=new ModelAndView();
		mav.addObject("ADDITION", msg);
		mav.setViewName("addition");
		
		return mav;
		
	}
}
