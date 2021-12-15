package com.te.challenge;

public class Challenge {
	public static double area(double x) {
		double result = 0;
		if (x <= 0) {
			result = -1;
		} else {
			result = 3.142 * x * x;
		}
		return result;
	}

	public static double area(double x, double y) {
		double result = 0;
		if (x <= 0 || y <= 0) {
			result = -1;
		} else {
			result = x * y;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Challenge.area(2, 3));

	}

}
