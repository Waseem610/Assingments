package com.technoelevate;

import java.util.Scanner;

public class ArrayAssimgment3 {

	public void arr(int[] x) {
		if (x.length > 2) {
			for (int i = 0; i < 2; i++) {
				System.out.print(x[i]+",");
			}

		} else {
			for (int z : x)
				System.out.print(z + ",");
		}

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
		ArrayAssimgment3 arrayAssimgment3 = new ArrayAssimgment3();
		arrayAssimgment3.arr(y);

	}

}
