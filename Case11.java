package in;

import java.util.HashSet;
import java.util.Set;

public class Case11 {
//{2,1,4,4,3,6,2}
	public static void removeDuplicate(int[] num) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
		}

		System.out.println(set);

	}

	
	public static void main(String[] args) {
		int[] num = { 2, 1, 4, 4, 3, 6, 2 };
		removeDuplicate(num);
	}
}
