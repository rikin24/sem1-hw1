package co2103.hw1.controller;

import java.util.Arrays;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Student;

public class StudentValidator implements Validator{

	@Override
	public boolean supports(Class<?> c) {
		return Student.class.equals(c);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		Student student = (Student) target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Student name required");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "facebook", "", "Student facebook required");
		
		if (!Arrays.asList(Hw1Application.programs).contains(student.getProgram())) {
			errors.rejectValue("program", "", "Invalid program");
		}
		
		if (student.getHours() >= 0) {
			if (student.getHours() >= 30) {
				errors.rejectValue("hours", "", "Number of hours must be between 0-30");
			}
		} 
			else {
				errors.rejectValue("hours", "", "Number of hours must be between 0-30");
			}
		
	}
	
}
