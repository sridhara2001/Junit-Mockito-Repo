package com.voya.training;

public class Greater {

	public static void main(String[] args) {
		int x=50;
		int y=20;
		int z=60;
		if(x>y && x>z) {
			System.out.println(x+" is greater value");
		}else if(y>z) {
			System.out.println(y+" is greater value");
		}else {
			System.out.println(z+" is greater value");
		}
	}

}
