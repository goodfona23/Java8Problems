package com;

import java.util.List;

public class Case3 {
	public static void main(String[] args) {
		//find minimum from a list 
		List<Integer> num=List.of(12,5,63,2,56);
		
		Integer minNum =num.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(minNum);
		
	}

}
