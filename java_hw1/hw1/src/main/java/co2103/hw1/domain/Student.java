package co2103.hw1.domain;

public class Student {

	private String name;
	private String facebook;
	private String program;
	private int hours;

	public String getName() {
		return name;
	}
	
	public String getFacebook() {
		return facebook;
	}
	
	public String getProgram() {
		return program;
	}
	
	public int getHours() {
		return hours;
	}
	
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setFacebook(String newFacebook) {
		this.facebook = newFacebook;
	}
	
	public void setProgram(String newProgram) {
		this.program = newProgram;
	}
	
	public void setHours(int newHours) {
		this.hours = newHours;
	}
}

