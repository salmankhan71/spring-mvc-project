package com.springmvc;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String home(Model model) {
		System.out.println("this is home url");

		model.addAttribute("name", "salman");
		model.addAttribute("id", 9832);

		List<String> name = new ArrayList<String>();
		name.add("Muzammil");
		name.add("salman");
		name.add("MohsHin");
		name.add("Kaleem");

		model.addAttribute("f", name);
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		return "about";
	}
	//services
	//help
	
	@RequestMapping("/help")
	public ModelAndView help() {
	//public String help() {
		System.out.println("this is help Controller");
		//creating model and view object
		ModelAndView modelAndView=new ModelAndView();
		//return "help";
		
		//setting the data
		modelAndView.addObject("names", "salman");
		modelAndView.addObject("rollnumber", 2410580);
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(2387);
		list.add(9011);
		list.add(2410580); 
		list.add(502080);
		
		modelAndView.addObject("marks",list);
		
		//setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
