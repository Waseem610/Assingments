package com.te.challenge;

import java.util.Scanner;

public class Challenge7 {
	public static boolean isOdd(int number) {
		boolean result = true;
		if (number < 0 || number % 2 == 0) {
			result = false;

		} else
			result = true;

		return result;
	}

	public static int sumOdd(int start, int end) {
		int sum = 0;
		if (start < 0 || end < 0) {
			sum = -1;
		} else {
			for (int i = start; i <= end; i++) {
				if (isOdd(i)) {
					sum = sum + i;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 to check odd");
		System.out.println("Eneter 2 if you want sum");
		int selector = scanner.nextInt();
		if (selector == 1) {
			System.out.println("Enter the number");
			int number = scanner.nextInt();
			boolean result;
			result = isOdd(number);
			System.out.println(result);
		} else if (selector == 2) {
			System.out.println("Enter the start number");
			int start = scanner.nextInt();
			System.out.println("Enter the end number");
			int end = scanner.nextInt();
			int sum = Challenge7.sumOdd(start, end);
			System.out.println(sum);

		}

	}

}
