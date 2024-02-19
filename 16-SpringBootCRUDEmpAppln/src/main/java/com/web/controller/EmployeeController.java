package com.web.controller;


	

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.ModelMap;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;

	import com.web.entity.Employee;
	import com.web.repo.EmployeeRepo;

	@Controller
	public class EmployeeController {
	  @Autowired
	  private EmployeeRepo repo;
	  
	  @RequestMapping("/")
	  public String homePage()
	  {
		  return "home";
	  }
	  @RequestMapping("/addEmp")
	  public String empForm()
	  {
		  return "empForm";
	  }
	  
	  @RequestMapping("/register")
	  public String addEmpDetails(Employee emps,ModelMap model)
	  {
		  repo.save(emps);
		  return "success";
	  }
	  @RequestMapping("/viewEmp")
	  public String viewAllEmpDetails(ModelMap model)
	  {
		  model.put("emps",repo.findAll());
		  return "viewForm";
	  }
	  @RequestMapping("/delete/{empId}")
	  public String deleteEmp(@PathVariable int empId)
	  {
		  repo.deleteById(empId);
		  return "redirect:/viewUser";
	  }
	  @RequestMapping("/edit/{empId}")
	  public String editForm(@PathVariable int empId,ModelMap model)
	  {
		 model.put("command", repo.findById(empId).get());
		  return "editEmp";
	  }
	  @RequestMapping("/editandsave")
	  public String editAndSaveEmp(Employee emps,ModelMap model)
	  {
		  repo.save(emps);
		  return "redirect:/viewEmp";
	  }
	  
	  
	}


