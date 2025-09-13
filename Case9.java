package in;

public class Case9 {
	
	//1234
	public static int sumOfDigit(int num) {
		
		if(num!=0)
		return num%10 +sumOfDigit(num/10);
		return num;
	}
	public int reverse(int x) {
        int newInt = 0;

       
        
     while (x != 0) {
         int digit = x % 10;    
         if(newInt<Integer.MAX_VALUE || newInt>Integer.MIN_VALUE) {
         	return 0;
         }
         newInt = newInt * 10 + digit; 
         x /= 10;                      
     }

		return newInt;
		        
 }  



	public static void main(String[] args) {
		//System.out.println(sumOfDigit(1234510));
		
		int num =120;
		String cleaned = String.valueOf(num).replaceAll("[^\\d-]", "");
		StringBuilder sb = new StringBuilder(cleaned);
		sb.reverse();
		num= Integer.parseInt(sb.toString());
		System.out.println(num);
		
	}
	
	
}
