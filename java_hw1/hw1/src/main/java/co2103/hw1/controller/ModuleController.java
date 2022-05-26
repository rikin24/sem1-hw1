package co2103.hw1.controller;

import java.util.ArrayList;
import java.util.List;

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

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Module;
import co2103.hw1.domain.Student;

@Controller
public class ModuleController {
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.addValidators(new ModuleValidator());
	}
	
	@GetMapping("/modules")
	public String listModules(@ModelAttribute Module module, Model model) {
		model.addAttribute("modules", Hw1Application.modules);
		return "modules/list";
	}
	
	@RequestMapping("/newModule")
	public String moduleForm(Model model) {
		model.addAttribute("module", new Module());
		return "modules/form";
	}
	
	@PostMapping("/addModule")
	
	public String addModule(@Valid @ModelAttribute Module module, BindingResult result) {
		
		if (result.hasErrors()) {
			return "modules/form";
		}
		
		List<Student> studentList = new ArrayList<Student>();
		module.setStudents(studentList);
		
		Hw1Application.modules.add(module);
		
		return "redirect:/modules";
	}
}

