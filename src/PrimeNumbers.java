
public class PrimeNumbers {
	
	static String isPrime(int num) {

		if (num <= 1) {
			return "not a prime number";
		}
		for (int i = 2; i < num;) {
			if (num % i == 0) {
				System.out.println(num % i);
				return "not a Prime number";
			}
		}
		return "prime number";
	}
	
	static void printPrimeNumber(int num) {

		for(int j=2 ;j<=num;num--) {
			if(num%j ==0) {
				System.out.println(num);
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.out.println(isPrime(20));
		printPrimeNumber(25);
	}

}
