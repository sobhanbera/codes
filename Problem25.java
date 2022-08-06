package projectEuler;

import java.math.BigInteger;

public class Problem25 {

	public static void main(String...strings) {
		BigInteger A = new BigInteger("1"), B = A, C = B;//assign 1 to all a,b and c...
		int limit = 1000;
		int i=1;
		while(true) {
			A = B;
			B = C;
			C = A.add(B);
			if(String.valueOf(A).length() == limit) {
				System.out.println(A);
				break;
			}
			i += 1;
		}
		System.out.println(i);
	}
}
