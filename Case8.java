package in;

public class Case8 {
	public static boolean isPrime(int num) {
		boolean flag = false;
		int count = 0;
		for (int i = 1; i < num; i++) {
			if (num % 2 == 0) {
				count++;
			}
		}
		if (count <= 2) {
			flag = true;
		}

		return flag;
	}

	public static boolean isPrimeN(int num) {
		boolean flag = false;
		int count = 0;
		for (int i = 1; i < Math.sqrt(num); i++) {
			if (num % 2 == 0) {
				count++;
			}
		}
		if (count <= 2) {
			flag = true;
		}

		return flag;
	}

	public static void main(String[] args) {

		System.err.println(isPrimeN(500));

		System.out.println(isPrime(500));

	}
}
