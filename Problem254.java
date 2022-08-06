import java.util.*;
import java.io.*;
import java.math.*;

public class Problem254{
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		int n = sc.nextInt();
		BigInteger bi = factorial(n);
		System.out.println(bi);
		System.out.println(digitSum(String.valueOf(bi)));
	}
	
	public static BigInteger factorial(int num){
		BigInteger fac = new BigInteger("1");
		for(int i = 2; i <= num; i++){
			fac = fac.multiply(BigInteger.valueOf(i));
		}
		return fac;
	}
	
	
	
	public static int digitSum(String num){
		int sum = 0;
		for(int i = 0; i < num.length();i++){
			sum += Integer.parseInt(String.valueOf(num.charAt(i)));
		}
		return sum;
	}
}
