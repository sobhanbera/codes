package codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class ACMSGURU112 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		int ab = Integer.parseInt(String.valueOf(a));
		int ba = Integer.parseInt(String.valueOf(b));
		BigInteger ans = a.pow(ba).subtract(b.pow(ab));
		System.out.println(ans);
	}
}
