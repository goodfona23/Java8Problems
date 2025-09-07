package com;

import java.util.*;
import java.util.stream.Collectors;
public class Case5 {
	
	public static void main(String[] args) {
		//Get employee count department wise and find the department with the highest count of employees
		 List<Employee> employees = Arrays.asList(
		            new Employee("Amit", "IT"),
		            new Employee("Neha", "HR"),
		            new Employee("Raj", "Finance"),
		            new Employee("Priya", "IT"),
		            new Employee("Kiran", "HR"),
		            new Employee("Anil", "IT")
		        );
		String str="DHananjay";
		Map<Character,Long> map=str.
				chars().
				mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
		map.forEach((key,value)->System.out.print(" "+key +" : "+value));
		System.out.println("  ");
		
		Map<String, Long> emp = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		
		emp.forEach((dept,count)->{
			System.out.println(dept+" "+count);
		});
		
		Map.Entry<String, Long> deptHigestCount = emp.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println(deptHigestCount.getKey()+" : "+ deptHigestCount.getValue()); 

	}

}
