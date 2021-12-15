package com.technoelevate;
import java.util.Scanner;


public class problem4 {
	static int count=0;
	public boolean count(int[] x){
		for(int i=0;i<x.length;i++){
			for(int j=i+1;j<j+1;j++){
				if(x[i]==3&&x[j]!=3){
					count++;
				}
			}	
		}
		if(count==3)
			return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
		
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


