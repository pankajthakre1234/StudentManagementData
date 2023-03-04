package com.BikkadIT.SendingByUI.Controller;


import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/UserForm")
	public String UserForm() {
		
		
		return "userReg";
	}
	
	@GetMapping("/SaveUser")
	public String SaveUser(User user, Model model) {
		
		System.out.println(user);
		model.addAttribute("USER", user);
		
		return "userSucessful";
		
	}
	
}
