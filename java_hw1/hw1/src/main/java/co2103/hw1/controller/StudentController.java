package co2103.hw1.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Module;
import co2103.hw1.domain.Student;

@Controller
public class StudentController {
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.addValidators(new StudentValidator());
	}
	
	@GetMapping("/students")
	public String listStudents(@ModelAttribute Student student, Model model, @RequestParam int module) {
		
		Module newModule = null;
		
		for (Module m : Hw1Application.modules) {
			if (m.getId() == module) {
				newModule = m;
				break;
			}
		}
		
		model.addAttribute("students", newModule.getStudents());
		model.addAttribute("moduleID", newModule.getId());
		
		return "students/list";
	}
	
	@RequestMapping("/newStudent")
	public String studentForm(@ModelAttribute Student student, @RequestParam int module, Model model) {
		
		model.addAttribute("student", new Student());
		
		model.addAttribute("module", module);
		
		return "students/form";
	}
	
	@PostMapping("/addStudent")
	
	public String addStudent(@Valid @ModelAttribute Student student, BindingResult result, @RequestParam int module, Model model) {
		
		model.addAttribute("module", module);
		
		if (result.hasErrors()) {
			return "students/form";
		}
		
		Module newModule = null;
				
		for (Module m : Hw1Application.modules) {
			if (m.getId() == module) {
				newModule = m;
				break;
			}
		}

		if (newModule != null) {
			if (newModule.getStudents() != null) {
				newModule.getStudents().add(student);
			} 
			
			else {
				List<Student> studentList = new ArrayList<Student>();
				newModule.setStudents(studentList);
				newModule.getStudents().add(student);
			}
		}
		
		return "redirect:/modules";
	}

}
