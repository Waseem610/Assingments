package com.te.interfac;

public class RollsRoyce implements Car {
	
	public void start() {
		System.out.println("startttt");
		
	}

	@Override
	public void accelarate() {
		// TODO Auto-generated method stub
		System.out.println("movesssss");
		
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Stopppp");
}
}