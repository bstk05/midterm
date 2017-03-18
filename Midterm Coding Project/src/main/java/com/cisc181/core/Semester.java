package com.cisc181.core;

import java.util.UUID;
import java.util.Date;

public class Semester {
	
	private UUID Semester;
	private Date StartDate;
	private Date EndDate;
	
	
	public Semester(UUID semester, Date startDate, Date endDate) {
		super();
		Semester = semester;
		StartDate = startDate;
		EndDate = endDate;
	}


	public UUID getSemester() {
		return Semester;
	}


	public void setSemester(UUID semester) {
		Semester = semester;
	}


	public Date getStartDate() {
		return StartDate;
	}


	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}


	public Date getEndDate() {
		return EndDate;
	}


	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	
	
	
	
	

}
