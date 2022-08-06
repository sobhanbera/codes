package projectEuler;

import java.math.BigInteger;

public class Problem16 {
	
	public static void main(String[] args) {
		BigInteger answer = Number.power(new BigInteger("2"), 1000);
		String strAns = String.valueOf(answer);
		int sum = 0;
		char[] cAns = strAns.toCharArray();
		for(char c : cAns) {
			if(Character.isDigit(c)) {
				sum += Integer.parseInt(String.valueOf(c));
			}
		}
		System.out.println(sum);
		
	}
}
