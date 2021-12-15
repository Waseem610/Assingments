package com.te.challenge;
import java.util.Scanner;
public class Challenge9 {
	public static int getEvenDigitSum(int number){
		int sum=0;
		if(number<0)
			sum=-1;
		for(int i=1;i<=number;i++){
			if(i%2==0){
				sum=sum+i;
			}
		}
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scanner.nextInt();
		int result=Challenge9.getEvenDigitSum(number);
		System.out.println(result);

	}

}
