package in;

import java.util.Arrays;

public class Case12 {
	//Reverse words in String
	public static String reverseWords(String s) {
		
		String[] wordsArray=s.split(" ");
		System.out.println(Arrays.toString(wordsArray));
		StringBuilder reverseWords= new StringBuilder();
		for(String rv:wordsArray) {
			StringBuilder rev= new StringBuilder(rv).reverse();
			reverseWords.append(rev).append(" ");
		}
		
		return reverseWords.toString();
		
	}
public static void main(String[] args) {
	System.out.println(reverseWords("hello my name is Dhananjay"));
}
}
