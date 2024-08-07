package com.tnsif_daynine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExecutor {
	public static void main(String[] args) {
		List<Employee> emps= new ArrayList<Employee>();
		emps.add(new Employee("Shruti", 97, 1122424));
		emps.add(new Employee("Arya", 197, 41122424));
		emps.add(new Employee("ranjan", 7, 11224455));
		
		// unsorted objects
		emps.forEach(System.out::println);
		
		Collections.sort(emps);
		emps.forEach(System.out::println);
	}
}	
