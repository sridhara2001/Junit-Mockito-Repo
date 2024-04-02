package com.voya.training;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		System.out.println("Please enter your details");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String city = sc.nextLine();
		int salary = sc.nextInt();
		sc.close();
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("City : "+city);
		System.out.println("Salary : "+salary);
	}

}
