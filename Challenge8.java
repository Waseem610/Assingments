package com.te.challenge;

import java.util.Scanner;

public class Challenge8 {
	public static int sumFIrstAndLastDigit(int number) {
		int lastNumber;
		int firstNumber;
		int result = 0;
		if (number <= 0) {
			result = -1;
		} else {
			lastNumber = number % 10;
			while (number > 9) {
				firstNumber = number / 10;
				number = firstNumber;

			}
			result = number + lastNumber;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();

		int result = Challenge8.sumFIrstAndLastDigit(number);
		System.out.println("The sum of first and last digit is" + result);
	}

}
