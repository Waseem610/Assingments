package com.te.challenge;

import java.util.Scanner;


public class Challenge10 {
	public static boolean hasShareDigit(int number1, int number2) {
		boolean result = true;
		int numberOneFirstDigit = number1/10;
	    int numberTwoFirstDigit = number2/10;
	    int numberOneLastDigit = number1%10;
	    int numberTwoLastDigit = number2%10;
		if ((number1 < 10) || (number1 > 99) || (number2 < 10) || (number2 > 99)) {
			result = false;
			}
			
		    
		else if(numberOneFirstDigit == numberTwoFirstDigit || numberOneFirstDigit == numberTwoLastDigit || numberOneLastDigit == numberTwoLastDigit) {
		        result=true;
		    } else {
		     result= false;
		   
		}
			
		return result;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the firstnumber");
		int number = scanner.nextInt();
		System.out.println("Enter the second number");
		int number2 = scanner.nextInt();

		boolean result = Challenge10.hasShareDigit(number, number2);
		System.out.println(result);

	}

}
