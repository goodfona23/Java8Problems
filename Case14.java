package in;

public class Case14 {
//reverse word in string
	
	public static void reverseWord(String statement) {
		String[] s1=statement.split(" ");
		StringBuilder result= new StringBuilder();
		for(String s:s1) {
			StringBuilder sb= new StringBuilder(s).reverse();
			result.append(sb).append(" ");
		}
		System.out.println(result);
		
	}
	
	//reverse string
	public static void reverse(String statement) {
		StringBuilder sb = new StringBuilder(statement);
		sb.reverse();
		System.out.println(sb.toString());
		
		
		
	}
	public static void main(String[] args) {
		reverse("Java Coding Interview");
		reverseWord("Java Coding Interview");
	}
}
