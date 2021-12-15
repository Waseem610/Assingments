package com.te.challenge;
import java.util.*;

public class Wall {
	double width;
	double height;

	public Wall() {

	}

	public Wall(double width, double height) {
		this();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return this.height * this.width;

	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the height\nEnter the width");
		double width=scanner.nextDouble();
		double height=scanner.nextDouble();
		
		if(width<=0||height<=0){
			Wall wall=new Wall(0,0);
			System.out.println( wall.getArea());
		}else{
			Wall wall=new Wall();
			wall.setHeight(width);
			wall.setWidth(height);
			System.out.println( wall.getArea());
		}
		
		
		

	}
}
