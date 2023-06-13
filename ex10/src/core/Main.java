package core;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int [][] mat = new int [m][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i = 0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.println("Position " + i + "," + j + ":");
				if (j > 0) {
					System.out.println("Left: " + mat[i][j-1]);
				}
				if (j > 0) {
					System.out.println("Left: " + mat[i][j-1]);
				}
				if (j < mat[i].length-1) {
					System.out.println("Left: " + mat[i][j-1]);
				}
				if (j < mat.length-1) {
					System.out.println("Left: " + mat[i][j-1]);
				}
				
			}
		}
		sc.close();
	}
}