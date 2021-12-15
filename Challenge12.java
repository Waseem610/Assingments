package com.te.challenge;

import java.util.Scanner;

public class Challenge12 {
	public static String printFactors(int number){
		if(number<1){
			return "Invalid value";
		}
		for(int i=1;i<number;i++){
			if(number%i==0)
				System.out.print(i+" ");
			
		}
		
		return "";	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		String result=Challenge12.printFactors(number);
		System.out.println(result);

	}

}
