package com.te.challenge;

public class SimpleCalculator {
	double firstNumber;
	double secondNumber;

	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public double getAddition() {
		return this.firstNumber + this.secondNumber;
	}

	public double getMultiplication() {
		return this.firstNumber * this.secondNumber;
	}

	public double getDivision() {
		return this.firstNumber / this.secondNumber;
	}

	public double getSubtraction() {
		return this.firstNumber -this.secondNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalculator ch=new SimpleCalculator();
		ch.setFirstNumber(170);
		ch.setSecondNumber(5);
		System.out.println(ch.getAddition());
		System.out.println(ch.getSubtraction());
		System.out.println(ch.getMultiplication());
		System.out.println(ch.getDivision());
	}

}
