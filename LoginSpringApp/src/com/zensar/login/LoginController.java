package com.zensar.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	@PostMapping("/validateuser")
	public String validate(User user,ModelMap map){
		if(user.getUsername().equals("tushar")&& user.getPassword().equals("qwerty@1234")){
			map.addAttribute("user", user);
			return "success";
		}
		else{
			map.addAttribute("error","Login Error");
			return "login";
		}
		
		
	}
}