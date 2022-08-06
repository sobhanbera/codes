package codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class ACMSGURU105 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Non-Optimized Solution...
//		BigInteger n = sc.nextBigInteger();
//		String seq = "";
//		BigInteger b = new BigInteger("3");
//		BigInteger one = BigInteger.ONE;
//		long ans = 0;
//		
//		for (BigInteger bi = BigInteger.valueOf(1); bi.compareTo(n) <= 0; bi = bi.add(one)) {
//			seq += bi;
//			if(new BigInteger(seq).mod(b) == BigInteger.ZERO) {
//				System.out.println(seq);
//				ans += 1;
//			}
//	    }
//		System.out.println(ans);
		
		//Optimized Solution...
		int n = sc.nextInt();
		String seq = "";
		int sum = 0;
		BigInteger zero = BigInteger.ZERO;
		BigInteger three = new BigInteger("3");
		for(int i = 1; i <= n; i++) {
			seq += i;
			if(new BigInteger(seq).mod(three) == zero)
				sum += 1;
		}
		System.out.println(sum);
	}
}
