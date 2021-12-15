package com.technoelevate;

import java.util.Scanner;

public class addManyNumbers {

	public void add(int[] x) {
		int result = 0;

		for (int i = 0; i < x.length; i++) {
			result = x[i] + result;

		}
		System.out.println("The sum of array is :" + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// addManyNumbers ad=new addManyNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		// taking the size of array from user
		int size = sc.nextInt();

		int y[] = new int[size];
		// inserting the number in array
		for (int j = 0; j < y.length; j++) {
			System.out.println("enter the number");
			y[j] = sc.nextInt();

		}
		addManyNumbers addmanynumber = new addManyNumbers();
		addmanynumber.add(y);

	}

}
