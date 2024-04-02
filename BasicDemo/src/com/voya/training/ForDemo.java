package com.voya.training;

public class ForDemo {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			int x=3;
			int y=x*i;
			System.out.println(x+" * "+i+" = "+y);
		}
		
		int x=0;
		while(x<10) {
			System.out.println(x);
			x++;
		}
		
		int y=0;
		do {
			y=y+1;
			System.out.println(y);
		}while(y<10);
		
	}
}
