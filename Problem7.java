package projectEuler;

public class Problem7 {

	public static void main(String[] args) {
		
		//program for calculating 10,001 prime number...
		int k = 0;
		for(int i = 2; k < 10002; i++) {
			if(isPrime(i))
				k += 1;
			if(k == 10001) {
				System.out.println("prime " + i);
				break;
			}
		}
	}
	
	public static boolean isPrime(long number) {
		if(number % 2 ==0 && number != 2)
			return false;
		for(long i = 3;i<number/2; i++) {
			if(number % i == 0)
				return false;
		}
		return true;
	}
	
	
}
