package org.program;

public class Company extends Employee {
	
	public Company() {
		this("java");
		System.out.println("Im a default constructor");
	}
	
	public Company(int age) {
		this();
		System.out.println("Im a int para constructor :"+ age);
	}
	
	public Company(String name) {
		super('m');
		System.out.println("Im a String para constructor :" + name);
	}
	
	public static void main(String[] args) {
		Company c = new Company(33);
	}
}
