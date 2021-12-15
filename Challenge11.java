package com.te.challenge;

import java.util.Scanner;

public class Challenge11 {
	public static boolean hasSameLastDigit(int number1, int number2, int number3) {

		if ((number1 < 10) || (number1 > 1000) || (number2 < 10) || (number2 > 1000) || (number3 < 10)
				|| (number3 > 1000)) {
			return false;
		}
		int firstLast = number1 % 10;
		int secondLast = number2 % 10;
		int thirdLast = number3 % 10;

		if (firstLast == secondLast || firstLast == thirdLast || secondLast == thirdLast) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the firstnumber");
		int number = scanner.nextInt();
		System.out.println("Enter the second number");
		int number2 = scanner.nextInt();
		System.out.println("Enter the third number");
		int number3 = scanner.nextInt();

		boolean result = Challenge11.hasSameLastDigit(number, number2, number3);
		System.out.println(result);

	}

}
