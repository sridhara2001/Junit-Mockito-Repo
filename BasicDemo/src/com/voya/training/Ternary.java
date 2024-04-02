package com.voya.training;

public class Ternary {
	public static void main(String[] args) {
		int x=10;
		int y=20;
		int z=30;
		String str = x>y&&y>z?"x is greater":y>z?"y is greater":"z is greater";
		System.out.println(str);
		
		
	}
}
