package co2103.hw1.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Module;

public class ModuleValidator implements Validator{

	@Override
	public boolean supports(Class<?> c) {
		return Module.class.equals(c);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		Module module = (Module) target;
		
		for (Module m : Hw1Application.modules) {
			if (m.getId() == module.getId()) {
				errors.rejectValue("id", "", "Module already exists");
			}
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "", "Module name required");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "convenor", "", "Module convenor required");

		if (module.getConvenor().length() < 10) {
			errors.rejectValue("convenor", "", "Convenor must have 10 or more characters");
		}
		
		
	}
	
}
