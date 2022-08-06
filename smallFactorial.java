package codechef;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;

public class smallFactorial {

	static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		int t = sc.nextInt();
		for(int i  = 0; i < t; ++i){
			int n = sc.nextInt();
			System.out.println(factorial(n));
		}
	}
	
	public static BigInteger factorial(int num) {
	    BigInteger fact = BigInteger.valueOf(1);
	    for (int i = 1; i <= num; i++)
	        fact = fact.multiply(BigInteger.valueOf(i));
	    return fact;
	}
	
	public static void print(Object o){
		System.out.println(String.valueOf(o));
	}
}
