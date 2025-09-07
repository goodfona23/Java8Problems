package com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Case7 {
	static List<Employee> employees = Arrays.asList(
            new Employee("Amit", "IT",100),
            new Employee("Neha", "HR",1000),
            new Employee("Raj", "Finance",500),
            new Employee("Priya", "IT",100),
            new Employee("Kiran", "HR",1000),
            new Employee("Anil", "IT",10)
        );
	public static void main(String[] args) {
		int[] arr = {1,2,4,3};
		System.out.println(Arrays.stream(arr).filter(e-> e%2==0).map(i->i).reduce(0,Integer::sum));
		
		int[] ar = {2,1,4,5,3,6,8,9};
		//maxint
		int maxint=Arrays.stream(ar).boxed().max(
				Integer::compareTo
				).get();
		
		System.out.println("max in"+Arrays.toString(ar)+" is  "+maxint);
		int min=Arrays.stream(ar).boxed().min(Integer::compareTo).get();
		System.out.println("min in"+Arrays.toString(ar)+" is  "+min);
		
		
		//int arr reverse
		IntStream.range(0, arr.length).mapToObj(i->arr[arr.length-1-i]).forEach(System.out::println);

		String str="Dhananjay";
		String[] str2 = str.split("");
		//str char reverse
		IntStream.range(0, str2.length).mapToObj(i-> str2[str2.length-1-i]).forEach(System.out::print);

	}

}
