package co2103.hw1.domain;

import java.util.List;

public class Module {

	private int id;
	private String title;
	private String convenor;
	private List<Student> students;
	
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getConvenor() {
		return convenor;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	
	public void setId(int newId) {
		this.id = newId;
	}
	
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	
	public void setConvenor(String newConvenor) {
		this.convenor = newConvenor;
	}
	
	public void setStudents(List<Student> newStudents) {
		this.students = newStudents;
	}
}
