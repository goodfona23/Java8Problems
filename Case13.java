package in;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Case13 {
	
	//remove duplicates from an array
	public static void removeDupliactes(int[] ar) {
		Set<Integer> set=new HashSet<>();
		for(int a:ar) {
			set.add(a);
		}
		System.out.println(set);
	}
	
	public static void remove(Integer[] ar) {
		Set<Integer> set=new HashSet<>(Arrays.asList(ar));
		Integer[] uniq=set.toArray(new Integer[0]);
		System.out.println(Arrays.toString(uniq));
		
		
		
	}
	public static void main(String[] args) {
		int[] ar= {2,3,2,4,23,65,4,13,12,11,11};
		
		Integer[] arr=new Integer[ar.length];
		for(int i=0;i<ar.length;i++) {
			arr[i]=ar[i]; //autoboxing
		}
		
		//autoboxing using java 8
		Integer[] n= Arrays.stream(ar).boxed().toArray(Integer[]::new);
		Integer[] n1=IntStream.of(ar).boxed().toArray(Integer[]::new);
		removeDupliactes(ar);
		
		remove(arr);
		remove(n);
		remove(n1);
	}

}
