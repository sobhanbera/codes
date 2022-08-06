package projectEuler;

import java.math.*;

public class Problem48 {

	public static void main(String...strings) {
		BigInteger bi = new BigInteger("1");
		BigInteger result = new BigInteger("0");
		BigInteger powered = bi;
		BigInteger ONE = new BigInteger("1");
		
		for(int i = 1; i <= 1000; i++) {
			powered = bi.pow(i);
//			System.out.println(i+"-->"+powered);
			bi = bi.add(ONE);
			result = result.add(powered);
		}
		System.out.println(result);
	}
}
