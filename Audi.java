package com.te.interfac;

public class Audi implements Car {

	@Override
	public void start() {
		System.out.println("started");
		
	}

	@Override
	public void accelarate() {
		// TODO Auto-generated method stub
		System.out.println("moves");
		
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Stop");		
	}

}
