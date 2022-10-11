package com.bjit.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ControllerAdvice
public class EmplopyeeController {
	
	@ModelAttribute
	public void welcome(Model model) {
		model.addAttribute("msg", "Welcome to Shraiar's Website");
	}
	
	@RequestMapping("/")
	public String home() {
		return "homePage.html"; 
	}
	
	@PostMapping("/addEmployee")
	public ModelAndView addEmployee(@ModelAttribute("e") Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employee-details.html");
		return mv;
	}
}
