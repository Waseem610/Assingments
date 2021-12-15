package com.technoelevate;
import java.util.*;
public class AmstrongNumber {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		int ams=number;
		int result=0;
		while(number!=0){
			int rem=number%10;
			number=number/10;
			result=result+rem*rem*rem;
		}
		if(result==ams){
			System.out.println("the number is amstrong");
		}else
			System.out.println("the number is not a amstrong number");
	}
}
