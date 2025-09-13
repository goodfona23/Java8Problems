package in;

public class Case15 {
	//String length with length()
	public static void mylength(String s) {
		
		int len=0;
		try {
		while(true) {
			s.charAt(len);
			len++;
		}
		}catch(StringIndexOutOfBoundsException e) {
		//e.printStackTrace();
		}
		System.out.println(len);
	}
	
	public static void main(String[] args) {
		mylength("123");
	}

}
