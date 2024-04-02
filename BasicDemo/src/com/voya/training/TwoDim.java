package com.voya.training;

public class TwoDim {

	public static void main(String[] args) {
		int[][] matrix = new int[3][2];
		System.out.println(matrix[0][0]);
		System.out.println(matrix.length);
		//allocating
		matrix[0][0]=90;
		matrix[0][1]=95;
		matrix[1][0]=80;
		matrix[1][1]=70;
		matrix[2][0]=67;
		matrix[2][1]=80;
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int[] first:matrix) {
			for(int second:first) {
				System.out.print(second+" ");
			}
			System.out.println();
		}
	}

}
