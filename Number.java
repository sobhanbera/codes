package projectEuler;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

public abstract class Number {

	public static void main(String[] args) {
//		System.out.println(collatzSeqSize(97));
	}

	@Deprecated
	public static boolean isPrime(long number) {
		if(number == 1)
			return false;
		if(number == 2)
			return true;
        if(number % 2 == 0)
            return false;
		for(int i = 3; i < number/2; i++)
			if(number % i == 0)
				return false;
		return true;
	}

	@Deprecated
	public static boolean isPalindrome(long number) {
		long r = 0, time = number;
		while(time > 1) {
			 r *= 10;
			 r += time / 10;
			 time %= 10;
		}
		if(number == r)
			return true;
		return false;
	}

	@Deprecated
	public static boolean isPythagoreanTriplet(int a, int b, int c) {
		if((a * a) + (b * b) == (c * c))
			return true;
		return false;
	}

	@Deprecated
	public static List<Integer> factorsOf(int num, boolean include) {
		List<Integer> finalList = new ArrayList<>();
		if(isPrime(num)) {
			finalList.add(1);
			if(include)
				finalList.add(num);
			return finalList;
		}
		for(int i = 1; i <= num/2; i++) {
			if(num % i == 0)
				finalList.add(i);

		}
		if(include)
			finalList.add(num);
		return finalList;
	}

	public static String factorialOf(String str) {
		BigInteger result = BigInteger.ONE;

		for(int i=Integer.parseInt(str); i>1; i--) {
			result = result.multiply(new BigInteger(String.valueOf(i)));
		}
		String r = String.valueOf(result);
		return r;

	}
	
	public static BigInteger power(BigInteger num,int power) {
		BigInteger bi = num;
		bi = bi.pow(power);
		return bi;
	}
	
	public static int collatzSeqSize(int num) {
		int result = 1;
		while(num != 1) {
			if(num % 2 == 0) {
				num /= 2;
			}else {
				num = (3*num) + 1;
			}
			result++;
		}
		return result;
	}
}
