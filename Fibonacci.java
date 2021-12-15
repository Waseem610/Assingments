package com.technoelevate;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = scanner.nextInt();
		int firstTerm = 0;
		int secondTerm = 1;
		int nextTerm = 0;
		System.out.print(firstTerm + ",");
		for (int i = 0; i <= n; i++) {
			System.out.print(secondTerm + ",");
			nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;

		}
	}

}
