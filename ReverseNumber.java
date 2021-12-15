package com.technoelevate;

public class ReverseNumber {
	public static void main(String[] args) {
		int number = 875;
		int result = 0;
		while (number != 0) {
			int rem = number % 10;
			result = result * 10 + rem;
			number = number / 10;
		}
		System.out.println(result);

	}
}