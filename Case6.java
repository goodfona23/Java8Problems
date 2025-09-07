package com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Case6 {
	static List<Employee> employees = Arrays.asList(
            new Employee("Amit", "IT",100),
            new Employee("Neha", "HR",1000),
            new Employee("Raj", "Finance",500),
            new Employee("Priya", "IT",100),
            new Employee("Kiran", "HR",1000),
            new Employee("Anil", "IT",10)
        );
	public static void main(String[] args) {
		//Get average salary for employee department wise
		Map<String,Double>avrgSalEmp = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, 
				Collectors.averagingDouble(emp->emp.getSalary())));
		
					avrgSalEmp.entrySet().stream().forEach(entry->System.out.println(entry.getKey()+" : "+entry.getValue()));

		
	}

}
