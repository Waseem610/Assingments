package com.te.challenge;

public class Challenge3 {
	public static void equal(int x, int y, int z) {
		if (x <= 0 || y <= 0 || z <= 0) {
			System.out.println("Invalid value");

		} else if (x == y && y == z) {
			System.out.println("All the numbers are equal");
		} else
			System.out.println("All the numbers are different");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Challenge3.equal(0, 2, 3);

	}

}
