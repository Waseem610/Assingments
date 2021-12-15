package com.te.emparray;

import java.util.ArrayList;

public class empArraylist {
	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList<>();
		arrayList.add(new Employee(1, "waseem", 100000));
		arrayList.add(new Employee(2, "yunus", 120000));
		arrayList.add(new Employee(3, "bhushan", 100300));
		arrayList.add(new Employee(5, "nihad", 100056));
		arrayList.add(new Employee(1, "anuraag", 10870));
		for(Employee e:arrayList){
			System.out.println(e);
		}
		
	}

}
