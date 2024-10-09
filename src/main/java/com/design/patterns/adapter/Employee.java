package com.design.patterns.adapter;

/**
 * An existing class used in our system Adaptee
 */
public class Employee {

	private String fullName;

	private String jobTitle;

	private String officeLocation;

	public Employee() {

	}

	public Employee(String fullName, String jobTitle, String officeLocation) {
		this.fullName = fullName;
		this.jobTitle = jobTitle;
		this.officeLocation = officeLocation;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

}
