package com.oops.basics;

public class EmpMain {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.employeeName= "Sridhar";
		employee.employeeId=12;
		employee.salary=2000;
		System.out.println("Name : "+employee.employeeName);
		System.out.println("ID : "+employee.employeeId);
		System.out.println("Salary : "+employee.salary);
	}
}
