package co2103.hw1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co2103.hw1.domain.Module;
import co2103.hw1.domain.Student;

@SpringBootApplication
public class Hw1Application implements CommandLineRunner {
	
	public static List<Module> modules = new ArrayList<>();
	
	public static String[] programs = new String[] { "Computer Science", "Creative Computing", "Software Engineering" };

	public static void main(String[] args) {
		SpringApplication.run(Hw1Application.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		Module module = new Module();
		module.setId(1);
		module.setTitle("CO2103");
		module.setConvenor("Dr. Smith");
		
		List<Student> studentList = new ArrayList<>();
		
		Student student = new Student();
		student.setName("Hugh Grant");
		student.setFacebook("Hugh.Grant123");
		student.setProgram("Computer Science");
		student.setHours(25);
		studentList.add(student);
		
		student = new Student();
		student.setName("James Edwards");
		student.setFacebook("JamesEd28");
		student.setProgram("Computer Science");
		student.setHours(25);
		studentList.add(student);
	
		module.setStudents(studentList);
		modules.add(module);
	}


}
