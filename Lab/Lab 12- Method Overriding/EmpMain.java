package com.anudip.methodOverriding;

class Employee {
	private String name;
	private String role;
	
	public Employee(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}	
}

public class EmpMain {
	public static void main(String[] args) {		
//		System.out.println(name);
		Employee emp = new Employee();
		
		emp.setName("Vijaya");
		emp.setRole("Manager");
		System.out.println(emp.getName());
		System.out.println(emp.getRole());
		
		
		
		
	}
}



