package com.te.challenge;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Challenge15 {

	public static double getBucketCount(double width, double height, double area, int extraBucket) {

		if (width <= 0 || height <= 0 || area <= 0 || extraBucket <= 0) {
			return -1;
		} else {
			double areaToCover = width * height;
			double noOfBuckets = areaToCover / area;
			noOfBuckets = noOfBuckets - extraBucket;

			return noOfBuckets;
		}
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter width\n enter the height\n enter the area\n enter extra bucket");
		double width=scanner.nextDouble();
		double height=scanner.nextDouble();
		double area =scanner.nextDouble();
		int extraBucket=scanner.nextInt();
		double buckets = getBucketCount(width,height,area,extraBucket);
		System.out.println(buckets);
	}
}
