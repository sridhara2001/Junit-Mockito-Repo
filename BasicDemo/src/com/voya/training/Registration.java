package com.voya.training;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		String[] names = {"sridhar", "likhith", "amogh", "chida"};
		System.out.println("Please enter your username");
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		boolean isPresent = false;
		for(String name : names) {
			if(name.equals(username)) {
				System.out.println("Name already exist");
				isPresent = true;
				break;
			}
		}
		if(!isPresent) {
			System.out.println("You are registered");
		}
	}

}
