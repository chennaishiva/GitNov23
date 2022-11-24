package org.test;

public class EmployeeNotFoundException extends Exception {
	
	@Override
	public String getMessage() {
		
		String msg = "Employee not found in unit 3";
		return msg;
	}

}
