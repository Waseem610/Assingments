package com.technoelevate;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 5, 6, 7, 8, 8, 2, 5, 1, 7, 6, 4, 5, 6 };
		
		int size=arr.length;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(arr[i]==arr[j]){
					int k=j;
					while(k<size-1){
						arr[k]=arr[k+1];
						k++;
						
					}
					size--;
					j--;
				}
				
			}
			System.out.print(arr[i]+" ");
			
		}
		
		}
		
	}

