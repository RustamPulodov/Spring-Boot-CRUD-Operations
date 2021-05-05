package com.example.StudentsCRUDOperations.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.StudentsCRUDOperations.Model.Students;
import com.example.StudentsCRUDOperations.Service.StudentsService;

@Controller
public class StudentsController {

	@Autowired
	private StudentsService service;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		List<Students> liststudents = service.listAll();
		model.addAttribute("liststudents", liststudents);
		return "index";
	}
	
	@GetMapping("/new")
	public String add(Model model) {
		model.addAttribute("student", new Students());
		return "new";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveStudents(@ModelAttribute("student") Students student) {
		service.save(student);
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditStudentsPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("new");
		Students student = service.get(id);
		mav.addObject("student", student);
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteStudent(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";
	}
}
