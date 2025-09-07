package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Case2 {

	public static void main(String[] args) {
		//filter even number from a list
		List<Integer> numlist= new ArrayList<>();
		numlist.add(12);
		numlist.add(2);
		numlist.add(13);
		numlist.add(15);
		
		 numlist.stream().filter(e -> e%2==0).collect(Collectors.toList()).
				 forEach(System.out::println);
		//System.out.println(filtered);
		
		

	}
}
