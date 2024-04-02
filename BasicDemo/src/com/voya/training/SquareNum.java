package com.voya.training;

import java.util.Scanner;

public class SquareNum {

	public static void main(String[] args) {
		int[] nums = new int[4];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<nums.length; i++) {
			int x = sc.nextInt();
			nums[i] = x;
		}
		sc.close();
		
		for(int num2 : nums) {
			System.out.print(num2+" ");
		}
		System.out.println();
		
		for(int numsq : nums) {
			int numsq1 = numsq * numsq;
			System.out.print(numsq1+" ");
		}
		System.out.println();
	}

}
