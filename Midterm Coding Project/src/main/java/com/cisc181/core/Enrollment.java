package com.cisc181.core;
import java.util.UUID;

public class Enrollment {
	private UUID Section;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	public Enrollment(){
		
	}
	
	public void setEnrollmentID(UUID section, UUID studentID, UUID enrollmentID) {
		
		Section = section;
		StudentID = studentID;
		EnrollmentID = enrollmentID;
		
	}
	

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}

	public UUID getSection() {
		return Section;
	}

	public void setSection(UUID section) {
		Section = section;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	
	
	
	

	

}
