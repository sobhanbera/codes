import java.util.*;
import java.io.*;
import java.math.*;

public class FCTRL2 {
	static Scanner sc = new Scanner(System.in);
	static BigInteger one = BigInteger.ONE;
	public static void main (String args[]) {
		int t = sc.nextInt();
		for(int i  = 0; i < t; ++i){
			solution(t);
		}
	}

	public static void solution(int t){
		BigInteger n = sc.nextBigInteger();
		print(factorial(n));
	}
	
	public static BigInteger factorial(BigInteger n) {
		if(n == one)
			return one;
		return n.multiply(factorial(n.subtract(one)));
	}
	
	public static void print(Object o){
		System.out.println(String.valueOf(o));
	}
}
