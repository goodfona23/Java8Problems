package com;
 import java.util.*;
import java.util.stream.Collectors;
public class Case4 {

	public static void main(String[] args) {
		List<String> a=Arrays.asList("java","Python","C++");
		//iterating a list
		a.forEach(x->System.out.println(x));
		
		List<String> list=Arrays.asList("JAVA","Python","C++");
		//filter a list
		List<String> filtered= list.stream().
				filter(s->s.toLowerCase().startsWith("j")).
				collect(Collectors.toList());
		
		System.out.println(filtered);
		
		//sort using Lamda 
		List<String> c=Arrays.asList("java","Python","C++","angular");
		c.sort((x,y)->x.compareTo(y));
		c.forEach(System.out::println);
		
		//sort a string
		String input = "javaprogram";
        String sorted = input.chars()
                             .sorted()
                             .mapToObj(f -> String.valueOf((char) f))
                             .collect(Collectors.joining());
        System.out.println("Sorted string: " + sorted);

		
		
	}
}
