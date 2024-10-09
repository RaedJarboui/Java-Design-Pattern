package com.design.patterns.adapter;

//this is our adapter, we gonna implement interface Customer here and use composition with the Employee Class
//we gonna adapt use the functionnality of getName either by interface or from attribute with type Employe
public class EmployeObjectAdapter implements Customer {

	private Employee emp;

	public EmployeObjectAdapter(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String getName() {
		return this.emp.getFullName();
	}

	@Override
	public String getDesignation() {
		return this.emp.getJobTitle();
	}

	@Override
	public String getAddress() {
		return this.emp.getOfficeLocation();
	}

}
