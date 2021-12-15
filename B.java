package com.technoelevate.looscoupling;

public class B implements A, D {

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("from a");

	}

	public void d() {
		// TODO Auto-generated method stub
		System.out.println("from d");
	}
	public static void main(String[] args) {
		B b=new B();
		D n=b;
		n.a();
		n.d();
		
	}

	

}
