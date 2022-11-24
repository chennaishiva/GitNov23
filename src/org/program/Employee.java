package org.program;

public class Employee {
	
	public Employee() {
		
		System.out.println("Im a parent default constructor");
	}
	
	public Employee(char gender) {
		this();
		System.out.println("Im a parent char para constructor :" + gender);
	}

}
