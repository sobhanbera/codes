package projectEuler;

public class Problem3 {
	
	public static void main(String[] args) {
		
		//Ans 6857
//		long num = 600851475143L;
//
//		long large = 0;
//		for(long i = 3; i < num / 2; i++) {
//			if(num % i == 0 && Problem7.isPrime(i) && large < i) {
////				large = large < i?i:large;
//				large = i;
//				System.out.println(large);
//			}
//		}
//		System.out.println(large);
		
		
		//optimization is here...
		
		long number = 600851475143L;
		long factor = 1;
		while(number > 1) {
			factor++;
			if(Number.isPrime(factor)) {
				while(number % factor == 0) {
					number /= factor;
					System.out.println(factor);
				}
			}
		}
		System.out.println(factor);
	}
}
