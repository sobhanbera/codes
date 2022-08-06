package projectEuler;

public class Problem50 {

	public static void main(String[] args) {
		
		System.out.println(Number.isPrime(953));
		int sum = 0;
		int large = 0;
		int n = 10000;
		int limit = 1000;
		int num = 0;
		for(int i=1; i<=100; i++) {
			if(Number.isPrime(i)) {
				num += 1;
				sum += num;
				System.out.println(i);
			}
			if(num == 21)
				break;
		}
		System.out.println(sum);
//		
//		for(int i = 1; i <= n; i++) {
//			if(Number.isPrime(i)) {
//				sum += i;
//				if(sum <= limit) {
//					if(large < sum) {
//						if(Number.isPrime(sum)) {
//							large = sum;
//							System.out.println(large);
//						}
//					}
//				}else {
//					break;
//				}
//			}
//		}
		System.out.println(large);
	}
}
