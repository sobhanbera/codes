package projectEuler;

import java.math.BigInteger;
import java.util.Set;
import java.util.TreeSet;

public class Problem29 {

	public static void main(String[] args) {
		Set<BigInteger> powers = new TreeSet<>();
		BigInteger bii;
//		BigInteger bij;
		BigInteger result;
		for(int i=2; i<=100; i++) {
			bii = new BigInteger(String.valueOf(i));
			for(int j=2; j<=100; j++) {
//				bij = new BigInteger(String.valueOf(j));
				result = bii.pow(j);
				powers.add(result);
			}
		}
		System.out.println(powers.size());
	}
}
