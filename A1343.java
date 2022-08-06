package codeforces;

import java.util.*;

public class A1343 {
	public static void main(String...strings) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			if(balancedArray(n))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
	
	public static boolean balancedArray(int n) {
		int even = 0, odd = 0;
		for(int i = 0; i <= n; i++) {
			if(i % 2 == 0)
				even += i;
			else
				odd += i;
		}
		System.out.println(even + " " + odd);
		if(even == odd)
			return true;
		return false;
	}
}
