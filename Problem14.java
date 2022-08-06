package projectEuler;

import java.util.concurrent.TimeUnit;

public class Problem14 {
	
	public static void main(String[] args) throws InterruptedException {
		int large = -1;
		int n = -1;
		for(int i=1; i<1000000; i++) {
			int c = collatz(i);
//			System.out.println(c);
			if(c > large) {
				large = c;
				n = i;
			}
//			large = c > large ? c : large;
//			TimeUnit.SECONDS.sleep(1);
		}
		System.out.println(n + " " + large);
//		for(int i=13;i<16;i++) {
//			System.out.println(collatz(i));
//		}
	}
	
	public static int collatz(int n) {
		int res = 1;
		int t = n;
		while(t > 1) {
			if(t % 2 == 0)
				t = t/2;
			else
				t = (3 * t) + 1;
			res++;
		}
		return res;
	}
}
