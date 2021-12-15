package com.te.challenge;

public class Challege6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i + " ");
				sum = i + sum;
				count++;
			}
			if (count == 5) {
				break;
			}

		}
		System.out.println("The sum of numbers is" + sum);
	}

}
