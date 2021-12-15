package com.technoelevate;

import java.util.Scanner;

public class Tocheck3 {
	static int c = 0;   

	public void count(int[] x) {
		int[] arr = new int[x.length + 1];// creating new array and storing the
											// previous array with +1 length
		for (int j = 0; j < x.length; j++) {
			arr[j] = x[j];
		}
		for (int i = 0; i < arr.length; i++) {

			if ((arr[i] == 3) && (arr[i + 1] != 3)) {
				c++;
			}
		}
		if (c == 3)
			System.out.println(true);

		else
			System.out.println(false);

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
		Tocheck3 tocheck3 = new Tocheck3();
		tocheck3.count(y);

	}
}
