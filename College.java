package com.te.collectionassingment;

import java.util.*;
import java.util.LinkedList;
import java.awt.List;

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Student> list = new LinkedList<>();
		list.add(new Student(1, "waseem", 22));
		list.add(new Student(9, "aseem", 25));
		list.add(new Student(5, "seem", 23));
		list.add(new Student(2, "muteeq", 24));
		list.add(new Student(4, "nihad", 15));
		Collections.sort(list);
		for(Student e:list){
			System.out.println( e);
		}
		System.out.println("==================");
		Collections.sort(list,new SortByName());
		list.forEach((n)->{
			System.out.println(n);
		});
	}

}
