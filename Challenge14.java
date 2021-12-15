package com.te.challenge;

import java.util.Scanner;

public class Challenge14 {

	public static boolean canPack(int bigCount, int smallCount, int goal) {
		int totalKilos = (5 * bigCount) + smallCount;
		int count = 0;
		int temp = 0;

		if (totalKilos < goal) {
			return false;
		} else if (totalKilos == goal) {
			return true;
		} else {
			for (int i = 0; i < goal; i++) {

				temp = goal - i;
				if (temp % 5 == 0) {
					break;
				}
			}
			if (bigCount >= temp / 5) {
				goal -= temp;
				if (smallCount >= goal) {
					return true;
				}
				return false;
			} else {
				goal -= (temp - bigCount * 5);
				if (smallCount >= goal) {
					return true;
				}
				return false;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the bigcount");
		int bigCount = scanner.nextInt();
		System.out.println("Enter the small count");
		int smallCount = scanner.nextInt();
		System.out.println("Enter the goal");
		int goal = scanner.nextInt();
		System.out.println(canPack(bigCount, smallCount, goal));
	}

}
