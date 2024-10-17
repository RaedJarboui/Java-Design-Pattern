package com.design.patterns.chain.responsibility;

import com.design.patterns.chain.responsibility.LeaveApplication.Type;

//A concrete handler
public class Director extends Employee {

	public Director(LeaveApprover nextApprover) {
		super("Director", nextApprover);
	}

	@Override
	protected boolean processRequest(LeaveApplication application) {
		if (application.getType() == Type.PTO) {
			application.approve(getApproverRole());
			return true;
		}
		return false;
	}

}
