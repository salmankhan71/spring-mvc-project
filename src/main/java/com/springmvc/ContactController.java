package com.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.model.Employee;
import com.springmvc.service.EmployeeService;

@Controller
public class ContactController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@ModelAttribute
	public void commonDateForModel(Model m) {
		m.addAttribute("Header", "java Developer");
		m.addAttribute("Desc", "Home for program");	
		System.out.println("adding command data to model");
	}

	@RequestMapping("/contact")
	public String showFrom(Model m) {
		System.out.println("Creating form");
		return "contact";
	}
	
	@GetMapping("/")
	public String homePage(Model m) {
		
		return "contact";
	}

	@PostMapping("/processform")
	public String handleForm(@ModelAttribute("employee")Employee employee,Model model) {
			
		System.out.println(employee);
		
		/*
		 * if (employee.getUserName().isBlank()) {
		 * 
		 * return "redirect:/contact"; }
		 */
		
		int createEmployee=this.employeeService.createEmployee(employee);
		model.addAttribute("msg","Employee create with id"+createEmployee);
		/*
		 * model.addAttribute("Header", "java Developer"); model.addAttribute("Desc",
		 * "Home for program");
		 */
		
		model.addAttribute("employee", employee);
		return "sucess";
	}

}

/*
 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
 * String handleForm(
 * 
 * @RequestParam(name="email",required = false) String userEmail,
 * 
 * @RequestParam("userName") String userName,
 * 
 * @RequestParam("password") String userPassword,Model model) {
 * System.out.println("user email"+":"+ userEmail);
 * System.out.println("user name"+":"+ userName);
 * System.out.println("user password"+":"+ userPassword);
 * 
 * Employee employee=new Employee(); employee.setEmail(userEmail);
 * employee.setUserName(userName); employee.setPassword(userPassword);
 * 
 * System.out.println(employee);
 * 
 * //process
 * 
 * 
 * model.addAttribute("name",userName); model.addAttribute("email", userEmail);
 * model.addAttribute("password",userPassword);
 * 
 * model.addAttribute("employee",employee); return "sucess"; }
 * 
 * 
 * }
 * 
 */